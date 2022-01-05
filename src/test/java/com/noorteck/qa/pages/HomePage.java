package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class HomePage extends CommonUI{

	@FindBy(xpath="//a[normalize-space()='REGISTER']")
	WebElement registerLink;
	
	@FindBy(xpath="//a[normalize-space()='SIGN-ON']")
	WebElement signOnLink;
	
	@FindBy(xpath="//a[normalize-space()='Flights']")
	WebElement flightsLink;
	
	@FindBy(id="google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0")
	WebElement outterIframe;
	
	@FindBy(id="ad_iframe")
	WebElement ad;
	
	//@FindBy(xpath="//iframe[@name='__uspapiLocator']")
	
	
	public  HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickRegister() {
		click(registerLink);
	}
	
	public void clickSignOn() {
		click(signOnLink);
	}
	
	public void clickFlights() {
		click(flightsLink);
	}
	
	
	
}
