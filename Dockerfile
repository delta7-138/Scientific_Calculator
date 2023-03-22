FROM openjdk:11
ADD target/scientific_calc-1.0-SNAPSHOT-jar-with-dependencies.jar scientific_calc-1.0-SNAPSHOT-jar-with-dependencies.jar
CMD ["java" , "-jar" , "scientific_calc-1.0-SNAPSHOT-jar-with-dependencies.jar"]