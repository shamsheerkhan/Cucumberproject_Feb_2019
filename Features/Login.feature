Feature: this feature is designed to perform proof of concept of login module of automation practice website

@MyScenario
Scenario Outline:: create an account

Given user has to launch the browser browser name "chrome" and url "http://automationpractice.com/index.php" and navigate to login page
Then user has to enter "<valid email id>" click on Create An Account  button
Then user has to fill personal information section fields "<gender>","<firstname>","<lastname>","<password>","<date of birth>"
Then user has to fill the Address section fields "<company>","<Address>","<city>","<state>","<zipcode>","<mobileno.>"
Then user can able to click on Register button and has navigate to My Account Page and signout from that page
Then user has able to validate SignIn functionality by entering email id and "<password>" which he has created before
And Quit the Browser

Examples:
|valid email id|gender|firstname|lastname|password|date of birth|company|Address|city|state|zipcode|mobileno.|
|ab_AB|Mr|raghu|erra|01a@2109|2-2-1991|testing masters|Gayatri Hostel|Hyderabad|Washington|98001|9041523561|
