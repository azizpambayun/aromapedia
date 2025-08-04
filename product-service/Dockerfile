FROM eclipse-temurin:21-jdk-jammy as builder
WORKDIR /app
COPY . .
RUN ./mvnw clean install -DskipTests

FROM eclipse-temurin:21-jre-jammy
RUN apt-get update && apt-get install -y postgresql-client
WORKDIR /app
COPY --from=builder /app/target/product-service-0.0.1-SNAPSHOT.jar .
EXPOSE 8081
COPY entrypoint.sh .
RUN chmod +x entrypoint.sh
CMD ["./entrypoint.sh"]
