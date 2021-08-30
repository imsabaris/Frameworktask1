package com.greens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.BaseClass;

public class GreensTestimonial extends BaseClass{
	public GreensTestimonial() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Certifications']")
	private WebElement certification;
	
	@FindAll({
		@FindBy(xpath="(//a[text()='Course Content'])[29]"),
				@FindBy(xpath="(//a[@href='selenium-course-content.html'])[1]")})
	private WebElement seleniumCourse;
	
	public WebElement getCertification() {
		return certification;
	}

	public WebElement getSeleniumCourse() {
		return seleniumCourse;
	}

	public WebElement getGetTestimonial() {
		return getTestimonial;
	}
	@FindBy(xpath="//p[contains(text(),' I have taken Selenium training')]")
	private WebElement getTestimonial;
	
}
