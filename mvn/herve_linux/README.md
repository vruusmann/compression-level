```
$ mvn --version
Apache Maven 3.9.9 (8e8579a9e76f7d015ee5ec7bfcdc97d260186937)
Maven home: /home/herve/.sdkman/candidates/maven/current
Java version: 11.0.19, vendor: Eclipse Adoptium, runtime: /home/herve/.sdkman/candidates/java/11.0.19-tem
Default locale: fr_FR, platform encoding: UTF-8
OS name: "linux", version: "6.8.0-52-generic", arch: "amd64", family: "unix"
```
```
$ hostnamectl
 Static hostname: orchid
       Icon name: computer-desktop
         Chassis: desktop 🖥️
      Machine ID: 54aa5468e6f645d2a13cc8e0e29d9ff1
         Boot ID: 63885aec9ba042dd88d503f013ea9613
Operating System: Ubuntu 24.04.2 LTS
          Kernel: Linux 6.8.0-52-generic
    Architecture: x86-64
 Hardware Vendor: Dell Inc.
  Hardware Model: Precision 3660
Firmware Version: 2.21.2
   Firmware Date: Wed 2024-12-04
    Firmware Age: 2month 1w 5d
```
```
$ lscpu
Architecture:                         x86_64
CPU op-mode(s):                       32-bit, 64-bit
Address sizes:                        46 bits physical, 48 bits virtual
Byte Order:                           Little Endian
CPU(s):                               24
On-line CPU(s) list:                  0-23
Vendor ID:                            GenuineIntel
Model name:                           12th Gen Intel(R) Core(TM) i9-12900K
CPU family:                           6
Model:                                151
Thread(s) per core:                   2
Core(s) per socket:                   16
Socket(s):                            1
Stepping:                             2
CPU(s) scaling MHz:                   30%
CPU max MHz:                          5200,0000
CPU min MHz:                          800,0000
BogoMIPS:                             6374,40
Flags:                                fpu vme de pse tsc msr pae mce cx8 apic sep mtrr pge mca cmov pat pse36 clflush dts acpi mmx fxsr sse sse2 ss ht tm pbe syscall nx pdpe1gb rdtscp lm constant_tsc art arch_perfmon pebs bts rep_good nopl xtopology nonstop_tsc cpuid aperfmperf tsc_known_freq pni pclmulqdq dtes64 monitor ds_cpl vmx smx est tm2 ssse3 sdbg fma cx16 xtpr pdcm pcid sse4_1 sse4_2 x2apic movbe popcnt tsc_deadline_timer aes xsave avx f16c rdrand lahf_lm abm 3dnowprefetch cpuid_fault epb ssbd ibrs ibpb stibp ibrs_enhanced tpr_shadow flexpriority ept vpid ept_ad fsgsbase tsc_adjust bmi1 avx2 smep bmi2 erms invpcid rdseed adx smap clflushopt clwb intel_pt sha_ni xsaveopt xsavec xgetbv1 xsaves split_lock_detect user_shstk avx_vnni dtherm ida arat pln pts hwp hwp_notify hwp_act_window hwp_epp hwp_pkg_req hfi vnmi umip pku ospke waitpkg gfni vaes vpclmulqdq tme rdpid movdiri movdir64b fsrm md_clear serialize pconfig arch_lbr ibt flush_l1d arch_capabilities
Virtualization:                       VT-x
L1d cache:                            640 KiB (16 instances)
L1i cache:                            768 KiB (16 instances)
L2 cache:                             14 MiB (10 instances)
L3 cache:                             30 MiB (1 instance)
NUMA node(s):                         1
NUMA node0 CPU(s):                    0-23
Vulnerability Gather data sampling:   Not affected
Vulnerability Itlb multihit:          Not affected
Vulnerability L1tf:                   Not affected
Vulnerability Mds:                    Not affected
Vulnerability Meltdown:               Not affected
Vulnerability Mmio stale data:        Not affected
Vulnerability Reg file data sampling: Mitigation; Clear Register File
Vulnerability Retbleed:               Not affected
Vulnerability Spec rstack overflow:   Not affected
Vulnerability Spec store bypass:      Mitigation; Speculative Store Bypass disabled via prctl
Vulnerability Spectre v1:             Mitigation; usercopy/swapgs barriers and __user pointer sanitization
Vulnerability Spectre v2:             Mitigation; Enhanced / Automatic IBRS; IBPB conditional; RSB filling; PBRSB-eIBRS SW sequence; BHI BHI_DIS_S
Vulnerability Srbds:                  Not affected
Vulnerability Tsx async abort:        Not affected
```
