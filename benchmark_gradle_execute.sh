#!/usr/bin/env sh
## DucQuoc - micro bench to check laptop to buy
BASE_DIR=`dirname "$0"` && BASE_DIR=$(cd $BASE_DIR; pwd)
COUNT=3 && if [ ! -z "$1" ]; then COUNT="$1"; fi

cd "$BASE_DIR"/cc-dq/execute-cc
date

for i in `seq 1 $COUNT`; do ( 
  #time gradle clean build -b "$BASE_DIR"/cc-dq/execute-cc/build.gradle 
  ./gradlew clean build install -b build.gradle
); done

date
cd -

