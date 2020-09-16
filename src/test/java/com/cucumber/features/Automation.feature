Feature: Opencart login functionality module and Order placement Test automation scripts

Scenario: Verify user is able to hit the Opencart application
Given User should launch the opencart application
Then User should see opencart logo present in the header
And User should see My account text present in the page

Scenario: Verify user is able to login the application
When User enter the email address 'abcd@gmail.com' in the email field
When User enter the password 'Testone1' in the password field
When User click on the login button
Then User should see My Account in the Page

Scenario: User is able to place order in the application
When User clicks product they want and it should lead to the respective page
And User clicks on a particular model of the product
And User clicks on add to cart
And User clicks on checkout

 
