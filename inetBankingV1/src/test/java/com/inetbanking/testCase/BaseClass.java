package com.inetbanking.testCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public String baseURL="";
	public String userName="";
	public String password="";
	public static WebDriver driver;
	@BeforeClass
	public void setup() {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	

}
