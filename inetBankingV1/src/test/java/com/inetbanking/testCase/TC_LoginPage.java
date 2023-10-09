package com.inetbanking.testCase;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.inetbanking.pageObject.LoginPage;
import com.inetbanking.utilities.ReadConfig;

public class TC_LoginPage extends BaseClass {

	ReadConfig readConfig = new ReadConfig();
	public String baseURL = readConfig.getURL();
	public String userName = readConfig.getUserName();
	public String password = readConfig.getPassword();

	@Test
    @Parameters("browser")
	public void loginTestFireFox() {

		logger.info("Started firefox login test");
		ReadConfig readConfig = new ReadConfig();
		String url = readConfig.getURL();
		driverFireFox.get(url);
		LoginPage lp = new LoginPage(driverFireFox);
		lp.setUsername(userName);
		lp.setPassword(password);
		lp.clickSubmit();
		logger.info("Logged into page succesfully");
		if (driverFireFox.getTitle().equals(lp)) {
			Assert.assertTrue(false);
			logger.info("Login test passed");
		} else {
			Assert.assertTrue(true);
			logger.info("Login test failed");
		}
		logger.info("Ended firefox login test");
	}

	@Test
    @Parameters("browser")
	public void loginTestchrome() {
		logger.info("Started Chrome login test");
		ReadConfig readConfig = new ReadConfig();
		String url = readConfig.getURL();
		driverChrome.get(url);
		LoginPage lp = new LoginPage(driverChrome);
		lp.setUsername(userName);
		lp.setPassword(password);
		lp.clickSubmit();
		logger.info("Logged into page succesfully");
		if (driverChrome.getTitle().equals(lp)) {
			Assert.assertTrue(false);
			logger.info("Login test passed");
		} else {
			Assert.assertTrue(true);
			logger.info("Login test failed");
		}
		logger.info("Ended Chrome login test");
	}

}
