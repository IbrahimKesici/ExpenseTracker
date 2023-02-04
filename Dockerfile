# Build Stage ---------------------------------------
FROM gradle:7-jdk17-alpine AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build -x test --no-daemon

# Package Stage -------------------------------------
FROM openjdk:17

WORKDIR /app
COPY --from=build /home/gradle/src/build/libs/*.jar ./

ENTRYPOINT ["java", "-jar", "./expense-tracker-0.0.1-SNAPSHOT.jar"]