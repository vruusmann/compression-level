#!/bin/bash

name="$1"
if [ -z "$name" ]
then
    echo "usage: $0 <env_id>"
else
    function dumpInfo() {
        command=$1

        [ -f mvn/$name/README.md ] && echo >> $name/README.md
        echo "\`\`\`" >> $name/README.md
        echo "$ $command" >> $name/README.md
        eval "$command" >> $name/README.md
        echo "\`\`\`" >> $name/README.md
    }

    echo "====== Testing '$name' environment: results to mvn/$name and zip/$name"

    echo "   ====> mvn test"
    cd mvn
    {
        [ -d $name ] && \rm -rf $name
        mkdir $name

        dumpInfo "mvn --version" 
        mvn --version
        dumpInfo hostnamectl
        dumpInfo lscpu

        mvn -q clean package
        cp -v target/*.jar $name
        unzip -v target/*.jar > $name/unzip-v.txt
        zipdetails target/*.jar > $name/zipdetails.txt
    }

    echo "   ====> zip test"
    cd ../zip
    {
        [ -d $name ] && \rm -rf $name
        mkdir $name

        dumpInfo "zip --version"
        for c in 1 3 5 7 9
        do
            [ -f $name/text-$c.zip ] && rm $name/text-$c.zip
            zip -$c $name/text-$c.zip test.txt
        done
    }

    cd ..

    git status
fi

echo "====== Comparing results from available environments"

for f in mvn/*/unzip-v.txt ; do echo $f ; cat $f | grep -v Stored ; done
for c in 1 3 5 7 9 ; do echo ; ls -l zip/*/*$c.zip ; done
