package com.cucumber.pom;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.baseclass.BaseClass;

public class Login extends BaseClass{

	public Login() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath= "//img[@title='Your Store']")
	private WebElement opencartlogo;
	
	@FindBy(xpath ="//a[text()='Login']")
	private WebElement Login;
	
	@FindBy(xpath="//input[@id='input-email']")
	private WebElement emailField;
	
	@FindBy(xpath="//input[@id='input-password']")
	private WebElement passwordField;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement Loginbtn;
    
	@FindBy(xpath="//h2[text()='My Account']")
	private WebElement Myaccount;
	
	@FindBy(xpath="//a[text()='Cameras']")
	private WebElement Cameras;
	
	@FindBy(xpath="//a[text()='Nikon D300']")
	private WebElement Nikon;
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-lg btn-block']")
	private WebElement Addtocart;
	
	@FindBy(xpath="//i[@class='fa fa-share']")
	private WebElement Checkout;
	
	@FindBy(xpath="//input[@id='button-payment-address']")
	private WebElement Paymentaddress;
	
	@FindBy(xpath="//input[@id='button-shipping-address']")
	private WebElement Shippingaddress;
	
	@FindBy(xpath="//input[@id='button-shipping-method']")
	private WebElement Shippingmethod;
	
	

	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement Checkbox;
	
	@FindBy(xpath="//input[@id='button-payment-method']")
	private WebElement Paymentmethod;
	
	@FindBy(xpath="//input[@value='Confirm Order']")
	private WebElement Confirmorder;
	
	@FindBy(xpath="//h1[text()='Your order has been placed!']")
	private WebElement OrderPlaced;
	
	public WebElement getNikon() {
		return Nikon;
	}
	public WebElement getShippingmethod() {
		return Shippingmethod;
	}

	public WebElement getAddtocart() {
		return Addtocart;
	}

	public WebElement getCheckout() {
		return Checkout;
	}

	public WebElement getPaymentaddress() {
		return Paymentaddress;
	}

	public WebElement getShippingaddress() {
		return Shippingaddress;
	}

	public WebElement getCheckbox() {
		return Checkbox;
	}

	public WebElement getPaymentmethod() {
		return Paymentmethod;
	}

	public WebElement getConfirmorder() {
		return Confirmorder;
	}

	public WebElement getOrderPlaced() {
		return OrderPlaced;
	}

	public WebElement getCameras() {
		return Cameras;
	}

	public WebElement getMyaccount() {
		return Myaccount;
	}

	public WebElement getLoginbtn() {
		return Loginbtn;
	}
	public WebElement getOpencartlogo(){
		return opencartlogo;
	}
	
	public WebElement getLogin() {
		return Login;
	}
	
	public WebElement getEmailField() {
		return emailField;
	}
	public WebElement getPasswordField() {
		return passwordField;
	}
}
