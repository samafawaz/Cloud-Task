# Simple Java Calculator

A simple Java application that demonstrates basic arithmetic operations with unit tests and CI/CD pipeline.

## Features
- Basic arithmetic operations (add, subtract, multiply, divide)
- Unit tests using JUnit 5
- Maven build configuration
- Jenkins pipeline for CI/CD

## Prerequisites
- Java 11 or higher
- Maven 3.6.0 or higher
- Jenkins (for CI/CD pipeline)

## Building the Project
```bash
mvn clean package
```

## Running Tests
```bash
mvn test
```

## Jenkins Pipeline
1. Install the following Jenkins plugins:
   - Maven Integration
   - Pipeline
   - JUnit

2. Configure JDK and Maven in Jenkins Global Tool Configuration

3. Create a new Pipeline job in Jenkins and point it to the Jenkinsfile in your repository

## Project Structure
```
simple-java-app/
├── src/main/java/com/example/Calculator.java
├── src/test/java/com/example/CalculatorTest.java
├── pom.xml
├── Jenkinsfile
└── README.md
```
