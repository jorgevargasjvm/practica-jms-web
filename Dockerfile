FROM openjdk:11.0.8-jre-slim

EXPOSE 8080 61616

LABEL maintainer="Jorge Vargas <jorgevargasmateo@hotmail.com>"

COPY /build/libs/PracticaJMSWeb-0.0.1-SNAPSHOT.jar practicajmsweb.jar

ENTRYPOINT ["java", "-jar", "practicajmsweb.jar"]