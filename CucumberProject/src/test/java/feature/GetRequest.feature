Feature: Get Request

Scenario: User want to read the data from database
When User want to read the data by using URI "http://localhost:8080/sales"
Then User want to verify status line "HTTP/1.1 200"
And User want to verify status code 200