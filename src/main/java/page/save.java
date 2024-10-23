package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.WebDriverFactory;

public class save {
	
	@FindBy(name="btnSave")
	WebElement savedata;
	
	public save() {
		PageFactory.initElements(WebDriverFactory.getDriver(),this);
	}
	
	public void savedata()
	{
		savedata.click();
	}

}
