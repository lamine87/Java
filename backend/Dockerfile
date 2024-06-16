FROM gradle:8.7-jdk17 as build

ADD . backend/
RUN cd backend && gradle build --no-daemon

FROM eclipse-temurin:17-jre

COPY --from=build /home/gradle/backend/build/libs/*.jar /opt/app/

ENTRYPOINT ["java", "-jar", "/opt/app/helloworld-0.0.1-SNAPSHOT.jar"]