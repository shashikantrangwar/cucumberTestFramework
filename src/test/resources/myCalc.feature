Feature: Calculator Operations
  Scenario Outline: Add two numbers <num1> and <num2>
    Given I have a calculator
    When I add <num1> and <num2>
    Then The result of addition is <Total>

    Examples:
    | num1 | num2 | Total |
    | 1    | 2      |  3  |
    | 1    | -2     |  -1 |
    | 199  |   1    |  200|

  Scenario Outline: Add two double numbers <num1> and <num2>
    Given I have a calculator
    When I add double numbers <num1> and <num2>
    Then The result of double number addition is <Total>

    Examples:
      | num1 | num2 | Total |
      | 1.5    | 1.5      |  3  |
      | 1.5    | -2.5     |  -1 |
      | 199.9  |   0.1    |  200|