package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
	WebDriver driver;
	
	public LoginPageFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="user-name")
	private WebElement usernameTextbox;
	
	@FindBy(id="password")
	private WebElement passwordTextbox;
	
	@FindBy(id="login-button")
	private WebElement loginBtn;

	public WebElement getUsernameTextbox() {
		return usernameTextbox;
	}

	public WebElement getPasswordTextbox() {
		return passwordTextbox;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	
	public void enterUsername(String username) {
		getUsernameTextbox().sendKeys(username);
	}

	
	public void enterPassword(String password) {
		getPasswordTextbox().sendKeys(password);
	}
	
	public void clickOnLoginBtn() {
		getLoginBtn().click();
	}
}
