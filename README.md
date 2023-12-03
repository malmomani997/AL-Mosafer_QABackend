# AL-Mosafer BE QA Framework

## Overview

The AlMosafer BE Framework is a Java-based framework designed to facilitate the testing of backend functionalities for the AlMosafer application. It leverages popular libraries such as Cucumber, Rest Assured, and Jackson Databind to provide a robust testing solution.

## Project Structure

The project is organized into several packages, each serving a specific purpose:

- **cucumber.Options:** Contains the TestRunner class that orchestrates the execution of Cucumber tests.
- **pojo.searchChalet:** Defines Plain Old Java Objects (POJOs) related to search functionality.
- **resources:** Includes utility classes for test data creation and common functions.
- **stepDefinitions:** Contains step definitions for Cucumber scenarios.

## Cucumber Features

### Search Functionality

#### Scenario Outline: Search for Chalet

- Given when the user selects a city for a chalet with `<id>` with `<checkIn>` and `<checkOut>` dates
- When the user searches for the wanted chalet
- Then verifies all the available chalets are being returned
- And verifies the data for the correct city is being returned

**Examples:**

| id  | checkIn    | checkOut   |
|----|------------|------------|
| 24 | 2023-12-07 | 2023-12-15 |
| 40 | 2023-12-09 | 2023-12-12 |
| 25 | 2023-12-22 | 2023-12-26 |
| 100 | 2024-01-05 | 2024-01-11 |
| 9 | 2023-12-17 | 2023-12-20 |

### Verify Cities Data for the Chalet Section

#### Scenario Outline: Verify Cities Data

- Given the user clicks on the list cities option
- When the list gets opened
- Then verifies the cities data with `<cityId>` and `<cityName>` also with the following `<cityRank>`

**Examples:**

| cityId | cityName                    | cityRank |
|--------|-----------------------------|----------|
| 40     | Ar Rass                     | 14       |
| 99     | King Abdullah Economic City | 13       |
| 44     | Dammam                      | 3        |
| 64     | Hail                        | 5        |
| 29     | Abha                        | 9        |
| 25     | Makkah                      | 4        |
| ...    | ...                         | ...      |

## Framework Components

### 1. Utils Class

- Provides common utility functions for the testing framework.
- Implements methods for creating request specifications, handling responses, and reading properties.

### 2. TestDataBuild Class

- Builds test data for the search functionality.
- Creates a `SearchRequest` object with specified parameters.

### 3. SearchRequest and SearchCriterion POJOs

- Represent data structures for search requests and criteria.

### 4. GetCityResponse POJO

- Represents the response structure for city data.

## Dependencies

- **Cucumber Java:** 7.14.1
- **Cucumber JUnit:** 7.14.1
- **Rest Assured:** 5.3.2
- **Cucumber Reporting:** 5.7.7
- **Jackson Databind:** 2.16.0

## Configuration
Base URL and other configurations can be set in the global.properties file located in src/test/java/resources.

## Reporting 
Navigate to the Target package and look for **overview-features.html** copy the path and open it on the browser 

- **File location**
![idea64_FpjGsWBTtG](https://github.com/malmomani997/AL-Mosafer_QABackend/assets/145292080/196745b3-6148-4120-9739-e85c1b8b4ace)

- **The Generated Report**
![chrome_GSecOg5vPK](https://github.com/malmomani997/AL-Mosafer_QABackend/assets/145292080/7fe0741d-4d54-4868-bca7-6a4d2c63f290)

## Build and Run

To build the project and generate report, run:

```bash
mvn test verify 
