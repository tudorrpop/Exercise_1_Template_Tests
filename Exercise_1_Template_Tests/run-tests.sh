#!/bin/bash
set -e

echo "[INFO] Copying student code from src/exercises to test project..."
mkdir -p src/main/java
cp -r ../student/src/exercises/* src/main/java/

echo "[INFO] Running tests..."
mvn clean test
