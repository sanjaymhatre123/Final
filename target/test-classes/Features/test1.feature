Feature: Application Log in 

Scenario: Valid Login
Given With initalizing chrome Driver
And navigating to Home page via "http://automationpractice.com/index.php"
And after coming to Login Page
When entering "vin@test.com" and "Sanjay123#"
Then validate login is successull



