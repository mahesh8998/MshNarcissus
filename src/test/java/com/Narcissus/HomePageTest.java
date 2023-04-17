package com.Narcissus;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.xml.sax.Locator;

import com.Narcissu.keywords.Keyword;
import com.fasterxml.jackson.databind.deser.Deserializers.Base;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * @author abc
 *
 */

public class HomePageTest extends BaseTest {

	@Test(description = "Without framework")
	public static void veriftyTitleOfHomePage() {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		RemoteWebDriver driver = new ChromeDriver(co);
		String expectedTitle = "Testing shastra | Training | Placement";
		String actualTitle = driver.getTitle();

		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Test(description = "with framework")
	public void verifyTitleOfHomePage() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		RemoteWebDriver driver = new ChromeDriver(co);
		String expectedTitle = "Testing shastra | Training | Placement";
		Keyword.openBrower("Chrome");
		Keyword.launchUrl("https://www.testingshastra.com/");
		String actualTitle = Keyword.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);

	}

	@Test
	public void verifySearchResultForShoes() throws IOException {

		Keyword.openBrower("Chrome");
		Keyword.launchUrl("https://www.myntra.com");
		Keyword.enterText(Locator.searchForProducts, "Shoes");
		Keyword.click(Locator.magnifier);
		Keyword.wait.forDuration(4000);
		List<String> titles = Keyword.getTextOfElements(Locator.productTitles);
		SoftAssert softly = new SoftAssert();
		for (String title : titles) {
			Assert.assertTrue(
					title.contains("Shoes") || title.contains("Sneakers") || title.contains("Running")
							|| title.contains("Trainer") || title.contains("Trainer"),
					"Title doesn't contains shoes or sneaker: " + title);
		}
		softly.assertAll();

	}
}
