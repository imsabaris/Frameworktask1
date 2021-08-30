package com.greens;

import java.util.Set;

import org.openqa.selenium.remote.BrowserType;

import com.utilities.BaseClass;

public class RunnerMainClass extends BaseClass {
	public static void main(String[] args) {
		browserLaunch();
		loadUrl("http://www.greenstechnologys.com/");
		GreensHomeScrollDown gsHome = new GreensHomeScrollDown();
		pageDownSCrollJs(gsHome.getScrollDown());
		getsText(gsHome.getScrollDown());
		pageUpScrollJs(gsHome.getScrollUp());
		getsText(gsHome.getScrollUpPrint());
		System.out.println("--------------------------------------------------------------");
		GreensTestimonial gt = new GreensTestimonial();
		
		btnClick(gt.getCertification());
		implicitWait();
		btnClick(gt.getSeleniumCourse());
		implicitWait();
		getsText(gt.getGetTestimonial());
		urlTitle();
		
		System.out.println("-----------------------------------------------------");
		GreensCourses gc = new GreensCourses();
		mouseHover(gc.getCourses());
		mouseHover(gc.getJavaTraining());
		mouseHover(gc.getCoreJava());
		actionClick(gc.getCoreJava());
		implicitWait();
		pageDownSCrollJs(gc.getPageDown());
		getsText(gc.getTxtPrint());
		
		System.out.println("---------------------------------------------------------");
		GreensCareers gcCar = new GreensCareers();
		btnClick(gcCar.getCareer());
		pageDownSCrollJs(gcCar.getPageDown());
		getsText(gcCar.getPageDown());
		
		
		Set<String> allWindows = driver.getWindowHandles();
		for (String window : allWindows) {
			System.out.println(window);
		}
		
		System.out.println("-----------------------------------------------------------");
		GreensTestimonialPage gtPage = new GreensTestimonialPage();
		pageUpScrollJs(gtPage.getGreensImage());
		clickJs(gtPage.getGreensImage());
		implicitWait();
		btnClick(gt.getCertification());
		implicitWait();
		waitElementToLoacte("//a[text()='TESTIMONIALS']");
		btnClick(gtPage.getTestimonials());
		implicitWait();
		getsText(gtPage.getMobileNumber());
		pageDownSCrollJs(gtPage.getPageDown());
		getsText(gtPage.getPrintText());
		
	}

}
