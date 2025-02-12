FROM eclipse-temurin:21
EXPOSE 8080
ADD /target/car-inventory-0.0.1-SNAPSHOT.jar car-inventory.jar
#ENTRYPOINT ["java", "-jar", "forum.jar"]
ENTRYPOINT ["java", "$JAVA_OPTS -XX:+UseContainerSupport", "-Xmx300m -Xss512k -XX:CICompilerCount=2", "-Dserver.port=$PORT", "-jar", "car-inventory.jar"]