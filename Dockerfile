# config-service/Dockerfile
FROM openjdk:17-jdk-slim

# Instalar curl para health checks
RUN apt-get update && apt-get install -y curl && rm -rf /var/lib/apt/lists/*

WORKDIR /app

COPY target/credit-card-processor-service-0.0.1-SNAPSHOT.jar credit-card-processor-service.jar

EXPOSE 8085

ENTRYPOINT ["java", "-jar", "config-service.jar"]