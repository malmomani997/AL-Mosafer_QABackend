Feature: verify cities data for the chalet section

  Scenario Outline:
    Given the user clicks on the list cities option
    When the list gets opened
    Then verify the cities data with <cityId> and "<cityName>" also with the following <cityRank>


    Examples:

      | cityId |  | cityName                    | cityRank |
      | 40     |  | Ar Rass                     | 14       |
      | 99     |  | King Abdullah Economic City | 13       |
      | 44     |  | Dammam                      | 3        |
      | 64     |  | Hail                        | 5        |
      | 29     |  | Abha                        | 9        |
      | 25     |  | Makkah                      | 4        |
      | 41     |  | Buraydah                    | 11       |
      | 22     |  | Taif                        | 6        |
      | 24     |  | Jeddah                      | 2        |
      | 100    |  | Medina                      | 5        |
      | 89     |  | AlUla                       | 4        |
      | 77     |  | Tabuk                       | 11       |
      | 9      |  | Riyadh                      | 1        |
      | 58     |  | Dhahran                     | 7        |
      | 98     |  | Yanbu                       | 10       |
      | 47     |  | Alahsaa                     | 8        |
      | 50     |  | Al Khobar                   | 5        |
      | 80     |  | Al Bahah                    | 9        |
      | 42     |  | Unayzah                     | 12       |
