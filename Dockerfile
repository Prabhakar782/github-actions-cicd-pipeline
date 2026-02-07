FROM eclipse-temurin:21-jdk-alpine

# Set working directory
WORKDIR /app

# Copy the jar
COPY target/spring-boot-cicd.jar app.jar

# Expose port
EXPOSE 8181

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
## ---------- Build stage ----------
#FROM maven:3.9.6-eclipse-temurin-21 AS build
#
## Expose application port
#EXPOSE 8181
#
##ADD
#ADD target/spring-boot-cicd.jar spring-boot-cicd.jar
#
## Run the application
#ENTRYPOINT ["java", "-jar", "/spring-boot-cicd.jar"]