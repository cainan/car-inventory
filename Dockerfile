FROM eclipse-temurin:21
EXPOSE 8090
ADD /target/car-inventory-0.0.1-SNAPSHOT.jar car-inventory.jar
ENTRYPOINT ["java", "-jar", "car-inventory.jar"]