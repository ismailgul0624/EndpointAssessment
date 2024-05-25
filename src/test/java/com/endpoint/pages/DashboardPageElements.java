package com.endpoint.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.endpoint.utils.CommonMethods;

public class DashboardPageElements extends CommonMethods{

	@FindBy(xpath = "/html/body/div[1]/header/div[2]/nav/div[1]/div[2]/div/ul/li/a/span")
	public WebElement accountName;
	

	

	public DashboardPageElements() {
		PageFactory.initElements(driver, this);
	}
	
	
}
