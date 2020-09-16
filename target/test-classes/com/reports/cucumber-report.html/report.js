$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/cucumber/features/Automation.feature");
formatter.feature({
  "name": "Opencart login functionality module and Order placement Test automation scripts",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify user is able to hit the Opencart application",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User should launch the opencart application",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginAndOrderPlacement.user_should_launch_the_opencart_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see opencart logo present in the header",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginAndOrderPlacement.user_should_see_opencart_logo_present_in_the_header()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see My account text present in the page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginAndOrderPlacement.user_should_see_My_account_text_present_in_the_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify user is able to login the application",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User enter the email address \u0027abcd@gmail.com\u0027 in the email field",
  "keyword": "When "
});
formatter.match({
  "location": "LoginAndOrderPlacement.user_enter_the_email_address_in_the_email_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the password \u0027Testone1\u0027 in the password field",
  "keyword": "When "
});
formatter.match({
  "location": "LoginAndOrderPlacement.user_enter_the_password_in_the_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on the login button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginAndOrderPlacement.user_click_on_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see My Account in the Page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginAndOrderPlacement.user_should_see_My_Account_in_the_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User is able to place order in the application",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User clicks product they want and it should lead to the respective page",
  "keyword": "When "
});
formatter.match({
  "location": "LoginAndOrderPlacement.user_clicks_product_they_want_and_it_should_lead_to_the_respective_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on a particular model of the product",
  "keyword": "And "
});
formatter.match({
  "location": "LoginAndOrderPlacement.user_clicks_on_a_particular_model_of_the_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on add to cart",
  "keyword": "And "
});
formatter.match({
  "location": "LoginAndOrderPlacement.user_clicks_on_add_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on checkout",
  "keyword": "And "
});
formatter.match({
  "location": "LoginAndOrderPlacement.user_clicks_on_checkout()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat com.cucumber.testscripts.LoginAndOrderPlacement.user_clicks_on_checkout(LoginAndOrderPlacement.java:83)\r\n\tat ✽.User clicks on checkout(src/test/java/com/cucumber/features/Automation.feature:18)\r\n",
  "status": "failed"
});
});