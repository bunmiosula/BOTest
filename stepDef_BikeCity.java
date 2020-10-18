package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDef_BikeCity {
	WebDriver driver = null; 
	
	@Given("^I have the API is up and running$")
	public void i_have_the_API_is_up_and_running() throws Throwable {
		driver = new FirefoxDriver();


	}

	@When("^I enter the API Endpoint with the City and Location$")
	public void i_enter_the_API_Endpoint_with_the_City_and_Location() throws Throwable {
		driver.navigate().to("http://api.citybik.es/v2/networks/visa-frankfurt?fields=location"); 
		   Thread.sleep(3000);
	   
	}

	@When("^Germany is Country\\(DE\\)$")
	public void germany_is_Country_DE() throws Throwable {
		String countryText = driver.findElement(By.id("/network/location/country")).getText();
		System.out.println(countryText);
		countryText.contains("DE");
	  
	}

	@Then("^Frankfurt should be listed as a City$")
	public void frankfurt_should_be_listed_as_a_City() throws Throwable {
		String cityText = driver.findElement(By.id("/network/location/city")).getText();
		System.out.println(cityText);
		cityText.contains("Frankfurt");
	    
	}

	@Then("^the corresponding longitude and latitude should be displayed$")
	public void the_corresponding_longitude_and_latitude_should_be_displayed() throws Throwable {
		System.out.println(driver.findElement(By.id("/network/location/longitude")).getText());
		   System.out.println(driver.findElement(By.id("/network/location/latitude")).getText());
	   
	}



}
