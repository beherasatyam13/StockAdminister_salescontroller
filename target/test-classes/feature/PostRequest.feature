Feature: PostRequest


Scenario: User want to post the data into database
Given User want to pass the data into database
When User want to pass the data by using URI "http://localhost:8080/sales"
Then User want to validate status line "HTTP/1.1 200"
And User want to validate status code 200


