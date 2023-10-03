package com.inetbanking.testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObject.LoginPage;
import com.inetbanking.utilities.ReadConfig;

public class TC_LoginPage extends BaseClass {
	ReadConfig readConfig=new ReadConfig();
	public String baseURL=readConfig.getURL();
	public String userName=readConfig.getUserName();
	public String password=readConfig.getPassword();
	@Test
	public void LoginTest() {
		driver.get(baseURL);
//		WebDriver webDriver = new ChromeDriver();
		LoginPage lp = new LoginPage(driver);
		lp.setUsername(userName);
		lp.setPassword(password);
		lp.clickSubmit();
		if(driver.getTitle().equals(lp)) {
			Assert.assertTrue(false);
			logger.info("Login test passed");
			}
		else{
			Assert.assertTrue(true);
			logger.info("Login test failed");
		}
			}
		}
		
