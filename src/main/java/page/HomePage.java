package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import common.WebDriverFactory;

public class HomePage {

	@FindBy(id = "welcome")
	WebElement welcomeText;

	public HomePage() {
		PageFactory.initElements(WebDriverFactory.getDriver(),this);
	}

	public Admin verifyWelcomeText(String expectedWelcomeText) {

		Assert.assertEquals(welcomeText.getText(),expectedWelcomeText);
		return new Admin();
	}
	
	

}
