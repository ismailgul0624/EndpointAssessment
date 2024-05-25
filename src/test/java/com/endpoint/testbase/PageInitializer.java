package com.endpoint.testbase;

import com.endpoint.pages.*;


public class PageInitializer extends BaseClass{
	
	public static LoginPageElements login;
	public static DashboardPageElements dashboard;
	
	public static void initialize() {
		login = new LoginPageElements();
		dashboard = new DashboardPageElements();
		
	}

}
