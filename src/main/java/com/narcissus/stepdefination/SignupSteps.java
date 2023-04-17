package com.narcissus.stepdefination;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;

import com.Narcissu.keywords.Keyword;
import com.narcissus.pages.HomePage;
import com.narcissus.util.Waits;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignupSteps {

	@Given("Chrome browser should be opened and user is an signup page")
	public void launchSignupPage() {
		Keyword.openBrower("Chrome");
		Keyword.launchUrl("https://ijmeet.com");
		HomePage home = new HomePage();
		home.clickOnSignup();
		Waits wait = new Waits();

	}

	@When("user leaves full name empty and clicks on Signup button")
	public void enterBlankFullName() {
		SignUpPage signup = new SignUpPage();
		signup.clickSignUp2Button();

	}

	@Then("user should see an error message ")
	public void VerifyError() {
		SignUpPage signup = new SignUpPage();
		String actual = signup.getFullNameErrorMsg();
		Assert.assertEquals(actual, "Enter full name");
		
		

	}
}
