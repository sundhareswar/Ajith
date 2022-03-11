Feature: To validate login page
Scenario: To validate longin by using valid email and invalid password
Given User have to enter facebook login through chrome browser
When User have to enter valid email and invalid password
And User have to click login button
Then User have to show invalid credentials page

Scenario Outline:To validate bulk of datas
Given User has to launch he brwser and hit the url
When User has to pass bulk "<Username>" of datas to username feild
And User has to pass bulk  "<Password>" of datas to password feild
And User has to click the login button
Then User has to close the browser

Examples:
|Username                 | Password    |
|Sundareswar808@gmail.com | Sundhar@123 |
|ajithice2622@gmail.com   | AJith@123   |
|sundharmathi26@gmmail.com| sundhar@123 |
|sundharajith26@gmail.com | Sundhauyrf  |