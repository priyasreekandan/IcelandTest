package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.runner.BaseAction;

public class HomePage extends BaseAction {
	public static String WEB_URL = "https://groceries.iceland.co.uk/";
	public void homePage(){
		
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/priyahari/Documents/Automation290718/chromedriver.exe");
		//C:\Users\priyahari\Documents\Downloads
		driver = new ChromeDriver();
		driver.get(WEB_URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
	}
	public void closePopUp(){
		driver.findElement(By.cssSelector((".fa.fa-close"))).click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//driver.findElement(By.id("dgfhh").
		
	}
	public void searchTextBox(){
		//driver.findElement(By.cssSelector("#searchText")).clear();
		//driver.findElement(By.cssSelector("#searchText")).click();
		driver.findElement(By.id("searchText")).clear();
		driver.findElement(By.id("searchText")).click();
		
	}
	public void SearchTerm(){
		//driver.findElement(By.cssSelector("#searchText")).clear();
		//driver.findElement(By.cssSelector("#searchText")).sendKeys("double cream");
		driver.findElement(By.id("searchText")).clear();
		driver.findElement(By.id("searchText")).sendKeys("double cream");
		
		
		
	}
	public void searchButton(){
		driver.findElement(By.cssSelector("#search")).click();
	}
	public void autoSearch(){
		
		 driver.findElement(By.cssSelector("#searchText")).sendKeys("dou");
		
		 WebElement element = driver.findElement(By.id("autocompleteDiv"));
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		//driver.findElement(By.name("double cream")).click();
		//driver.findElement(By.linkText("double cream")).click();
		//driver.findElement(By.cssSelector(".searchBtnContainer")).click();
		
	
		
	}
	
	
}
	
	


