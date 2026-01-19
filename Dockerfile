
# PRODUCTION - READY
FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

COPY target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar"]

# =============== DEBUG ================================

# FROM eclipse-temurin:17-jdk-alpine

# WORKDIR /app

# COPY target/*.jar app.jar

# EXPOSE 8080 5005

# ENTRYPOINT ["java","-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005","-jar","app.jar"]
