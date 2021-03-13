FROM openjdk:8
COPY ./target/ScientificCalculatorDevOps-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-cp", "ScientificCalculatorDevOps-1.0-SNAPSHOT.jar","Calculator"]