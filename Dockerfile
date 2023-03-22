FROM openjdk:11
ADD target/scientific_calc-1.0-SNAPSHOT.jar scientific_calc-1.0-SNAPSHOT.jar
CMD ["java" , "-jar" , "target/scientific_calc-1.0-SNAPSHOT-jar-with-dependencies.jar"]