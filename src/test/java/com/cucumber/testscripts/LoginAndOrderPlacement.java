package com.cucumber.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cucumber.baseclass.BaseClass;
import com.cucumber.pom.Login;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import com.cucumber.utils.SingletonPom;

public class LoginAndOrderPlacement extends BaseClass {

	SingletonPom sp=new SingletonPom();
	public WebDriver driver;
	
	
	@Given("User should launch the opencart application")
	public void user_should_launch_the_opencart_application() throws Exception {
	  driver  = browser_LaunchIgnoreCase("chrome");
	  launchURL("http://opencart.abstracta.us/index.php?route=common/home");
	}

	
	@Then("User should see opencart logo present in the header")
	public void user_should_see_opencart_logo_present_in_the_header() throws Exception {
	  boolean elementIsDisplayed = elementIsDisplayed(sp.getLp().getOpencartlogo());
	  Assert.assertTrue(elementIsDisplayed);
	  
	}

	@Then("User should see My account text present in the page")
	public void user_should_see_My_account_text_present_in_the_page() throws Exception {
		elementClick(driver.findElement(By.xpath("//a[@title='My Account']")));
		elementClick(driver.findElement(By.xpath("//a[text()='Login']")));
	}
	@When("User enter the email address {string} in the email field")
	public void user_enter_the_email_address_in_the_email_field(String string) throws Exception {
		   elementSendKeys(sp.getLp().getEmailField(), string);
	}

	@When("User enter the password {string} in the password field")
	public void user_enter_the_password_in_the_password_field(String string) throws Exception {
		   elementSendKeys(sp.getLp().getPasswordField(), string);
		 
	}


	@When("User click on the login button")
	public void user_click_on_the_login_button() throws Exception {
		Thread.sleep(3000);
	  elementClick(sp.getLp().getLoginbtn());
	}

	@Then("User should see My Account in the Page")
	public void user_should_see_My_Account_in_the_Page() throws Exception {
		boolean elementIsDisplayed = elementIsDisplayed(sp.getLp().getMyaccount());
		  Assert.assertTrue(elementIsDisplayed);
	}

	@When("User clicks product they want and it should lead to the respective page")
	public void user_clicks_product_they_want_and_it_should_lead_to_the_respective_page() throws Exception {
	    elementClick(sp.getLp().getCameras());
	}

	@When("User clicks on a particular model of the product")
	public void user_clicks_on_a_particular_model_of_the_product() throws Exception {
	elementClick(sp.getLp().getNikon());
	}

	@When("User clicks on add to cart")
	public void user_clicks_on_add_to_cart() throws Exception {
	    elementClick(sp.getLp().getAddtocart());
	}

	@When("User clicks on checkout")
	public void user_clicks_on_checkout() throws Exception {
	elementClick(sp.getLp().getCheckout());
	Thread.sleep(5000);
	}



	
}
