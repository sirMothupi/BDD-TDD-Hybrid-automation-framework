@SpotifyAPI_Test
Feature: Get top five songs from spotify
  Scenario: Retrieve and review spotify songs

    Given user sets up the endpoint
    When user acces the spotify link
    Then user retrives top 5 songs