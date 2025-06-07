#!/bin/bash
set -e

echo "[INFO] Copying student code..."
cp -r ../student/src/main/java/* src/main/java/

echo "[INFO] Running tests..."
mvn clean test
