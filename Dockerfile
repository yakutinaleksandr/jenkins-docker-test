FROM amazoncorretto:11

COPY target/*.jar /app.jar

CMD ["java", "-jar", "/app.jar"]