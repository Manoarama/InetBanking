package com.inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties prop;

	public ReadConfig() {
		try {
			File src = new File("./Configuration/config.properties");
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public String getURL() {
		String url = prop.getProperty("baseURL");
		return url;
	}

	public String getUserName() {
		String userName = prop.getProperty("userName");
		return userName;
	}
	
	public String getPassword() {
		String password = prop.getProperty("userName");
		return password;
	}
}