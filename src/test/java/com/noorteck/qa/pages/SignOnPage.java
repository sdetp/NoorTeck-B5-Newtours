package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class SignOnPage extends CommonUI {

	@FindBy(xpath="//input[@name='userName']")
	WebElement userNameField;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement passwordField;
	
	@FindBy(xpath="//input[@name='submit']")
	WebElement submitButton;
	
	@FindBy(id="google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0")
	WebElement outterIframe;
	
	@FindBy(xpath="//iframe[@src='https://www.google.com/recaptcha/api2/aframe']")
	WebElement ad;
	
	@FindBy(id="dismiss-button")
	WebElement closeAd;
	
	@FindBy(xpath="//h3[normalize-space()='Login Successfully']")
	WebElement displayedText;
	
	@FindBy(xpath="//b[normalize-space()='Thank you for Loggin.']")
	WebElement displayedTextTwo;
	
	public SignOnPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName(String userName) {
		enter(userNameField, userName);
	}
	
	public void enterPassword(String password) {
		enter(passwordField, password);
	}
	
	public void clickSubmit() {
		click(submitButton);
	}
	public boolean adDisplayed() {
		return isDisplayed(outterIframe);
	}
	public void switchToBigIframe() {
		switchMethod(outterIframe);
	}
	
	public void switchToAd() {
		switchMethod(ad);
	}
	
	public void clickClose() {
		click(closeAd);
	}
	
	public boolean displayedOne() {
		return isDisplayed(displayedText);
	}
	
	public boolean displayedTwo() {
		return isDisplayed(displayedTextTwo);
	}
	 
	
	
}
