#!/bin/bash
set -e

echo "[INFO] Copying student code from student repo to test project..."
mkdir -p src/main/java
cp -r ../../student/Exercise_1_Template/src/* src/main/java/

echo "[INFO] Running tests..."
mvn clean test -Dmaven.test.failure.ignore=true
