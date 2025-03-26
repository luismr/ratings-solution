# Ratings Solution

A Java solution for calculating dish ratings and finding the dish with the highest average rating.

![Java](https://img.shields.io/badge/Java-17-blue.svg)
![Maven](https://img.shields.io/badge/Maven-3.6+-blue.svg)
![JUnit](https://img.shields.io/badge/JUnit-5-blue.svg)

## Description

This project provides a solution for processing dish ratings and determining the dish with the highest average rating. The solution is implemented in Java 17 and includes comprehensive unit tests using JUnit 5.

## Features

- Process multiple ratings for different dishes
- Calculate average ratings per dish
- Find the dish with the highest average rating
- Comprehensive test coverage

## Requirements

- Java 17 or higher
- Maven 3.6 or higher

## Project Structure

```
ratings/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── ratings/
│   │               └── Solution.java
│   └── test/
│       └── java/
│           └── com/
│               └── ratings/
│                   └── SolutionTest.java
├── pom.xml
├── README.md
├── LICENSE.md
└── .gitignore
```

## Getting Started

### Prerequisites

- Git
- Java 17 or higher
- Maven 3.6 or higher

### Installation

1. Clone the repository:
```bash
git clone git@github.com:luismr/ratings-solution.git
cd ratings-solution
```

2. Build the project:
```bash
mvn clean install
```

## Building the Project

To build the project, run:

```bash
mvn clean install
```

## Running Tests

To run the tests, use:

```bash
mvn test
```

## Executing the Solution

### Command Line Interface

After building the project, you can run the solution using:

```bash
java -cp target/ratings-solution-1.0-SNAPSHOT.jar com.ratings.Solution
```

The program expects input in the following format:
1. First line: number of ratings (n)
2. Following n lines: each line contains two integers separated by space
   - First integer: dish ID
   - Second integer: rating value

Example input:
```
3
1 5
2 3
1 4
```

### Programmatic Usage

You can also use the solution programmatically in your code:

```java
import com.ratings.Solution;

public class Example {
    public static void main(String[] args) {
        int[][] ratings = {
            {1, 5},
            {2, 3},
            {1, 4}
        };
        int result = Solution.solution(3, ratings);
        System.out.println("Dish with highest average rating: " + result);
    }
}
```

The `solution` method takes two parameters:
- `n`: the number of ratings
- `ratings`: a 2D array where each row contains `[dishId, rating]`

The method returns the ID of the dish with the highest average rating. If there are multiple dishes with the same highest average, it returns the dish with the smallest ID.

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details. 