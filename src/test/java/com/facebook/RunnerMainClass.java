package com.facebook;

import com.utilities.BaseClass;

public class RunnerMainClass extends BaseClass {
	public static void main(String[] args) {
		browserLaunch();
		loadUrl("https://www.facebook.com/");
		FacebookLoginPage fbLogin = new FacebookLoginPage();
		SqlData sql = new SqlData();
		btnClick(fbLogin.getLanguage());
		typeInput(fbLogin.getUserName(),sql.mai());
		typeInput(fbLogin.getPassword(), "sabari");
		btnClick(fbLogin.getLogIn());
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*FacebookHomePage fbHome = new FacebookHomePage();
		if (waitElementToLoacte("(//span[text()='Done'])[1]");) {
			
		}
		
		
		btnClick(fbHome.getMergeDone());
		waitElementToLoacte("(//span[text()='Next'])[1]");
		
		btnClick(fbHome.getNextStep());
		
		waitElementToLoacte("(//input[@name='opt_in_dark_mode_toggle'])[2]");
		btnClick(fbHome.getDarkMode());
		
		btnClick(fbHome.getGetStarted());*/
	}
}
