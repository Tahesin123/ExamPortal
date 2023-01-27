FROM openjdk:19
COPY target/examportal-0.0.1-SNAPSHOT.jar examportal-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "examportal-0.0.1-SNAPSHOT.jar"]
