#!/bin/sh
mkdir -p target/classes/
javac -encoding "UTF-8" -classpath lib/servlet-api.jar -d target/classes/ src/main/java/com/order/*.java

