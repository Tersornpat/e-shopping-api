FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY ./*.jar /app/e-shopping-api.jar
CMD ["java", "-jar", "e-shopping-api.jar"]