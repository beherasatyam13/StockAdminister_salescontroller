Feature: Get By id Request
@GetByid
Scenario: User want to read the data by using id from database
When User want to read  the data by using id URI "http://localhost:8080/sales?id=2"
Then User want to verify id status line "HTTP/1.1 200"
And User want to verify status code is 200
