#!/bin/sh

set -x

version=`cd $project_loc && mvn org.apache.maven.plugins:maven-help-plugin:2.1.1:evaluate -Dexpression=project.version | sed -n -e '/^\[.*\]/ !{ /^[0-9]/ { p; q } }'`

branch= git branch --no-color 2> /dev/null | sed -e '/^[^*]/d' -e 's/* \(.*\)/(\1)/'

git add .

git commit -a -m "commit push branch ${branch} of version ${version}"

git push origin ${branch}

echo "branch ${branch} of version ${version} push success"
