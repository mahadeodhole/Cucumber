Feature: get the all customer

@GETWithPhone
Scenario: User want to fetch the data into the database

When User able to pass the data by using URI "http://localhost:8080/customers?phone=8990290092" 
Then User able to validate status code 201