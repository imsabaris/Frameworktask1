package com.greens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.BaseClass;

public class GreensTestimonialPage extends BaseClass {
	public GreensTestimonialPage() {
		PageFactory.initElements(driver, this);
	}
	@FindAll({@FindBy(xpath="//img[@alt='Greenstechnology-logo']"),@FindBy(xpath="//img[@src='images/logo.png']")})
	private WebElement greensImage;
	
	@FindBy(xpath="//a[text()='TESTIMONIALS']")
	private WebElement testimonials;
	
	@FindBy(xpath="//a[text()='+91 8939 915 577 ']")
	private WebElement mobileNumber;
	
	@FindBy(xpath="//div[text()='Karthik ']")
	private WebElement pageDown;
	
	@FindBy(xpath="//div[contains(text(),' Selenium testing at Greens Technology ')]")
	private WebElement printText;

	public WebElement getGreensImage() {
		return greensImage;
	}

	public WebElement getTestimonials() {
		return testimonials;
	}

	public WebElement getMobileNumber() {
		return mobileNumber;
	}

	public WebElement getPageDown() {
		return pageDown;
	}

	public WebElement getPrintText() {
		return printText;
	}
	
}
