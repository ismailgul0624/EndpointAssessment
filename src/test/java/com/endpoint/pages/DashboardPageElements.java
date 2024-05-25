package com.endpoint.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.endpoint.utils.CommonMethods;

public class DashboardPageElements extends CommonMethods{

	@FindBy(xpath = "/html/body/div[1]/header/div[2]/nav/div[1]/div[2]/div/ul/li/a/span")
	public WebElement accountName;
	

	@FindBy(xpath = "/html/body/div[1]/header/div[2]/div/div/div/form/div/div/div[1]/input")
	public WebElement searchBox;
	
	@FindBy(xpath = "//*[@id=\"ca-watch\"]/a/span[1]")
	public WebElement starIcon;
	
	@FindBy(xpath = "//*[@id=\"pt-watchlist-2\"]/a/span[1]")
	public WebElement watclistIcon;
	
	@FindBy(xpath = "//*[@id=\"firstHeading\"]/span")
	public WebElement title;
			
	
	
	public DashboardPageElements() {
		PageFactory.initElements(driver, this);
	}
	
	
}
