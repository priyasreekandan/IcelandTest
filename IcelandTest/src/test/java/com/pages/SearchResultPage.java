package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.runner.BaseAction;

public class SearchResultPage extends BaseAction {
	public void productlistingpage(){
		Assert.assertEquals("Search Results For \"double cream\"", driver.findElement(By.className("gotResults")).getText());
		
	}
	public void autoSearchOptions(){
		
		
		//Assert.assertEquals("Online Supermarket of the Year 2017", driver.findElement(By.linkText("Online Supermarket of the Year 2017")));
	}

}
