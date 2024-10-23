package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.WebDriverFactory;

public class add {
	@FindBy(name = "btnAdd")
	WebElement addUser;

	public add() {
		PageFactory.initElements(WebDriverFactory.getDriver(), this);
	              }

	public addUserData addUser1() {
		addUser.click();
		return new addUserData();
	}
}
