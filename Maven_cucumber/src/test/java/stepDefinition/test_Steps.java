package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class test_Steps {
		public static WebDriver driver;
	@Given("^user is on zerodha login page$")
	public void user_is_on_zerodha_login_page() throws Throwable {
	   System.setProperty("webdriver.chrome.driver", "/Maven_cucumber/src/main/resources/driverpath/chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.get("https://kite.zerodha.com");
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.manage().window().maximize();
	}

	@When("^user enters username$")
	public void user_enters_username() throws Throwable {
	   driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("XA0634");
	}

	@When("^user enters password$")
	public void user_enters_password() throws Throwable {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Sarika699!");
	}

	@When("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
		driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
	}

	@Then("^user navigate to pin page$")
	public void user_navigate_to_pin_page() throws Throwable {
	   System.out.println("user successfully navigate to pin page");
	}

	@When("^user enters pin$")
	public void user_enters_pin() throws Throwable {
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("691991");
	}

	@When("^click on continue button$")
	public void click_on_continue_button() throws Throwable {
		driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
	}

	@Then("^user navigate to dashboard page$")
	public void user_navigate_to_dashboard_page() throws Throwable {
	   System.out.println("user successfully navigate to Dashboard page");
	}


}
