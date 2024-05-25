package com.endpoint.steps;

import com.endpoint.utils.CommonMethods;
import com.endpoint.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps extends CommonMethods{
	
	
	@When("I enter a valid username")
	public void i_enter_a_valid_username() {
		sendText(login.username, ConfigsReader.getProperty("username"));
		
	}
	
	

	@When("I enter a valid password")
	public void i_enter_a_valid_password() {
		sendText(login.password, ConfigsReader.getProperty("password"));
	}
	
	

	@When("I click on the login button")
	public void i_click_on_the_login_button() {
		click(login.logInButton);
	}
	
	

	@Then("I validate that I am logged in")
	public void i_validate_that_i_am_logged_in() {
		
		String expected = "Jacqueline White";
		String actual = dashboard.accountName.getText();

		if (actual.equals(expected)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}
	   
	}
	
	
	@Given("user is logged in with valid credentials")
	public void user_is_logged_in_with_valid_credentials() {
		// This is done in the Hooks
		// setUp();
		
		login.adminLogin();
	}

}
