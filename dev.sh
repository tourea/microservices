#!/usr/bin/env bash

set -e
#set -x

# TODO: Add clean build start option

declare -a services=(
  "config"
  "api-gateway"
  "file-scan-service"
  )

echo "Step 1/3: Removing existing images"
#docker-compose rm && true

echo "Step 2/3: Building jars"
for i in "${services[@]}"
do
  cd $i
  ./gradlew clean
  ./gradlew build
  cd ..
done

echo "Step 3/3: Starting containers"
docker-compose up --build

#set +x
