package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageFactory {

	WebDriver driver;

	public HomePageFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//div[text()='Swag Labs']")
	private WebElement swagText;

	public WebElement getSwagText() {
		return swagText;
	}

	public void isSwagTextDisplayed(){
		getSwagText().isDisplayed();
	}
}
