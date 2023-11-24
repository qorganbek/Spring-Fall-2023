FROM maven:latest as builder

WORKDIR /app

COPY . .

RUN mvn clean package -DskipTests

FROM openjdk:22-slim-bullseye

WORKDIR /app

COPY --from=builder /app/target/soap-0.0.1-SNAPSHOT.jar .

ARG PORT=8080

ENV PORT=${PORT}

EXPOSE ${PORT}

CMD ["java", "-jar", "soap-0.0.1-SNAPSHOT.jar", "--server.port=${PORT}"]