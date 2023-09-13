FROM openjdk:17-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container at /app
COPY build/libs/MelbourneClassApi-0.0.1-SNAPSHOT.jar /app/

# Expose the port that your Spring Boot application will listen on (default is 8080)
EXPOSE 8080

# Specify the command to run your application when the container starts
CMD ["java", "-jar", "MelbourneClassApi-0.0.1-SNAPSHOT.jar"]