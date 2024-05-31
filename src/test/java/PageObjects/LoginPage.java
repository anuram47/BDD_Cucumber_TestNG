package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	By un_textbox = By.id("user-name");
	By pwd_textbox = By.id("password");
	By loginBtn = By.id("login-button");

	public void enterUsername(String username) {
		driver.findElement(un_textbox).sendKeys(username);
	}

	public void enterPwd(String password) {
		driver.findElement(pwd_textbox).sendKeys(password);
	}

	public void clickOnLoginBtn() {
		driver.findElement(loginBtn).click();
	}

	public void userLogin(String username, String password) {
		driver.findElement(un_textbox).sendKeys(username);
		driver.findElement(pwd_textbox).sendKeys(password);
		driver.findElement(loginBtn).click();
	}

}
