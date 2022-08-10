FROM openjdk:11
WORKDIR /var/lib/jenkins/workspace/jenkins
ARG JAR_FILE=jenkins.jar
COPY ${JAR_FILE} /var/lib/jenkins/workspace/target/jenkins-0.0.1-SNAPSHOT.jar
ARG mongoId
ARG mongoIP
ARG mongoPw
ARG mongodbName


CMD java -Dmongoip=mongoIp -Dmongoid=mongoID -Dmongopw=mongoPw -DmongodbName=mongodbname -jar jenkins.jar