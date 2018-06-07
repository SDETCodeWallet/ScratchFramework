package net.com.seleniumCore;

import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage{

	public static WebDriver driver;
	protected WebElement webelement;
	
	SeleniumWaitUtility waitUtility; 

	public void inputText(WebElement we, String input) {
		we.clear();
		we.sendKeys(input);

	}
	
	public void clickWebElement(WebElement we) {
		waitUtility.waitForElementToBeClickable(we);
		we.click();
	}
	
	
	public void getText(WebElement we) {
		
	}
	

	public By locatorType(String locator) {
		By locatorType = null;
		if (locator.startsWith("//")) {
			locatorType = By.xpath(locator);
		}else if(locator.startsWith("css=")) {
			locatorType=By.cssSelector(locator.replace("css=", ""));
		} else if(locator.startsWith("name=")) {
			locatorType=By.name(locator.replace("name=", ""));
		} else if(locator.startsWith("id=")) {
			locatorType=By.id(locator.replace("id=", ""));
		}
		return locatorType; 
	}
	
	
	public  void main(String... args) {
		
	}

}
