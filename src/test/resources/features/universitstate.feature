@API_Test
Feature: To get data from the end point
  Scenario: To get the University state of Wits

    Given set up the endpoint TC02v2
    When to get get request TC02v2
    Then get the university state of wits TC02v2