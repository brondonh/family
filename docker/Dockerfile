FROM openjdk:8-jdk-alpine

MAINTAINER BrayanRondonH

VOLUME /tmp
COPY target/*.jar /app.jar

EXPOSE 8080
ENTRYPOINT java -jar app.jar