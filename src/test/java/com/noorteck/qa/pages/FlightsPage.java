package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class FlightsPage extends CommonUI{

	@FindBy(xpath="//input[@value='roundtrip']")
	WebElement roundTripRadio;
	
	@FindBy(xpath="//input[@value='oneway']")
	WebElement oneWayRadio;
	
	@FindBy(xpath="//select[@name='passCount']")
	WebElement passengers;
	
	
	
	
	
	@FindBy(xpath="//select[@name='fromPort']")
	WebElement departing;
	
	@FindBy(xpath="//select[@name='fromMonth']")
	WebElement fromMonth;
	
	@FindBy(xpath="//select[@name='fromDay']")
	WebElement fromDay;
	
	@FindBy(xpath="//select[@name='toPort']")
	WebElement arrivingIn;
	
	@FindBy(xpath="//select[@name='toMonth']")
	WebElement toMonth;
	
	@FindBy(xpath="//select[@name='toDay']")
	WebElement toDay;
	
	@FindBy(xpath="//input[@value='Coach']")
	WebElement economy;
	
	@FindBy(xpath="//input[@value='Business']")
	WebElement business;
	
	@FindBy(xpath="//input[@value='First']")
	WebElement first;
	
	@FindBy(xpath="//select[@name='airline']")
	WebElement airline;
	
	@FindBy(xpath="(//option[normalize-space()='No Preference']")
	WebElement noPreference;
	
	@FindBy(xpath="//option[normalize-space()='Blue Skies Airlines']")
	WebElement blueSkies;
	
	@FindBy(xpath="//option[normalize-space()='Unified Airlines']")
	WebElement unified;
	
	@FindBy(xpath="//option[normalize-space()='Pangea Airlines']")
	WebElement pangea;
	
	@FindBy(xpath="//input[@name='findFlights']")
	WebElement continueButton;
	
	@FindBy(xpath="//tbody/tr[@valign='top']/td/p[@align='left']/font[@face='Arial, Helvetica, sans-serif']/b/font[1]")
	WebElement displayedText;
	
	public FlightsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void selectRoundTrip() {
		click(roundTripRadio);
	}
	
	public void selectOneWay() {
		click(oneWayRadio);
	}
	public void selectPassengers(String methodName, String indexTextValue) {
		selectFromDropdown(passengers, methodName, indexTextValue);
	}
	public void selectDeparting(String methodName, String indexTextValue) {
		selectFromDropdown(departing, methodName, indexTextValue);
	}
	
	public void selectFromMonth(String methodName, String indexTextValue) {
		selectFromDropdown(fromMonth, methodName, indexTextValue);
	}
	
	public void selectFromDay(String methodName, String indexTextValue) {
		selectFromDropdown(fromDay, methodName, indexTextValue);
	}
	public void selectArriving(String methodName, String indexTextValue) {
		selectFromDropdown(arrivingIn, methodName, indexTextValue);
	}
	
	public void selectToMonth(String methodName, String indexTextValue) {
		selectFromDropdown(toMonth, methodName, indexTextValue);
	}
	public void selectToDay(String methodName, String indexTextValue) {
		selectFromDropdown(toDay, methodName, indexTextValue);
	}
	
	public void clickEconomy() {
		click(economy);
	}
	
	public void clickBusiness() {
		click(business);
	}
	
	public void clickFirstClass() {
		click(first);
	}
	public void clickAirline() {
		click(airline);
	}
	public void selectNoPreference() {
		moveToElementAndClick(noPreference);
	}
	
	public void selectBlueSkies() {
		moveToElementAndClick(blueSkies);
	}
	
	public void selectUnified() {
		moveToElementAndClick(unified);
	}
	
	public void selectPangea() {
		moveToElementAndClick(pangea);
	}
	public void clickContinue() {
		click(continueButton);
	}
	
	public String displayedMessage() {
		return getText(displayedText);
	}
	
	public void click() {
		click(passengers);
	}
	
}
