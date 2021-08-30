package com.greens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.BaseClass;

public class GreensHomeScrollDown extends BaseClass {
	public GreensHomeScrollDown() {
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="//p[contains(text(),'2019 greenstechnologys.com')]")
	private WebElement scrollDown;
	
	@FindBy(xpath="//font[text()='GREENS TECHNOLOGY']")
	private WebElement scrollUp;
	
	public WebElement getScrollDown() {
		return scrollDown;
	}

	public WebElement getScrollUp() {
		return scrollUp;
	}

	public WebElement getScrollUpPrint() {
		return scrollUpPrint;
	}
	@FindBy(xpath="//h1[contains(text(),'No 1 Software Training Institutes ')]")
	private WebElement scrollUpPrint;
}
