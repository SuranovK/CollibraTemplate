package com.tda.applications.ydemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tda.applications.ydemo.utilities.Driver;

public class HomePage {
	//protected WebDriver driver; 
		public HomePage() {
			PageFactory.initElements(Driver.getDriver(), this);
			
		}
		
		@FindBy(id = "userid")
		public WebElement userName;

		@FindBy(id = "password")
		public WebElement password;

		@FindBy(xpath = "//*[@id=\"form-login\"]/div[1]/button")
		public WebElement loginButton;

		@FindBy(xpath = "//input[@name='iwPreActions']")
		public WebElement searchBox;
		
		@FindBy(xpath="//*[@id=\"search\"]/button")
		public WebElement searchButton;
		
		@FindBy(xpath="//p[@class='search-results-number']")
		public WebElement searchResult;


		
//		
//		public void login(String uid, String pwd) {
//			userName.sendKeys(uid);
//			password.sendKeys(pwd);
//			loginButton.click();
//
//	}
		
//		public void searchBoxFunction(String str) {
//			searchBox.sendKeys(str);
//			searchButton.click();
//			//searchBox.sendKeys(Keys.ENTER);
			
			
		}



