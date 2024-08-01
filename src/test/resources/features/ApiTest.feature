Feature: API Testing with RestAssured, TestNG, and Cucumber

  Scenario: Verify API response status code
    Given I set up the API request
    When I send the request to the API
    Then I should receive a 200 status code
