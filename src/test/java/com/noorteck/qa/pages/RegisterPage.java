package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class RegisterPage extends CommonUI {

	@FindBy(xpath="//input[@name='firstName']")
	WebElement firstNameField;
	
	@FindBy(xpath="//input[@name='lastName']")
	WebElement lastNameField;
	
	@FindBy(xpath="//input[@name='phone']")
	WebElement phoneField;
	
	@FindBy(id="userName")
	WebElement emailField;
	
	@FindBy(xpath="(//input[@name='address1'])[1]")
	WebElement addressField;
	
	@FindBy(xpath="(//input[@name='city'])[1]")
	WebElement cityField;
	
	@FindBy(xpath="//input[@name='state']")
	WebElement stateField;
	
	@FindBy(xpath="//input[@name='postalCode']")
	WebElement postalCodeField;
	
	@FindBy(xpath="//select[@name='country']")
	WebElement selectCountry;
	
	@FindBy(id="email")
	WebElement userNameField;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement passwordField;
	
	@FindBy(xpath="//input[@name='confirmPassword']")
	WebElement confirmPWField;
	
	@FindBy(xpath="//input[@name='submit']")
	WebElement submitButton;
	
	@FindBy(xpath="//font[contains(text(),'Thank you for registering.')]")
	WebElement displayedText;
	
	public  RegisterPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterFN(String firstName) {
		enter(firstNameField, firstName);
	}
	
	public void enterLN(String lastName) {
		enter(lastNameField, lastName);
	}
	
	public void enterPhone(String phone) {
		enter(phoneField, phone);
	}
	
	public void enterEmail(String email) {
		enter(emailField, email);
	}
	
	public void enterAddress(String address) {
		enter(addressField, address);
	}
	
	public void enterCity(String city) {
		enter(cityField, city);
	}
	
	public void enterState(String state) {
		enter(stateField, state);
	}
	
	public void enterPostalCode(String postalCode) {
		enter(postalCodeField, postalCode);
	}
	
	public void selectCountry(String methodName, String indexTextValue) {
		selectFromDropdown(selectCountry, methodName, indexTextValue);
	}
	
	public void enteruserName(String userName) {
		enter(userNameField, userName);
	}
	
	public void enterPassword(String password) {
		enter(passwordField, password);
	}
	
	public void enterConfirmPW(String confirmPassword) {
		enter(confirmPWField, confirmPassword);
	}
	
	public void clickSubmit() {
		click(submitButton);
	}
	
	public String isThankYouForRegistering() {
		return getText(displayedText);
	}
	
	public boolean displayAddressElement() {
		return isDisplayed(addressField);
	}
}
