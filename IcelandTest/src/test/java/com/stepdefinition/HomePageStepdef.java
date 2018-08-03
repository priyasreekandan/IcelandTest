package com.stepdefinition;

import com.runner.BaseAction;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageStepdef extends BaseAction {
	@Given("^Guest User is on HomePage$")
	public void guest_User_is_on_HomePage() throws Throwable {
		homepage.homePage();
	}
	@Given("^Guest User close the pop up window$")
	public void guest_User_close_the_pop_up_window() throws Throwable {
	   homepage.closePopUp();
	}

	@Given("^Guest User click on the SearchTextBox$")
	public void guest_User_click_on_the_SearchTextBox() throws Throwable {
		homepage.searchTextBox();
	}
	@When("^Guest User enter valid SearchTerm$")
	public void guest_User_enter_valid_SearchTerm() throws Throwable {
	    homepage.SearchTerm();
	}
	@When("^Guest User click on SearchButton$")
	public void guest_User_click_on_SearchButton() throws Throwable {
		homepage.searchButton();
	    
	}
	@When("^Guest User enter valid first three characters in SearchTextBox$")
	public void guest_User_enter_valid_first_three_characters_in_SearchTextBox() throws Throwable {
	    homepage.autoSearch();
	}

	

}
