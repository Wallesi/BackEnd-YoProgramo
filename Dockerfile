FROM amazoncorretto:11-alpine-jdk 
MAINTAINER Waldemar 
COPY  target/BackWaldemar-0.0.1-SNAPSHOT.jar waldi-app.jar   
ENTRYPOINT ["java","-jar","/waldi-app.jar"] 