package com.narcissus.stepdefination;

import java.time.Duration;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Narcissu.keywords.Keyword;
import com.narcissus.util.Waits;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage {
	private Map<String, String> data;
	private WebDriver driver;
	private int timeout = 15;

	@FindBy(css = "a[href='https://ijmeet.com/about_us']")
	@CacheLookup
	private WebElement aboutUs;

	@FindBy(id = "company_name")
	@CacheLookup
	private WebElement companyName;

	@FindBy(css = "#contact a.nav-link.font-weight-bold")
	@CacheLookup
	private WebElement contactSales;

	@FindBy(css = ".en div:nth-of-type(2) footer.container.cutomer-bottom-footer div:nth-of-type(2) div:nth-of-type(2) ul.list-unstyled.text-small li:nth-of-type(2) a.text-muted")
	@CacheLookup
	private WebElement contactUs;

	@FindBy(id = "email")
	@CacheLookup
	private WebElement emailId;

	@FindBy(css = "a[href='https://www.facebook.com/ijtimaati']")
	@CacheLookup
	private WebElement facebook;

	@FindBy(id = "name")
	@CacheLookup
	private WebElement fullName;

	@FindBy(css = "a[href='https://ijmeet.com/host_meeting']")
	@CacheLookup
	private WebElement hostMeeting;

	@FindBy(css = "a[href='https://www.instagram.com/ijtimaati']")
	@CacheLookup
	private WebElement instagram;

	@FindBy(css = "a[href='https://ijmeet.com/app']")
	@CacheLookup
	private WebElement joinMeeting;

	@FindBy(css = "-wrapper.full-page-wrapper div.content-wrapper.d-flex.align-items-stretch.auth.auth-img-bg div.row.flex-grow div.col-xs-12.col-sm-12.col-lg-7.m-auto.d-flex.align-items-center.justify-content-center div.auth-form-transparent.text-left.px-3 form.pt-3.common-inventory-border div:nth-of-type(3) label.form-check-label-dont-have.mb-0 a")
	@CacheLookup
	private WebElement logIn;

	@FindBy(id = "contact")
	@CacheLookup
	private WebElement mobileNumber;

	private final String pageLoadedText = "Enter the email address in the format someone@example";

	private final String pageUrl = "/register";

	@FindBy(id = "g-recaptcha-response")
	@CacheLookup
	private WebElement pleaseValidateCaptcha;

	@FindBy(css = "a[href='https://ijmeet.com/privacy']")
	@CacheLookup
	private WebElement privacyPolicy;

	@FindBy(css = "a.nav-link.nav-right-cutom-bg.font-weight-bold")
	@CacheLookup
	private WebElement signIn;

	@FindBy(css = "a.social-login-button.social-login-button-facebook")
	@CacheLookup
	private WebElement signInWithFacebook;

	@FindBy(css = "a.social-login-button.social-login-button-sso")
	@CacheLookup
	private WebElement signInWithFederation;

	@FindBy(css = "a.social-login-button.social-login-button-google")
	@CacheLookup
	private WebElement signInWithGoogle;

	@FindBy(css = "a.nav-link.nav-right-cutom-bg-1.font-weight-bold")
	@CacheLookup
	private WebElement signUp1;

	@FindBy(css = "button.btn.btn-block.btn-primary.btn-lg.font-weight-medium.auth-form-btn.mirror-view-btn-primary")
	@CacheLookup
	private WebElement signUp2;

	@FindBy(css = ".en div:nth-of-type(2) footer.container.cutomer-bottom-footer div:nth-of-type(2) div:nth-of-type(2) ul.list-unstyled.text-small li:nth-of-type(1) a.text-muted")
	@CacheLookup
	private WebElement support;

	@FindBy(css = "a[href='https://ijmeet.com/terms_conditions']")
	@CacheLookup
	private WebElement termsConditions;

	@FindBy(id = "password")
	@CacheLookup
	private WebElement thisFieldIsRequired;

	@FindBy(css = "a[href='https://twitter.com/ijtimaati']")
	@CacheLookup
	private WebElement twitter;

	@FindBy(css = "label#name-error-server")
	private WebElement fullNameErr;

	public SignUpPage() {
		PageFactory.initElements(Keyword.driver, this);

	}

	public SignUpPage(WebDriver driver) {

		this.driver = driver;
	}

	public SignUpPage(WebDriver driver, Map<String, String> data) {
		this(driver);
		this.data = data;
	}

	public SignUpPage(WebDriver driver, Map<String, String> data, int timeout) {
		this(driver, data);
		this.timeout = timeout;
	}

	/**
	 * Click on About Us Link.
	 *
	 * @return the SignUpPage class instance.
	 */
	public SignUpPage clickAboutUsLink() {
		aboutUs.click();
		return this;
	}

	/**
	 * Click on Contact Sales Link.
	 *
	 * @return the SignUpPage class instance.
	 */
	public SignUpPage clickContactSalesLink() {
		contactSales.click();
		return this;
	}

	/**
	 * Click on Contact Us Link.
	 *
	 * @return the SignUpPage class instance.
	 */
	public SignUpPage clickContactUsLink() {
		contactUs.click();
		return this;
	}

	/**
	 * Click on Facebook Link.
	 *
	 * @return the SignUpPage class instance.
	 */
	public SignUpPage clickFacebookLink() {
		facebook.click();
		return this;
	}

	/**
	 * Click on Host Meeting Link.
	 *
	 * @return the SignUpPage class instance.
	 */
	public SignUpPage clickHostMeetingLink() {
		hostMeeting.click();
		return this;
	}

	/**
	 * Click on Instagram Link.
	 *
	 * @return the SignUpPage class instance.
	 */
	public SignUpPage clickInstagramLink() {
		instagram.click();
		return this;
	}

	/**
	 * Click on Join Meeting Link.
	 *
	 * @return the SignUpPage class instance.
	 */
	public SignUpPage clickJoinMeetingLink() {
		joinMeeting.click();
		return this;
	}

	/**
	 * Click on Log In Link.
	 *
	 * @return the SignUpPage class instance.
	 */
	public SignUpPage clickLogInLink() {
		logIn.click();
		return this;
	}

	/**
	 * Click on Privacy Policy Link.
	 *
	 * @return the SignUpPage class instance.
	 */
	public SignUpPage clickPrivacyPolicyLink() {
		privacyPolicy.click();
		return this;
	}

	/**
	 * Click on Sign In Link.
	 *
	 * @return the SignUpPage class instance.
	 */
	public SignUpPage clickSignInLink() {
		signIn.click();
		return this;
	}

	/**
	 * Click on Sign In With Facebook Link.
	 *
	 * @return the SignUpPage class instance.
	 */
	public SignUpPage clickSignInWithFacebookLink() {
		signInWithFacebook.click();
		return this;
	}

	/**
	 * Click on Sign In With Federation Link.
	 *
	 * @return the SignUpPage class instance.
	 */
	public SignUpPage clickSignInWithFederationLink() {
		signInWithFederation.click();
		return this;
	}

	/**
	 * Click on Sign In With Google Link.
	 *
	 * @return the SignUpPage class instance.
	 */
	public SignUpPage clickSignInWithGoogleLink() {
		signInWithGoogle.click();
		return this;
	}

	/**
	 * Click on Sign Up Button.
	 *
	 * @return the SignUpPage class instance.
	 */
	public SignUpPage clickSignUp1Button() {
		signUp1.click();
		return this;
	}

	/**
	 * Click on Sign Up Button.
	 *
	 * @return the SignUpPage class instance.
	 */
	public SignUpPage clickSignUp2Button() {
		Waits wait = new Waits();
		wait.forDuration(4);
		try {
		Keyword.driver.executeAsyncScript("document.querySelector('button[type=\\\"submit\\\"]').click()");
		}catch (JavascriptException e ) {
			
		}
		return this;
		
		
	}

	/**
	 * Click on Support Link.
	 *
	 * @return the SignUpPage class instance.
	 */
	public SignUpPage clickSupportLink() {
		support.click();
		return this;
	}

	/**
	 * Click on Terms Conditions Link.
	 *
	 * @return the SignUpPage class instance.
	 */
	public SignUpPage clickTermsConditionsLink() {
		termsConditions.click();
		return this;
	}

	/**
	 * Click on Twitter Link.
	 *
	 * @return the SignUpPage class instance.
	 */
	public SignUpPage clickTwitterLink() {
		twitter.click();
		return this;
	}

	/**
	 * Fill every fields in the page.
	 *
	 * @return the SignUpPage class instance.
	 */
	public SignUpPage fill() {
		setFullNameTextField();
		setCompanyNameTextField();
		setEmailIdEmailField();
		setMobileNumberTextField();
		setThisFieldIsRequiredPasswordField();
		setPleaseValidateCaptchaTextareaField();
		return this;
	}

	/**
	 * Fill every fields in the page and submit it to target page.
	 *
	 * @return the SignUpPage class instance.
	 */
	public SignUpPage fillAndSubmit() {
		fill();
		return submit();
	}

	/**
	 * Set default value to Company Name Text field.
	 *
	 * @return the SignUpPage class instance.
	 */
	public SignUpPage setCompanyNameTextField() {
		return setCompanyNameTextField(data.get("COMPANY_NAME"));
	}

	/**
	 * Set value to Company Name Text field.
	 *
	 * @return the SignUpPage class instance.
	 */
	public SignUpPage setCompanyNameTextField(String companyNameValue) {
		companyName.sendKeys(companyNameValue);
		return this;
	}

	/**
	 * Set default value to Email Id Email field.
	 *
	 * @return the SignUpPage class instance.
	 */
	public SignUpPage setEmailIdEmailField() {
		return setEmailIdEmailField(data.get("EMAIL_ID"));
	}

	/**
	 * Set value to Email Id Email field.
	 *
	 * @return the SignUpPage class instance.
	 */
	public SignUpPage setEmailIdEmailField(String emailIdValue) {
		emailId.sendKeys(emailIdValue);
		return this;
	}

	/**
	 * Set default value to Full Name Text field.
	 *
	 * @return the SignUpPage class instance.
	 */
	public SignUpPage setFullNameTextField() {
		return setFullNameTextField(data.get("FULL_NAME"));
	}

	/**
	 * Set value to Full Name Text field.
	 *
	 * @return the SignUpPage class instance.
	 */
	public SignUpPage setFullNameTextField(String fullNameValue) {
		fullName.sendKeys(fullNameValue);
		return this;
	}

	/**
	 * Set default value to Mobile Number Text field.
	 *
	 * @return the SignUpPage class instance.
	 */
	public SignUpPage setMobileNumberTextField() {
		return setMobileNumberTextField(data.get("MOBILE_NUMBER"));
	}

	/**
	 * Set value to Mobile Number Text field.
	 *
	 * @return the SignUpPage class instance.
	 */
	public SignUpPage setMobileNumberTextField(String mobileNumberValue) {
		mobileNumber.sendKeys(mobileNumberValue);
		return this;
	}

	/**
	 * Set default value to Please Validate Captcha Textarea field.
	 *
	 * @return the SignUpPage class instance.
	 */
	public SignUpPage setPleaseValidateCaptchaTextareaField() {
		return setPleaseValidateCaptchaTextareaField(data.get("PLEASE_VALIDATE_CAPTCHA"));
	}

	/**
	 * Set value to Please Validate Captcha Textarea field.
	 *
	 * @return the SignUpPage class instance.
	 */
	public SignUpPage setPleaseValidateCaptchaTextareaField(String pleaseValidateCaptchaValue) {
		pleaseValidateCaptcha.sendKeys(pleaseValidateCaptchaValue);
		return this;
	}

	/**
	 * Set default value to This Field Is Required. Password field.
	 *
	 * @return the SignUpPage class instance.
	 */
	public SignUpPage setThisFieldIsRequiredPasswordField() {
		return setThisFieldIsRequiredPasswordField(data.get("THIS_FIELD_IS_REQUIRED"));
	}

	/**
	 * Set value to This Field Is Required. Password field.
	 *
	 * @return the SignUpPage class instance.
	 */
	public SignUpPage setThisFieldIsRequiredPasswordField(String thisFieldIsRequiredValue) {
		thisFieldIsRequired.sendKeys(thisFieldIsRequiredValue);
		return this;
	}

	/**
	 * Submit the form to target page.
	 *
	 * @return the SignUpPage class instance.
	 */
	public SignUpPage submit() {
		clickSignUp1Button();
		SignUpPage target = new SignUpPage(driver, data, timeout);
		PageFactory.initElements(driver, target);
		return target;
	}

	/**
	 * Verify that the page loaded completely.
	 *
	 * @return the SignUpPage class instance.
	 */
	public SignUpPage verifyPageLoaded() {
		(new WebDriverWait(driver, Duration.ofSeconds(timeout))).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver d) {
				return d.getPageSource().contains(pageLoadedText);
			}
		});
		return this;
	}

	/**
	 * Verify that current page URL matches the expected URL.
	 *
	 * @return the SignUpPage class instance.
	 */
	public SignUpPage verifyPageUrl() {
		(new WebDriverWait(driver, Duration.ofSeconds(timeout))).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver d) {
				return d.getCurrentUrl().contains(pageUrl);
			}
		});
		return this;

	}

	public String getFullNameErrorMsg() {
		return fullNameErr.getText();
	}

	public SignUpPage clickSignUpButton1() {
		// TODO Auto-generated method public SignUpPage clickSignUp1Button() {
		signUp1.click();
		return this;
	}

}
