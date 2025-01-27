FROM bellsoft/liberica-runtime-container:jre-21-stream-musl
COPY target/*.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "/app.jar"]

