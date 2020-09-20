FROM openjdk:8
ADD build/libs/Docker-SpringBoot-0.0.1.jar Docker-SpringBoot-0.0.1.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","Docker-SpringBoot-0.0.1.jar"]