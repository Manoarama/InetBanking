package com.inetbanking.testCase;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public  WebDriver driverFireFox;
	public  WebDriver driverChrome;
	public Logger logger;

	@Parameters({ "browser" })
	@BeforeClass
	public void setup(@Optional String browser) {
		logger = Logger.getLogger(BaseClass.class);
		logger.info("method set up started");
		switch (browser) {
		case "firefox":
			setFireFoxSetUp();
			break;
		case "chrome":
			setChromeSetUp();
			break;
		default:
			logger.info("In default");
			break;
		}
		logger.info("method set up completed");
	}

	private void setChromeSetUp() {
		WebDriverManager.chromedriver().setup();
		driverChrome= new ChromeDriver();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		driverChrome = new ChromeDriver(chromeOptions);
		driverChrome.manage().window().maximize();
	}

	private void setFireFoxSetUp() {
		WebDriverManager.firefoxdriver().setup();
		driverFireFox = new FirefoxDriver();
		driverFireFox.manage().window().maximize();
	}

	@AfterClass
	public void tearDown() {
		// driver.quit();
	}

}
