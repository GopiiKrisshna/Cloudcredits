# Use OpenJDK image
FROM openjdk:17-jdk-slim

# Set work directory inside container
WORKDIR /app

# Copy the built jar file into container
COPY target/DevOpsProject1-0.0.1-SNAPSHOT.jar app.jar

# Expose port (Spring Boot default is 8080)
EXPOSE 8080

# Command to run the jar
ENTRYPOINT ["java", "-jar", "app.jar"]
