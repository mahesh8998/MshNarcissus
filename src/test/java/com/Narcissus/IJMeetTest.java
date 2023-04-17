package com.Narcissus;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.narcissus.base.BaseText;
import com.narcissus.pages.HomePage;
import com.narcissus.pages.JoinMeetingPage;

public class IJMeetTest extends BaseText {

	@Test
	public void verifyOnClickOnJoinMeetingUserRedirectsTojoinMeetingPage() {
		String expectedText = "Quick join a Meeting";

		HomePage home = new HomePage();
		home.clickOnJoinMeetingLink();

		JoinMeetingPage joinMeeting = new JoinMeetingPage();

		String actual = joinMeeting.getQuickJoinMeetingText();
		Assert.assertEquals(actual, expectedText);
	}
}
