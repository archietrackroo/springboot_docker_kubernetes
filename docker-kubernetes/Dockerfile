FROM openjdk:17
EXPOSE 8080
ADD target/docker-kubernetes.jar docker-kubernetes.jar
ENTRYPOINT ["java","jar","docker-kubernetes.jar"]