Feature: delete the customer

@Delete
Scenario: User want to delete the data from the database

When User able to delete the data by using URI "http://localhost:8080/customers/134" 
Then User is able to validate status code 404
