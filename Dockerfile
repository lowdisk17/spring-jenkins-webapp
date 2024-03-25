FROM openjdk:23-slim-bullseye
EXPOSE 8888
ADD target/spring-jenkins-webapp.war spring-jenkins-webapp.war
ENTRYPOINT [ "java", "-jar", "/spring-jenkins-webapp.war" ]