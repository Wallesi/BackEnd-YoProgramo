FROM openjdk:17
COPY /target/BackWaldemar-0.0.1-SNAPSHOT.jar BackWaldemar.jar
ENTRYPOINT ["java","-jar","BackWaldemar.jar"]