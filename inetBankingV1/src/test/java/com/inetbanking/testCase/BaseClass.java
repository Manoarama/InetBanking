package com.inetbanking.testCase;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Logger logger;

	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {
		logger=Logger.getLogger("ebanking");
		PropertyConfigurator.configure("Log4j.property");
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();	
		if (br.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();	
		}
		else if (br.equalsIgnoreCase("Chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
		else if (br.equalsIgnoreCase("ie")) {
			WebDriverManager.chromedriver().setup();}
		driver=new InternetExplorerDriver();

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
