# Steps

mvn clean
mvn evosuite:generate
mvn evosuite:export
mvn test
mvn evosuite:coverage
mvn clover:setup
mvn clover:clover