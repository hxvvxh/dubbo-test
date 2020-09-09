#!/bin/sh

set -x

version=$1

online=$2

branch= git branch --no-color 2> /dev/null | sed -e '/^[^*]/d' -e 's/* \(.*\)/(\1)/'

yes="y"

no="n"

git pull

if [ ${online} = ${yes} ]
then
    mvn versions:set -DnewVersion=${version}

    find ./ -name *.versionsBackup | xargs rm -rf

    git add .

    git commit -a -m "Update version to ${version}"

    #git tag -a ${version} -m "${version}"

    #git push origin ${version}

    git push origin ${branch}

    echo "change vesion to ${version} push success"
elif [ ${online} = ${no} ]
then
    mvn versions:set -DnewVersion=${version}

    echo "change vesion to ${version} with not push"
else
    echo "command error"
fi