FROM openjdk:17

WORKDIR myapp

COPY ./src/main/java /myapp

RUN javac org/example/*.java

EXPOSE 8080

CMD ["java", "org.example.Main"]

