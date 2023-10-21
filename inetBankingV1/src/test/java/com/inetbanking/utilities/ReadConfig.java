package com.inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties prop;

	public ReadConfig() {
		try {
			File src = new File("./configuration/config.properties");
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Test");
		}
	}
	

	public String getURL() {
		String url = prop.getProperty("baseurl");
		return url;
	}

	public String getUserName() {
		String userName = prop.getProperty("username");
		return userName;
	}
	
	public String getPassword() {
		String password = prop.getProperty("password");
		return password;
	}
}