#!/usr/bin/env sh
## DucQuoc - micro bench to check laptop to buy
BASE_DIR=`dirname "$0"` && BASE_DIR=$(cd $BASE_DIR; pwd)
COUNT=3 && if [ ! -z "$1" ]; then COUNT="$1"; fi

cd "$BASE_DIR"
date

for i in `seq 1 $COUNT`; do ( 
  #time mvn clean install -f "$BASE_DIR"/cc-dq/execute-cc/pom.xml 
  mvn clean install -B -V -f cc-dq/execute-cc/pom.xml
); done

date
cd -

