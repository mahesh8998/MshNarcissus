package com.Narcissus;

import org.apache.commons.math3.analysis.function.Signum;
import org.testng.annotations.Test;


import com.narcissus.base.BaseText;
import com.narcissus.pages.HomePage;
import com.narcissus.stepdefination.SignUpPage;

public class SignupPageTests
extends BaseText{
	
	@Test
	public void verifyPhoneNumberInPlaceOnfullName() {
		HomePage home = new HomePage();
		home.clickOnSignup();
		SignUpPage signUp = new SignUpPage();
		signUp.setFullNameTextField("Testing");
		

	}

	
	
}
