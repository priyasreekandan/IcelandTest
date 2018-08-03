package com.stepdefinition;

import com.runner.BaseAction;

import cucumber.api.java.en.Then;

public class SearchResultStepdef extends BaseAction {
	@Then("^the valid product should be display on the PLP$")
	public void the_valid_product_should_be_display_on_the_PLP() throws Throwable {
		searchresultpage.productlistingpage();
	    
	}
	@Then("^Guest User can able to see the autosearch options$")
	public void guest_User_can_able_to_see_the_autosearch_options() throws Throwable {
	    
	}


}
