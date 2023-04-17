package com.narcissus.base;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

import com.Narcissu.keywords.Keyword;
import com.narcissus.util.Environment;

public class BaseText {
	
	
	@BeforeMethod
	public void setUp() throws Exception{
		
		
		
		Keyword.openBrower(Environment.getBroswerName());
		String env = System.getProperty("env").toLowerCase();
		Keyword.launchUrl(Environment.getUrl(env));
		
		

	}
	
	@AfterClass
	public void tearDown() throws Exception {
		Keyword.closeBrowser();
		
	}
}
