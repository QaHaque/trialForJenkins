package stepDefinitions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import pages.baseClass;`

public class gettingThereSetpDefinitions {


	@Given("^i am walking$")
	public void i_am_walking() throws Throwable {
		System.out.println("1");
	}

	@When("^I get tired$")
	public void i_get_tired() throws Throwable {
		System.out.println("2");
	}

	@Then("^I will sit$")
	public void i_will_sit() throws Throwable {
		System.out.println("3");
	}

}
