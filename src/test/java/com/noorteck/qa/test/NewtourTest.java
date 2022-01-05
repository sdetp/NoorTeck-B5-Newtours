package com.noorteck.qa.test;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

public class NewtourTest extends ObjInitialize {

	public static void main(String[] args) {

		String url = "http://demo.guru99.com/test/newtours/";

		CommonUI.openBrowser("chrome");
		CommonUI.navigate(url);
		initializeClassObj();
		testCaseTwo();
		CommonUI.quitBrowser();

		CommonUI.openBrowser("chrome");
		CommonUI.navigate(url);
		initializeClassObj();
		testCaseOne();
		CommonUI.quitBrowser();

		CommonUI.openBrowser("chrome");
		CommonUI.navigate(url);
		initializeClassObj();
		testCaseThree();
		CommonUI.quitBrowser();
	}

	public static void testCaseOne() {

		homeObj.clickSignOn();
		signOnObj.enterUserName("johnCena89@gmail.com");
		signOnObj.enterPassword("12345678");
		signOnObj.clickSubmit();
		if (signOnObj.adDisplayed() == true) {
			signOnObj.switchToBigIframe();
			signOnObj.switchToAd();
			signOnObj.clickClose();

		} else {
			System.out.println(signOnObj.displayedOne());
			System.out.println(signOnObj.displayedTwo());
		}

	}

	public static void testCaseTwo() {
		homeObj.clickRegister();
		registerObj.enterFN("John");
		registerObj.enterLN("Cena");
		registerObj.enterPhone("703-333-4444");
		registerObj.enterEmail("johnCena89@gmail.com");
		registerObj.enterAddress("111 Cena Road");
		registerObj.enterCity("Reston");
		registerObj.enterState("Virginia");
		registerObj.enterPostalCode("11223");
		registerObj.selectCountry("text", "UNITED STATES");
		registerObj.enteruserName("johnCena89@gmail.com");
		registerObj.enterPassword("12345678");
		registerObj.enterConfirmPW("12345678");
		registerObj.clickSubmit();

		String actualText = registerObj.isThankYouForRegistering();
		String expText = "Thank you for registering";
		if (actualText.contains(expText)) {
			System.out.println("verified");
		} else {
			System.out.println(actualText);
		}
	}

	public static void testCaseThree() {

		homeObj.clickFlights();
		flightsObj.selectOneWay();
		flightsObj.click();
		flightsObj.selectPassengers("text", "3");
		flightsObj.selectDeparting("text", "New York");
		flightsObj.selectFromMonth("text", "January");
		flightsObj.selectFromDay("text", "5");
		flightsObj.selectArriving("text", "London");
		flightsObj.selectToMonth("text", "February");
		flightsObj.selectToDay("text", "5");
		flightsObj.clickFirstClass();

		flightsObj.clickAirline();
		flightsObj.selectUnified();
		flightsObj.clickContinue();
		String actText = flightsObj.displayedMessage();
		String expText = "After flight finder - No Seats Avaialble";
		if (actText.contains(expText)) {
			System.out.println("verified");
		} else {
			System.out.println(actText);
		}

	}
}

/**
 * -------------------------------------- INSTRUCTIONS
 * --------------------------------------------
 * 
 * ---> Create JAVA CLASS for each page of the application ---> Inspect the
 * elements and store the values ---> Create the class constructor ---> Create
 * the methods
 * 
 * ---> DONT FORGET ***** EACH PAGE CLASS SHOULD INHERIT CommonUI Class
 * ******************* ---> DONT FORGET ***** DECLARE PAGE CLASS OBJECT in
 * CONSTANTS CLASS ******************* ---> DONT FOGET ***** INITIALIZE PAGE
 * CLASS OBJECTS IN ObjInitialize JAVA ClASS ******************* ---> DONT FOGET
 * ***** CHANGE JAVA VERSION TO 1.8 *******************
 * 
 * 
 * 
 * ---> For each test case create a method then call those methods from main
 * method. ---> DONT FORGET ***** Refer to the INSTRUCTION PDF file for the test
 * cases to automate **************
 * 
 * ---> ONCE FINISHED AUTOMATING Create Repository in GitHub and push to GitHub
 * ---> Once pushed add US to the project then send picture in MENTORS GROUP
 * CHAT Crystal: --> Koritzerc23@gmail.com Helen: --> Hnbehining@gmail.com
 * Ahmad: --> a.stanikzai77@gmail.com Fahim: --> NTKBatch5
 * 
 * 
 */