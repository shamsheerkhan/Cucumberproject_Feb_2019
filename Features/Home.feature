Feature: this Feature is designed to perform proof of concept on automation practice website 
Scenario: Launch Browserand validate Home page parameters
Given User has to launch the browser browsername "chrome" and Navigate to Home page url "http://automationpractice.com/index.php"
When As user should identify The Title of page as "My Store"
Then As an user should identify the Header parameters of Home Page 
Then As An user should identify the NavBar Parameters of Home page 
Then As An user should identify the Search section Parameters of Home page 
Then As an user should identify the cart section parameters of Home page
Then As an user should identify the tab section parameters of Home page
Then As an user should identify The Top Baner images should present in Home Page
Then As an user should identify The verifying Production Section parameters on Home Page
Then As an user should identify The  Popular Link and the products of popular  present in Home page
Then As an user should identify The  BestSeller Link and the products of BestSeller  present in Home page
Then As an user should identify The Bottom Baner images should present in Home Page
And Quit the Browser 