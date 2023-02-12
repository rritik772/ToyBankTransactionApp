<h1 align="center">
ToyBankTransactionApp
</h1>

## Content
1. Preview
3. Prerequisite 
3. Installation
4. Manual Compilation

## Prerequisite
1. Java
2. maven 
## Run without Installation
1. Download jar file from release
2. run `java -jar filename.jar {username} {password}`
3. username and password are for planetscale database

## Manual Compilation
1. Git clone the repo
2. run `mvn clean install`
3. run `mvn dependency:copy-dependencies`
4. run `mvn clean compile assembly:single`
5. run `java -jar target/project-1.0-SNAPSHOT-jar-with-dependencies.jar {username} {password}` 
