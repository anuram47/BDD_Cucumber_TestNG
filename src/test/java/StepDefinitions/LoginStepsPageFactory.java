package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageFactory.HomePageFactory;
import PageFactory.LoginPageFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepsPageFactory {

	static WebDriver driver;
	LoginPageFactory loginPageFactoryObj ;
	HomePageFactory homePageFactoryObj;

	@Given("User is on login page")
	public void user_is_on_login_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.saucedemo.com/");
	}

	@When("^User enter the valid (.*) and (.*)$")
	public void user_enter_the_valid_username_and_password(String username, String password) {
		loginPageFactoryObj = new LoginPageFactory(driver);
		loginPageFactoryObj.enterUsername(username);
		loginPageFactoryObj.enterPassword(password);

		//driver.findElement(By.id("user-name")).sendKeys(username);
		//driver.findElement(By.id("password")).sendKeys(password);
	}

	@And("Clicks on login button")
	public void clicks_on_login_button() {
		loginPageFactoryObj = new LoginPageFactory(driver);
		loginPageFactoryObj.clickOnLoginBtn();
		//driver.findElement(By.id("login-button")).click();
	}

	@Then("User is navigate to home page")
	public void user_is_navigate_to_home_page() {
		homePageFactoryObj = new HomePageFactory(driver);
		homePageFactoryObj.isSwagTextDisplayed();
		//Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Swag Labs']")).isDisplayed());
	}

	@And("Close the Browser")
	public void close_the_browser() {
		driver.quit();
	}


}