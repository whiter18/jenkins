FROM openjdk:11
WORKDIR /var/lib/jenkins/workspace/jenkins
ARG JAR_FILE=jenkins.jar
COPY ${JAR_FILE} /var/lib/jenkins/workspace/jenkins.jar
CMD java -jar jenkins.jar