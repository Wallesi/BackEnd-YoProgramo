FROM openjdk:17
MAINTAINER Wallesi
COPY /target/BackWaldemar-0.0.1-SNAPSHOT.jar BackWaldemar.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","BackWaldemar.jar"]