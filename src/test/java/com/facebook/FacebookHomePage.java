package com.facebook;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.BaseClass;

public class FacebookHomePage extends BaseClass {
	public FacebookHomePage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//span[text()='Done'])[1]")
	private WebElement mergeDone;
	
	@FindBy(xpath="(//span[text()='Next'])[1]")
	private WebElement nextStep;
	
	@FindBy(xpath="(//input[@name='opt_in_dark_mode_toggle'])[2]")
	private WebElement darkMode;
	
	@FindBy(xpath="//span[text()='Get Started']")
	private WebElement getStarted;
	
		
	public WebElement getMergeDone() {
		return mergeDone;
	}
	public WebElement getNextStep() {
		return nextStep;
	}
	public WebElement getDarkMode() {
		return darkMode;
	}
	public WebElement getGetStarted() {
		return getStarted;
	}

}
