package com.inetbanking.testCase;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
    protected Logger logger;

	@Parameters({ "browser" })
	@BeforeClass
	public void setup(@Optional String browser) {
		System.out.println("method set up");
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		logger = Logger.getLogger(BaseClass.class);
		/*
		 * if (browser.equalsIgnoreCase("firefox")) {
		 * WebDriverManager.firefoxdriver().setup(); driver = new FirefoxDriver(); }
		 * else if (browser.equalsIgnoreCase("Chrome")) {
		 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver(); } else
		 * if (browser.equalsIgnoreCase("ie")) {
		 * WebDriverManager.chromedriver().setup(); } driver = new
		 * InternetExplorerDriver();
		 */
		
	}

	@AfterClass
	public void tearDown() {
		//driver.quit();
	}

}
