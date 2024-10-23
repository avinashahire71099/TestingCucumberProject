package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.WebDriverFactory;

public class LoginPage {
	@FindBy(id = "txtUsername")
	WebElement username;

	@FindBy(id = "txtPassword")
	WebElement password;

	@FindBy(id = "btnLogin")
	WebElement loginButton;

	public LoginPage() {
		PageFactory.initElements(WebDriverFactory.getDriver(), this);
	}

	public HomePage login(String strUsername, String strPassword) {
		
		username.sendKeys(strUsername);
		password.sendKeys(strPassword);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		loginButton.click();
		
		return new HomePage();
	}
}
