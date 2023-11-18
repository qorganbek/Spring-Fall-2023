FROM maven:latest as builder

WORKDIR /app

COPY . .

RUN mvn clean package -DskipTests

FROM openjdk:22-slim-bullseye

WORKDIR /app

COPY --from=builder /app/target/soap-0.0.1-SNAPSHOT.jar .

EXPOSE 8080

CMD ["java", "-jar", "soap-0.0.1-SNAPSHOT.jar"]