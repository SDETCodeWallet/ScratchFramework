package net.com.seleniumCore;

import java.util.Collections;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaitUtility {

	private BasePage basePage;

	private long timeOutInSec = 5;

	public void waitForElementLocated(String locator) {
		new WebDriverWait(BasePage.driver, timeOutInSec)
				.until(ExpectedConditions.presenceOfElementLocated(basePage.locatorType(locator)));
	}

	public void waitForElementToBeClickable(String locator) {
		new WebDriverWait(BasePage.driver, timeOutInSec)
				.until(ExpectedConditions.elementToBeClickable(basePage.locatorType(locator)));
	}

	public void waitForElementToBeClickable(WebElement webelement) {
		new WebDriverWait(BasePage.driver, timeOutInSec)
				.until(ExpectedConditions.elementToBeClickable(webelement));
	}
	
	public void elementToBePresent(String locator) {
		new WebDriverWait(BasePage.driver, timeOutInSec)
		.until(ExpectedConditions.visibilityOfElementLocated(basePage.locatorType(locator)));
	}
	
	public static void testing() {
		
	}

}
