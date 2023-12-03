Feature: Search Functionality

  Scenario Outline: Search for Chalet
    Given when the user select city for chalet with <id> with "<checkIn>" and "<checkOut>" dates
    When The user search for the wanted chalet
    Then verify all the available chalets are being returned
    And verify the data for correct city is being returned


    Examples:

      | id  | checkIn    | checkOut   |
      | 24  | 2023-12-07 | 2023-12-15 |
      | 40  | 2023-12-09 | 2023-12-12 |
      | 25  | 2023-12-22 | 2023-12-26 |
      | 100 | 2024-01-05 | 2024-01-11 |
      | 9   | 2023-12-17 | 2023-12-20 |