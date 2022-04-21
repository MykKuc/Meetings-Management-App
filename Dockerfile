FROM openjdk:11
ADD target/visma-meeting-app-withdb-0.0.1-SNAPSHOT.jar visma-meeting-app-withdb-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","visma-meeting-app-withdb-0.0.1-SNAPSHOT.jar"]