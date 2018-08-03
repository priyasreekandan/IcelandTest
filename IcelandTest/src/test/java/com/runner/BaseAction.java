package com.runner;

import org.openqa.selenium.WebDriver;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.SearchResultPage;

public class BaseAction {
	public static WebDriver driver;
	public static HomePage homepage = new HomePage();
	public static LoginPage loginpage = new LoginPage();
	public static SearchResultPage searchresultpage = new SearchResultPage();
	
	

}
