FROM openjdk:11
EXPOSE 8080
ADD sptest.jar sptest.jar
ENTRYPOINT ["java","-jar","sptest.jar"]
