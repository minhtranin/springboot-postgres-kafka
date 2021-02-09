FROM openjdk:13-alpine
EXPOSE 8080
COPY . .
RUN mvn clean package
ADD target/spring-boot-docker.jar spring-boot-docker.jar
ENTRYPOINT ["java","-jar","/spring-boot-docker.jar"]
