package com.inetbanking.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	private WebDriver lDriver;

	public LoginPage(WebDriver rdriver) {
		this.lDriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id = "email")
	@CacheLookup
	WebElement txtUserName;

	@FindBy(id = "password")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(id="login-button")
	@CacheLookup
	WebElement btnLogin;

	public void setUsername(String uname) {
		txtUserName.sendKeys(uname);
	}

	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}
	public void clickSubmit() {
		btnLogin.click();	
	}

}
