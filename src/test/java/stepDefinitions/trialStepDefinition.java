package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import pages.baseClass;

public class trialStepDefinition  {
	
WebDriver driver;
	
	@Given("^when user is in google site$")
	public void when_user_is_in_google_site() throws Throwable {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://www.google.com");
			
			driver.manage().window().maximize();
	}

	@When("^he searches 'Bangladesh'$")
	public void he_searches_Bangladesh() throws Throwable {
	  System.out.println("I am happy");
	}

	@Then("^he sees this result$")
	public void he_sees_this_result() throws Throwable {
		  System.out.println("I am 3rd line step");
	}



}
