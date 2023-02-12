#!/bin/bash

mvn compile
java -classpath target/classes:target/dependency/* bank.App
