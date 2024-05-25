package com.endpoint.steps;

import com.endpoint.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WatchlistSteps extends CommonMethods {

	@When("user clicks on search box")
	public void user_clicks_on_search_box() {
		click(dashboard.searchBox);
		wait(3);
	}

	@When("user enters first {string}")
	public void user_enters_first(String string) {
		wait(3);
		sendText(dashboard.searchBox, string);
	}

	@When("user clicks on search button")
	public void user_clicks_on_search_button() {
		wait(3);
		click(dashboard.searchButton);
		
	}
	
	@When("user clicks on star icon")
	public void user_clicks_on_star_icon() {
		wait(3);
		click(dashboard.starIcon);
		wait(2);
	}

	

	@When("user enters second {string}")
	public void user_enters_second(String string) {
		wait(3);
		sendText(dashboard.searchBox, string);
	}
	
	
	@When("user clicks on watchlist icon")
	public void user_clicks_on_watchlist_icon() {
		wait(3);
		click(dashboard.watchlistIcon);
	}

	
	@When("user clicks on View and Edit Watchlist")
	public void user_clicks_on_view_and_edit_watchlist() {
		wait(15);
		click(dashboard.viewWatchlists);
	}
	
	@Then("validate that watchlist include USA and Canada")
	public void validate_that_watchlist_include_usa_and_canada() {
		
		String expected = "Canada";
		String actual = dashboard.firstRow.getText();

		if (actual.equals(expected)) {
			System.out.println("Canada is on the watchlist page");
		} else {
			System.out.println("Test Failed");
		}
		
		String expected2 = "United States";
		String actual2 = dashboard.secondRow.getText();

		if (actual2.equals(expected2)) {
			System.out.println("United States is on the watchlist page");
		} else {
			System.out.println("Test Failed");
		}
		
	}

	
	
	@When("user clicks on star icon to remove")
	public void user_clicks_on_star_icon_to_remove() {
		wait(3);
		click(dashboard.removeStarIcon);
		wait(2);
	}
	
	
	
	@Then("validate that Canada removed from watchlist")
	public void validate_that_canada_removed_from_watchlist() {
		String expected = "Canada";
		String actual = dashboard.firstRow.getText();

		if (actual.equals(expected)) {
			System.out.println("Canada still on the watchlist");
		} else {
			System.out.println("Canada Removed");
		}
	}

	@Then("validate that USA still on the watchlist page")
	public void validate_that_usa_still_on_the_watchlist_page() {
		String expected2 = "United States";
		String actual2 = dashboard.firstRow.getText();

		if (actual2.equals(expected2)) {
			System.out.println("USA still on the watchlist page");
		} else {
			System.out.println("Test Failed");
		}
	}

	
	@Then("user clicks on article")
	public void user_clicks_on_article() {
		click(dashboard.firstRow);
	}
	
	@Then("validate that title matches")
	public void validate_that_title_matches() {
		String expected2 = "United States";
		String actual2 = dashboard.title.getText();

		if (actual2.equals(expected2)) {
			System.out.println("Title Matched");
		} else {
			System.out.println("Test Failed");
		}
	}

}
