package com.greens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.BaseClass;

public class GreensCourses extends BaseClass{
	public GreensCourses() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@href='courses.html']")
	private WebElement courses;
	@FindBy(xpath="//a[text()='Java Training ']")
	private WebElement javaTraining;
	@FindBy(xpath="//a[text()='Core Java Training']")
	private WebElement coreJava;
	@FindBy(xpath="//strong[text()='Java course in Chennai']")
	private WebElement pageDown;
	@FindBy(xpath="//h2[text()='Java training Reviews from Anitha']")
	private WebElement txtPrint;
	public WebElement getCourses() {
		return courses;
	}
	public WebElement getJavaTraining() {
		return javaTraining;
	}
	public WebElement getCoreJava() {
		return coreJava;
	}
	public WebElement getPageDown() {
		return pageDown;
	}
	public WebElement getTxtPrint() {
		return txtPrint;
	}
}
