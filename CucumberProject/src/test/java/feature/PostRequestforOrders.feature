Feature: Post Request for Orders

Scenario: User want to post data into database
Given User want to pass data into database
When User want to pass data by using URI "http://localhost:8080/orders"
Then User want to validate Statusline "HTTP/1.1 200"
And User want to validate StatusCode 200

 