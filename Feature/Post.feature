Feature: Post the user 


@post
Scenario: User want to post the data into the database
Given User want to pass the data into the database
When User want to pass the data by using URI "http://localhost:8080/customers" 
Then User want to validate status code 500

