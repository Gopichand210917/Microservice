# Use a base image with Java pre-installed
FROM openjdk:11-jre-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from your local machine to the container
COPY myapp.jar /app/myapp.jar

# Command to run the Java application
CMD ["java", "-jar", "myapp.jar"]