Feature: get the customer with id

@GETWithID
Scenario: User want to get the data from database

When User able to get the data by using URI "http://localhost:8080/customers/38" 
Then User want to validate  status code 200
