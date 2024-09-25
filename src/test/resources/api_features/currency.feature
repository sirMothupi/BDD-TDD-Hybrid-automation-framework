@API_Test
Feature: To get data from the end point
  Scenario: To get the conversion rate for the given currency

    Given set up the endpoint TC01v2
    When to get get request TC01v2
    Then get the conversion rate for a given currency and verify it TC01v2