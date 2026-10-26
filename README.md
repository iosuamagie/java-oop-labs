# Java OOP labs

![build](https://github.com/iosuamagie/java-oop-labs/actions/workflows/build.yml/badge.svg)

Java lab work from my Information Technology studies at Lucian Blaga University of Sibiu (ULBS). Each folder is one lab, numbered as it was in class (lab 4 is missing). Some identifiers and console messages are in Romanian.

| Lab | Topic | What it does |
|---|---|---|
| [01-inheritance-animals](01-inheritance-animals) | Interfaces, inheritance | An `Animale` interface with dog, cat and German shepherd classes that override its methods. |
| [02-shapes-polymorphism](02-shapes-polymorphism) | Abstract classes, `equals`/`hashCode` | Triangle, circle and square extend an abstract `Form`; each computes its own area and a static counter tracks how many shapes were created. |
| [03-password-generator](03-password-generator) | Singleton, static init blocks | Builds a random password from a random string, a substring of a "magic" string picked at class load, the name length and a random number. |
| [05-text-file-processing](05-text-file-processing) | File I/O | Reads `in.txt` with a `BufferedReader` and prints it one sentence per line. |
| [06-calculators-junit](06-calculators-junit) | Fluent API, abstract classes, JUnit 5 | Chainable int and double calculators (`add(5).subtract(3).multiply(2)`), with 12 unit tests including divide by zero. |
| [07-student-groups-junit](07-student-groups-junit) | Collections, iterators, JUnit 5 | A student group you can add to, search and remove from, tested with `@BeforeEach`/`@AfterEach`. |
| [08-excel-apache-poi](08-excel-apache-poi) | Apache POI | Reads an `.xlsx` file cell by cell and writes a new styled sheet of student grades. |
| [09-java-streams](09-java-streams) | Streams, lambdas | Sum, min, max, filter and map over a list of random numbers. |
| [10-strategy-pattern-sensors](10-strategy-pattern-sensors) | Strategy and Singleton patterns | Counts steps from fake sensor readings with either a basic strategy or one that keeps only positive readings from the last minute. |
| [11-json-jackson](11-json-jackson) | Jackson | Loads a list of people from JSON, adds a year to each age and writes the file back. |

## Running

You need JDK 21 and Maven.

Run every test from the repo root:

```
mvn test
```

Run one lab from its own folder (labs 05, 08 and 11 read files relative to it):

```
cd 02-shapes-polymorphism
mvn -q compile exec:java
```

You can also open the root folder in IntelliJ IDEA, which picks up all the labs from `pom.xml`.
