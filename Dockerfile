FROM openjdk:8
ADD target/first-springboot-0.0.1-SNAPSHOT.jar first-springboot.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "first-springboot.jar"]
