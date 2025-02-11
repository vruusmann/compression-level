```
$ mvn --version
Apache Maven 3.9.9 (8e8579a9e76f7d015ee5ec7bfcdc97d260186937)
Maven home: /opt/apache-maven-3.9.9
Java version: 11.0.26, vendor: OpenLogic-OpenJDK, runtime: /opt/openjdk-11.0.26+4-linux-x64
Default locale: en_US, platform encoding: UTF-8
OS name: "linux", version: "6.12.11-200.fc41.x86_64", arch: "amd64", family: "unix"
```

```
$ hostnamectl
     Static hostname: localhost
  Transient hostname: fedora
           Icon name: computer-laptop
             Chassis: laptop 💻
          Machine ID: <redacted>
             Boot ID: <redacted>
    Operating System: Fedora Linux 41 (Workstation Edition)
         CPE OS Name: cpe:/o:fedoraproject:fedora:41
      OS Support End: Mon 2025-12-15
OS Support Remaining: 10month 1d
              Kernel: Linux 6.12.11-200.fc41.x86_64
        Architecture: x86-64
     Hardware Vendor: Lenovo
      Hardware Model: ThinkPad P1 Gen 7
    Firmware Version: N48ET23W (1.10 )
       Firmware Date: Mon 2024-10-28
        Firmware Age: 3month 2w 1d
```

```
$ lscpu
Architecture:             x86_64
  CPU op-mode(s):         32-bit, 64-bit
  Address sizes:          46 bits physical, 48 bits virtual
  Byte Order:             Little Endian
CPU(s):                   22
  On-line CPU(s) list:    0-21
Vendor ID:                GenuineIntel
  Model name:             Intel(R) Core(TM) Ultra 9 185H
    CPU family:           6
    Model:                170
    Thread(s) per core:   2
    Core(s) per socket:   16
    Socket(s):            1
    Stepping:             4
    CPU(s) scaling MHz:   18%
    CPU max MHz:          5100.0000
    CPU min MHz:          400.0000
    BogoMIPS:             6144.00
    Flags:                fpu vme de pse tsc msr pae mce cx8 apic sep mtrr pge mca cmov 
                          pat pse36 clflush dts acpi mmx fxsr sse sse2 ss ht tm pbe sysc
                          all nx pdpe1gb rdtscp lm constant_tsc art arch_perfmon pebs bt
                          s rep_good nopl xtopology nonstop_tsc cpuid aperfmperf tsc_kno
                          wn_freq pni pclmulqdq dtes64 monitor ds_cpl vmx smx est tm2 ss
                          se3 sdbg fma cx16 xtpr pdcm pcid sse4_1 sse4_2 x2apic movbe po
                          pcnt tsc_deadline_timer aes xsave avx f16c rdrand lahf_lm abm 
                          3dnowprefetch cpuid_fault epb intel_ppin ssbd ibrs ibpb stibp 
                          ibrs_enhanced tpr_shadow flexpriority ept vpid ept_ad fsgsbase
                           tsc_adjust bmi1 avx2 smep bmi2 erms invpcid rdseed adx smap c
                          lflushopt clwb intel_pt sha_ni xsaveopt xsavec xgetbv1 xsaves 
                          split_lock_detect user_shstk avx_vnni dtherm ida arat pln pts 
                          hwp hwp_notify hwp_act_window hwp_epp hwp_pkg_req hfi vnmi umi
                          p pku ospke waitpkg gfni vaes vpclmulqdq rdpid bus_lock_detect
                           movdiri movdir64b fsrm md_clear serialize pconfig arch_lbr ib
                          t flush_l1d arch_capabilities
Virtualization features:  
  Virtualization:         VT-x
Caches (sum of all):      
  L1d:                    544 KiB (14 instances)
  L1i:                    896 KiB (14 instances)
  L2:                     18 MiB (9 instances)
  L3:                     24 MiB (1 instance)
NUMA:                     
  NUMA node(s):           1
  NUMA node0 CPU(s):      0-21
Vulnerabilities:          
  Gather data sampling:   Not affected
  Itlb multihit:          Not affected
  L1tf:                   Not affected
  Mds:                    Not affected
  Meltdown:               Not affected
  Mmio stale data:        Not affected
  Reg file data sampling: Not affected
  Retbleed:               Not affected
  Spec rstack overflow:   Not affected
  Spec store bypass:      Mitigation; Speculative Store Bypass disabled via prctl
  Spectre v1:             Mitigation; usercopy/swapgs barriers and __user pointer saniti
                          zation
  Spectre v2:             Mitigation; Enhanced / Automatic IBRS; IBPB conditional; RSB f
                          illing; PBRSB-eIBRS Not affected; BHI BHI_DIS_S
  Srbds:                  Not affected
  Tsx async abort:        Not affected
```