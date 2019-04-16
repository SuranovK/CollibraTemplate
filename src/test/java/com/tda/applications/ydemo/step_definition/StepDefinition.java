package com.tda.applications.ydemo.step_definition;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.tda.applications.ydemo.pages.HomePage;
import com.tda.applications.ydemo.utilities.ConfigurationReader;
import com.tda.applications.ydemo.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	HomePage homePage = new HomePage();
	
	
	@Given("User has right url")
	public void user_has_right_url() {
		System.out.println(ConfigurationReader.getProperty("url"));
	}

	@When("User typed url on browser")
	public void user_typed_url_on_browser() {
		System.out.println("User is navigated homepage");
		Driver.getDriver().get(ConfigurationReader.getProperty("url"));
	}

	@Then("User should be navigated home page")
	public void user_should_be_navigated_home_page() {
		String actualHomePageTitle = "Online Stock Trading, Investing, Online Broker | TD Ameritrade";
		String expectedHomePageTitle = Driver.getDriver().getTitle();
		assertEquals(expectedHomePageTitle, actualHomePageTitle);
	}
		@Given("User is home page")
		public void user_is_home_page() {
			System.out.println("User is on home page");
			Driver.getDriver().get(ConfigurationReader.getProperty("url"));
		}
		@When("User enters search term")
		public void user_enters_search_term() {
			homePage.searchBox.sendKeys("bitcoin");
		}
		@When("clicks the search button")
		public void clicks_the_search_button() {
			
			
			homePage.searchButton.click();
		
		}
		
		@Then("User should able to see search result")
		public void user_should_able_to_see_search_result() {
			String actualResult = homePage.searchResult.getText();
			String expectedResult = "184 results for bitcoin";
			assertEquals(expectedResult, actualResult);
		
		}




}
