FROM amazoncorretto:17-alpine-jdk
COPY . .
RUN ./gradlew build
COPY . build/
CMD ["./gradlew", "run"]