#!/bin/sh

set -x

message=$1

result=`git branch | grep "*"`
branch=${result:2}

version=$(mvn -q -N -Dexec.executable="echo"  -Dexec.args='${project.version}'  org.codehaus.mojo:exec-maven-plugin:1.3.1:exec)

git add .

if [ ! -n  "$message" ];
then
    git commit -a -m "${message}"
else
    git commit -a -m "commit push branch ${branch} of version ${version}"
fi

git push origin ${branch}

echo "branch ${branch} of version ${version} push success"
