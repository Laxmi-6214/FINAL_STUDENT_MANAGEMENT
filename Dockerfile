FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

COPY . .

RUN mvn clean package -DskipTests

CMD ["java", "-jar", "target/studentmanagement-0.0.1-SNAPSHOT.jar"]
