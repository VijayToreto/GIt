package step_definition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DatadrivenForm_steps {
	WebDriver driver;
	@Given("User Opens the Chrome browser and navigate to form website")
	public void user_opens_the_chrome_browser_and_navigate_to_form_website() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://v1.training-support.net/selenium/simple-form");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
	}

	@When("User Enters {string}, {string}, {string}")
	public void user_enters(String FirstName, String LastName, String Email) throws InterruptedException {
		driver.findElement(By.id("firstName")).sendKeys(FirstName);
		Thread.sleep(1000);
		driver.findElement(By.id("lastName")).sendKeys(LastName);
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys(Email);
		Thread.sleep(1000);
	    
	}

	@When("User Enters {string}, {string}")
	public void user_enters(String ContactNumber, String Message) throws InterruptedException {
		driver.findElement(By.id("number")).sendKeys(ContactNumber);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='field']/textarea")).sendKeys(Message);
		Thread.sleep(1000);
	    
	}

	@When("Users clicked on Submit button")
	public void users_clicked_on_submit_button() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	   
	}

	@Then("All the data entered successfully")
	public void all_the_data_entered_successfully() throws InterruptedException {
		System.out.println("Clicked on Submit");
		Alert al= driver.switchTo().alert();
		Thread.sleep(1000);
		al.accept();
		Thread.sleep(900);
		driver.close();
	    
	}

}
