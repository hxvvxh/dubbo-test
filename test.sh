#!/bin/sh

MVN_VERSION=$(mvn -q -N -Dexec.executable="echo"  -Dexec.args='${project.version}'  org.codehaus.mojo:exec-maven-plugin:1.3.1:exec)
  echo "${MVN_VERSION}"