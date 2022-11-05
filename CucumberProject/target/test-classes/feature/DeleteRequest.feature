Feature: Delete Request

Scenario: User want to delete id data from database
When User is able to delete the id by using an api "http://localhost:8080/sales?id=39"
Then User validate the delete status code of id is 404

