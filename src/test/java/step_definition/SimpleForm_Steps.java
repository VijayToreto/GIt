package step_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SimpleForm_Steps {
	WebDriver driver;
	@Given("User Opens the browser and navigate to training form website")
	public void user_opens_the_browser_and_navigate_to_training_form_website() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://v1.training-support.net/selenium/simple-form");
	  
	}

	@When("User Enters Firstname, Lastname, Email")
	public void user_enters_firstname_lastname_email() {
		driver.findElement(By.id("firstName")).sendKeys("demo");
		driver.findElement(By.id("lastName")).sendKeys("test");
		driver.findElement(By.id("email")).sendKeys("abc123@gmail.com");
	   
	}
	
	@When("Contact Number, Message")
	public void contact_number_message() {
		driver.findElement(By.id("number")).sendKeys("9876543210");
		driver.findElement(By.xpath("//div[@class='field']/textarea")).sendKeys("Hello!!");
	   
	}

	@When("Users clicks on Submit")
	public void users_clicks_on_submit() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	    
	}
	@Then("A Confirmation popup is Displayed")
	public void a_confirmation_popup_is_displayed() {
		System.out.println("Clicked on Submit");
		driver.quit();
	   
	}

}
