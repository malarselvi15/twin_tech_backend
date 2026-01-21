FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY . .

RUN chmod +x mvnw
RUN ./mvnw clean package

EXPOSE 8080

# Find the JAR dynamically and run
ENTRYPOINT ["sh", "-c", "java -jar target/*.jar"]
