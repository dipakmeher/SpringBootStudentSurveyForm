FROM openjdk:17-jdk-alpine
EXPOSE 8080 
# COPY env.properties env.properties
COPY target/springboot_rest_mysql_app-0.0.1-SNAPSHOT.jar finalJar.jar
ENTRYPOINT ["java","-jar","/finalJar.jar"]