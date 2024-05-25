package com.endpoint.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.endpoint.utils.CommonMethods;
import com.endpoint.utils.ConfigsReader;

public class LoginPageElements extends CommonMethods{
	
	
	@FindBy(id = "wpName1")
	public WebElement username;

	@FindBy(id = "wpPassword1")
	public WebElement password;

	@FindBy(xpath = "/html/body/div[1]/header/div[2]/nav/div[1]/div[4]/div/ul/li[2]/a/span")
	public WebElement logInButton;
	
	public LoginPageElements() {
		PageFactory.initElements(driver, this);
	}
	
	public void adminLogin() {
		sendText(username, ConfigsReader.getProperty("username"));
		sendText(password, ConfigsReader.getProperty("password"));
		click(logInButton);
	}

}
