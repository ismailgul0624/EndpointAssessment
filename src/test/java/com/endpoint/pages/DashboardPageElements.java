package com.endpoint.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.endpoint.utils.CommonMethods;

public class DashboardPageElements extends CommonMethods{

	@FindBy(xpath = "//*[@id=\"pt-userpage-2\"]/a/span")
	public WebElement accountName;
	

	@FindBy(xpath = "//input[@name='search']")
	public WebElement searchBox;
	
	@FindBy(xpath = "//button[@class='cdx-button cdx-button--action-default cdx-button--weight-normal cdx-button--size-medium cdx-button--framed cdx-search-input__end-button']")
	public WebElement searchButton;
	
	@FindBy(xpath = "//*[@id=\"ca-special-specialAssociatedNavigationLinks-link-1\"]/a")
	public WebElement viewWatchlists;
	
	@FindBy(xpath = "//*[@id=\"ca-watch\"]/a/span[1]")
	public WebElement starIcon;
	
	@FindBy(xpath = "//span[@class='vector-icon mw-ui-icon-watchlist mw-ui-icon-wikimedia-watchlist']")
	public WebElement watchlistIcon;
	
	@FindBy(xpath = "//span[@class='mw-page-title-main']")
	public WebElement title;
	
	
	@FindBy(xpath = "//*[@id=\"ca-unwatch\"]/a/span[1]")
	public WebElement removeStarIcon;
	
	@FindBy(xpath = "//*[@id=\"editwatchlist-ns0\"]")
	public WebElement editWatchlist;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[3]/main/div[3]/div[3]/div[1]/form/fieldset/div/div/div[2]/fieldset/div/div/div/div[2]/div/div/div/div/div/label[1]/span[2]/a")
	public WebElement firstRow;
	
	
	@FindBy(xpath = "/html/body/div[2]/div/div[3]/main/div[3]/div[3]/div[1]/form/fieldset/div/div/div[2]/fieldset/div/div/div/div[2]/div/div/div/div/div/label[2]/span[2]/a")
	public WebElement secondRow;
	
	
	
	
	
	
	
	public DashboardPageElements() {
		PageFactory.initElements(driver, this);
	}
	
	
}
