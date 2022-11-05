Feature: Get By name Request

Scenario: User want to read the data by using name from database
When User want to read name by using name URI "http://localhost:8080/sales?name=satyam"
Then User want to verify name Statusline "HTTP/1.1 200"
And User want to verify StatusCode is 200

