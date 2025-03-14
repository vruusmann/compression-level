Investigations around hardware-dependent JAR compression level, as first reported in [JPMML-Model-42](https://github.com/jpmml/jpmml-model/issues/42).

ie. [`new_laptop`](mvn/new_laptop) gets different compression results from any other: [`old_laptop`](examples/old_laptop), [`mac_arm64`](examples/mac_arm64)

# Working hypothesis

The behaviour of the following piece of Java code is **hardware dependent** since JDK 11 (but not JDK 8), and only when `level < 9`!?

```java
java.util.zip.ZipOutputStream zipOs = ...

# Request compression level
zipOs.setLevel(level);
```

See https://github.com/vruusmann/compression-level/pull/3#issuecomment-2661363250

# Testing

Run:

```
./test-env.sh
```

to display comparison of provided environments results.

Run:

```
./test-env.sh <env_id>
```

to add your local environment as `env_id` before displaying comparison results.

## `mvn/`: Apache Maven build

The `mvn/` directory contains artifact JAR files built on different computers (`mvn clean package` to get result in `target/*.jar`).

The expectation is to see identical JAR files (eg. as perceived by the `diff` tool, or to dive into details `unzip -v` or `zipdetails`).

In reality, the results of the `new_laptop` are different from others: `unzip-v.txt` shows how the original entries size and CRC are the same, but not compressed size.

See [`mvn/new_laptop/unzip-v.txt`](mvn/new_laptop/unzip-v.txt):
```
 Length   Method    Size  Cmpr    Date    Time   CRC-32   Name
--------  ------  ------- ---- ---------- ----- --------  ----
      81  Defl:N       83  -3% 02-10-2025 18:00 0e762874  META-INF/MANIFEST.MF
    1417  Defl:N      521  63% 02-10-2025 18:00 a3bd4ce2  META-INF/maven/org.jpmml/compression-test/pom.xml
      67  Defl:N       67   0% 02-10-2025 18:00 e34d7449  META-INF/maven/org.jpmml/compression-test/pom.properties
```
`META-INF/MANIFEST.MF` has a negative compression: compressed size is bigger than original size...

Other environments like [`mvn/old_laptop/unzip-v.txt`](`mvn/old_laptop/unzip-v.txt`):
```
 Length   Method    Size  Cmpr    Date    Time   CRC-32   Name
--------  ------  ------- ---- ---------- ----- --------  ----
      81  Defl:N       81   0% 02-10-2025 18:00 0e762874  META-INF/MANIFEST.MF
    1417  Defl:N      516  64% 02-10-2025 18:00 a3bd4ce2  META-INF/maven/org.jpmml/compression-test/pom.xml
      67  Defl:N       65   3% 02-10-2025 18:00 e34d7449  META-INF/maven/org.jpmml/compression-test/pom.properties
```
have a better result.

Notice: compression is done using [`plexus-archiver`'s `JarArchiver`](https://github.com/codehaus-plexus/plexus-archiver/blob/master/src/main/java/org/codehaus/plexus/archiver/jar/JarArchiver.java), that uses `commons-compress`.

## `zip/` Command-line `zip`

For reference, the `zip` directory contains command-line zip compression results:

```
cd zip
zip -1 <computer>/text-1.zip test.txt
zip -3 <computer>/text-3.zip test.txt
zip -5 <computer>/text-5.zip test.txt
zip -7 <computer>/text-7.zip test.txt
zip -9 <computer>/text-9.zip test.txt
```

Results is that size of zip files is not dependent on environment: only Maven jar files are impacted.

## `java/` Java compression using `java.util.zip(.ZipOutputStream)`

For reference, the `java` directory contains Java programmatic compression results.

The compression target is the `zip/test.txt` file.
The compression is performed using different compression levels (odd values `1`, `3`, `5`, `7` and `9`).

Result shows that with JDK 8, results are consistent on old and new laptop. But with JDK 11+, compression levels < 9 give different results:

- old_laptop:
```
 Length   Method    Size  Cmpr    Date    Time   CRC-32   Name
--------  ------  ------- ---- ---------- ----- --------  ----
    2878  Defl:N     1297  55% 1970-01-01 01:00 a0b574ab  test-1.txt
    2878  Defl:N     1285  55% 1970-01-01 01:00 a0b574ab  test-3.txt
    2878  Defl:N     1239  57% 1970-01-01 01:00 a0b574ab  test-5.txt
    2878  Defl:N     1239  57% 1970-01-01 01:00 a0b574ab  test-7.txt
    2878  Defl:N     1239  57% 1970-01-01 01:00 a0b574ab  test-9.txt
--------          -------  ---                            -------
   14390             6299  56%                            5 files
```

- new_laptop:
```
 Length   Method    Size  Cmpr    Date    Time   CRC-32   Name
--------  ------  ------- ---- ---------- ----- --------  ----
    2878  Defl:N     1243  57% 1970-01-01 01:00 a0b574ab  test-1.txt
    2878  Defl:N     1234  57% 1970-01-01 01:00 a0b574ab  test-3.txt
    2878  Defl:N     1218  58% 1970-01-01 01:00 a0b574ab  test-5.txt
    2878  Defl:N     1218  58% 1970-01-01 01:00 a0b574ab  test-7.txt
    2878  Defl:N     1239  57% 1970-01-01 01:00 a0b574ab  test-9.txt
--------          -------  ---                            -------
   14390             6152  57%                            5 files
```

New laptop gives better compression results for compression levels 5 and 7 than 9???
Notice: luckily, compression level 9 gives same result on every hardware: only lower compression levels than 9 give a compression result varying based on hardware.
