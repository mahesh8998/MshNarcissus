package com.Narcissu.keywords;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.narcissus.util.Locator;
import com.narcissus.util.Waits;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * @author Shashikant
 *
 */
public class Keyword {

	public static WebDriver driver = null;
	public static Waits wait = null;

	/**
	 * This keyword can be used to launch specified browser.
	 * 
	 * @param browserName to launch
	 * @return 
	 */

	public static  void openBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("Safari")) {
			WebDriverManager.safaridriver().setup();
			driver = new ChromeDriver();
		} else {
			System.err.println("Invalid browser name: " + browserName);
		}

		wait = new Waits();
	}

	/**
	 * This keyword can be used to launch the specified.
	 * 
	 * @param url
	 */
	public static void launchUrl(String url) {
		driver.get(url);
	}

	/**
	 * This keyword can be used to return {@code String} representation of the title
	 * of current pages
	 * 
	 * @return
	 * @return
	 */
	public static String getTitle() {
		return driver.getTitle();

	}

	/**
	 * 
	 * @param element
	 */
	public static void clickOn(WebElement element) {
		element.click();

	}

	

	
	/**
	 * 
	 * @param elementText
	 */
	public static void clickOn(String elementText) {
		driver.findElement(By.xpath("//*[contains(text(),'" + elementText + "')]")).click();

	}

	/**
	 * 
	 * @param element
	 */
	public static void clickOn(By element) {
		driver.findElement(element).click();

	}

	/**
	 * 
	 * @param title
	 */
	public static void closeWindow(String title) {
		Set<String> allWidows = driver.getWindowHandles();
		for (String window : allWidows) {
			driver.switchTo().window(window);
			if (driver.getTitle().equalsIgnoreCase(title)) {
				driver.close();
			}
		}
	}

	/**
	 * 
	 */
	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}

	/**
	 * 
	 */
	public static void quiteAllWindows() {
		driver.quit();

	}

	public static void openBrower(String OpenBrower) {

	}

	public static void enterText(String locator, String text) {
		String locatorType = locator.split("##")[0];
		String locatorvalue = locator.split("##")[1];

		WebElement element = null;
		if (locatorType.equalsIgnoreCase("xpath"))
			element = driver.findElement(By.xpath(locatorvalue));
		else if (locatorType.equalsIgnoreCase("css"))
			element = driver.findElement(By.cssSelector(locatorvalue));
		else if (locatorType.equalsIgnoreCase("id"))
			element = driver.findElement(By.id(locatorvalue));
		else if (locatorType.equalsIgnoreCase("name"))
			element = driver.findElement(By.name(locatorvalue));
		else if (locatorType.equalsIgnoreCase("class"))
			element = driver.findElement(By.className(locatorvalue));
		else if (locatorType.equalsIgnoreCase("tagname"))
			element = driver.findElement(By.tagName(locatorvalue));
		else if (locatorType.equalsIgnoreCase("linktext"))
			element = driver.findElement(By.linkText(locatorvalue));
		else if (locatorType.equalsIgnoreCase("partiallinktext"))
			element = driver.findElement(By.partialLinkText(locatorvalue));

		element.sendKeys(text);
		
	}

	

	public static List<String> getTextOfElements(String locator) {
		List<String> productTexts = new ArrayList<>();
		By Selector;
		List<WebElement> produtTitles = driver.findElements(Selector);
		for (String productTitle : productTexts) {
			productTexts.add(productTitle.getTexts());

		}

		return productTexts;

	}
	
	public List<String> getTextOfElement(String locator) {
		List<String> elements = getTextOfElements(locator);
		List<String> elementTexts = new ArrayList<>();
		for (String element : elements) {
			elementTexts.add(element);
		}
		return elementTexts;
		}
	
	public static void enterText(By locator , String text) {
		driver.findElement(locator).sendKeys(text);

	}
		
	
	
	private List<WebElement> getWebElement() {
		String locatorType = Locator.Split("##")[0];
		String locatorvalue = Locator.Split("##")[1];

		List<WebElement> elements  = new ArrayList<>();
		if (locatorType.equalsIgnoreCase("xpath"))
			elements = driver.findElements(By.xpath(locatorvalue));
		else if (locatorType.equalsIgnoreCase("css"))
			elements = driver.findElements(By.cssSelector(locatorvalue));
		else if (locatorType.equalsIgnoreCase("id"))
			elements = driver.findElements(By.id(locatorvalue));
		else if (locatorType.equalsIgnoreCase("name"))
			elements = driver.findElements(By.name(locatorvalue));
		else if (locatorType.equalsIgnoreCase("class"))
			elements = driver.findElements(By.className(locatorvalue));
		else if (locatorType.equalsIgnoreCase("tagname"))
			elements = driver.findElements(By.tagName(locatorvalue));
		else if (locatorType.equalsIgnoreCase("linktext"))
			elements = driver.findElements(By.linkText(locatorvalue));
		else if (locatorType.equalsIgnoreCase("partiallinktext"))
			elements = driver.findElements(By.partialLinkText(locatorvalue));
		
		return elements;


	}
	
	
	
	

	public static void enterText(WebElement el, String text) {
		el.sendKeys(text);
	}

	public static void enterText(Object locator, String text) {
		// TODO Auto-generated method stub
		
	}

	public static void clickOn1(Object locator) {
		driver.get(getTitle());
	}

	public static void closeBrowser() {
		driver.close();
		System.out.println("Browser is closed successfully");
	}


}


