FROM java:8
WORKDIR /
ADD AbstractFactory-1.0-SNAPSHOT.jar AbstractFactory-1.0-SNAPSHOT.jar
EXPOSE 8080
CMD java - jar AbstractFactory-1.0-SNAPSHOT.jar