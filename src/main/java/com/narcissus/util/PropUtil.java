package com.narcissus.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropUtil {
	
	private static final Properties prop = null;
	/**
	 * This method returns value of specified locator from OR.properties file
	 * @param locator
	 * @return 
	 * @throws Exception 
	 */
	
	public static String getLocator(String locator) throws Exception {
		String fileName = "/src/test/resources/OR.properties";
		return getProperty(fileName, locator);

	}
	
	public static String getProperty(String fileName, String key) throws Exception {
		String dir = System.getProperty("user.dir");
		FileInputStream fis = new FileInputStream(dir+fileName);
		
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(key);


	}
	public static String  getEnvirnomet(String key) throws IOException{
		String fileName = "/src/main/resources/Environment.properties";
		
		return prop.getProperty(key);
		
	}
	
	
	
}
