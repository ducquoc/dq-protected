#!/usr/bin/env sh
## DucQuoc - micro bench to check laptop to buy
BASE_DIR=`dirname "$0"`
COUNT=3 && if [ ! -z "$1" ]; then COUNT="$1"; fi

cd $BASE_DIR
date

for i in `seq 1 $COUNT`; do ( 
  #time ./gradlew clean build
  ./gradlew clean build install 
); done

date
cd -

