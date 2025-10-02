Feature: Login

Scenario: Successful login with valid credential
Given user launch chrome browser
When user opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
And user enters username as "Admin" and password as "admin123"
And user click on login button
Then User successfully redirect to  the dashboard
