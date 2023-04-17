package com.narcissus.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Narcissu.keywords.Keyword;

public class HomePage {
	
	
	@FindBy(css = "span.mvlogo-size-app1 img[alt=\"ijmeetimage\"]")
	public WebElement ijMeetLogo;
	
	@FindBy(css = "ul.navbar-nav>li:nth-child(1)>a")
	public WebElement joinMeetingLink;
	
	
	@FindBy(css = "ul.navbar-nav>li:nth-child(2)>a")
	public WebElement hostMeeting;
	
	@FindBy(css = "ul.navbar-nav li:nth-child(5)")
	public WebElement signUpBtn;
	
	
	public HomePage() {
		PageFactory.initElements(Keyword.driver, this);
	}
	
	
	public void clickOnIJMeetLogo() {
		ijMeetLogo.click();
		System.out.println("Click on logo");

	}
	public void clickOnJoinMeetingLink() {
		joinMeetingLink.click();

	}
	public String getTextOfJoinMeetingLink() {
		return joinMeetingLink.getText();

	}
	
	public String getTitle() {
		return Keyword.getTitle();

	}


	public void clickOnSignup() {
		signUpBtn.click();
		
	}
	
	
}











