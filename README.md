Investigations around hardware-dependent JAR compression level, as first reported in [JPMML-Model-42](https://github.com/jpmml/jpmml-model/issues/42).

# Apache Maven build #

The `examples` directory contains artifact JAR files built on different computers.

The expectation is to see identical JAR files (eg. as perceived by the `diff` tool).
In reality, the results of the `new_laptop` are different from others.

# Command-line zip #

For reference, the `text_examples` directory contains command-line zip compression results:

```
cd text_examples
zip -1 <computer>/text-1.zip test.txt
zip -3 <computer>/text-3.zip test.txt
zip -5 <computer>/text-5.zip test.txt
zip -7 <computer>/text-7.zip test.txt
zip -9 <computer>/text-9.zip test.txt
```