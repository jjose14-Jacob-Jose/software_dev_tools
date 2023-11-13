FROM maven:3.8.4-openjdk-17-slim AS build
LABEL authors="Jacob Jose"
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean install -DskipTests

FROM openjdk:22-oraclelinux8
WORKDIR /app
COPY --from=build app/target/*.jar app.jar
CMD ["java", "-jar", "app.jar"]