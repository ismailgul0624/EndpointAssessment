package com.enpoint.testbase;

import com.endpoint.pages.DashboardPageElements;
import com.endpoint.pages.LoginPageElements;


public class PageInitializer extends BaseClass{
	
	public static LoginPageElements login;
	public static DashboardPageElements dashboard;
	
	public static void initialize() {
		login = new LoginPageElements();
		dashboard = new DashboardPageElements();
		
	}

}
