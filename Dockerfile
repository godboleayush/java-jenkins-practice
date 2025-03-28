# Use a base image with OpenJDK
FROM openjdk:23-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the jar file from the target folder (after building the app)
COPY target/demoProject-0.0.1-SNAPSHOT.jar app.jar

# Expose port 8080 (default port for Spring Boot)
EXPOSE 8080

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]
