FROM openjdk:11
EXPOSE 8080
ADD target/camel-consumer-0.0.1-SNAPSHOT.jar camel-consumer-0.0.1-SNAPSHOT.jar 
ENTRYPOINT ["java","-jar","/camel-consumer-0.0.1-SNAPSHOT.jar"]
