```
$ mvn --version
Apache Maven 3.9.9 (8e8579a9e76f7d015ee5ec7bfcdc97d260186937)
Maven home: /opt/apache-maven-3.9.9
Java version: 11.0.26, vendor: OpenLogic-OpenJDK, runtime: /opt/openjdk-11.0.26+4-linux-x64
Default locale: et_EE, platform encoding: UTF-8
OS name: "linux", version: "4.8.13-100.fc23.x86_64", arch: "amd64", family: "unix"
```

```
$ hostnamectl
   Static hostname: localhost.localdomain
         Icon name: computer-laptop
           Chassis: laptop
        Machine ID: <redacted>
           Boot ID: <redacted>
  Operating System: Fedora 23 (Twenty Three)
       CPE OS Name: cpe:/o:fedoraproject:fedora:23
            Kernel: Linux 4.8.13-100.fc23.x86_64
      Architecture: x86-64
```

```
$ lscpu
Architecture:          x86_64
CPU op-mode(s):        32-bit, 64-bit
Byte Order:            Little Endian
CPU(s):                4
On-line CPU(s) list:   0-3
Thread(s) per core:    2
Core(s) per socket:    2
Socket(s):             1
NUMA node(s):          1
Vendor ID:             GenuineIntel
CPU family:            6
Model:                 42
Model name:            Intel(R) Core(TM) i5-2540M CPU @ 2.60GHz
Stepping:              7
CPU MHz:               804.565
CPU max MHz:           3300,0000
CPU min MHz:           800,0000
BogoMIPS:              5182.96
Virtualization:        VT-x
L1d cache:             32K
L1i cache:             32K
L2 cache:              256K
L3 cache:              3072K
NUMA node0 CPU(s):     0-3
Flags:                 fpu vme de pse tsc msr pae mce cx8 apic sep mtrr pge mca cmov pat pse36 clflush dts acpi mmx fxsr sse sse2 ss ht tm pbe syscall nx rdtscp lm constant_tsc arch_perfmon pebs bts nopl xtopology nonstop_tsc aperfmperf eagerfpu pni pclmulqdq dtes64 monitor ds_cpl vmx smx est tm2 ssse3 cx16 xtpr pdcm pcid sse4_1 sse4_2 x2apic popcnt tsc_deadline_timer aes xsave avx lahf_lm epb tpr_shadow vnmi flexpriority ept vpid xsaveopt dtherm ida arat pln pts
```