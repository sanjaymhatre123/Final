Feature: Application Log in 

Scenario Outline: Valid Login
Given With initalizing chrome Driver
And navigating to Home page via "http://automationpractice.com/index.php"
And after coming to Login Page
When entering <username> and <password>
Then validate login is successull


Examples:
|username          |password      |
|qa@test.com       |bad@123#      |
|vin@test.com      |Sanjay123#    |
|vin@test1.com     |Sanjay123#    |