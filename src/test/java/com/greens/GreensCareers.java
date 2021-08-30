package com.greens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.BaseClass;

public class GreensCareers extends BaseClass {
	public GreensCareers() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='CAREERS']")
	private WebElement career;
	
	@FindBy(xpath="//a[@title='www.greenstechnologys.com.']")
	private WebElement pageDown;

	public WebElement getCareer() {
		return career;
	}

	public WebElement getPageDown() {
		return pageDown;
	}

}
