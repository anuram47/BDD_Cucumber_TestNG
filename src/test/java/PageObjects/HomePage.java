package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	By homePageEle = By.xpath("//div[text()='Swag Labs']");
	
	public void isSwagLabTextDisplayed() {
		driver.findElement(homePageEle).isDisplayed();
	}

}
