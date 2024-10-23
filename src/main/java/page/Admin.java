package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.WebDriverFactory;

public class Admin {
	@FindBy(id="menu_admin_viewAdminModule")
	WebElement admin;
	
	public Admin()
	{
	PageFactory.initElements(WebDriverFactory.getDriver(),this);
	}
	
	public add adminpage()
	{
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		admin.click();
		return new add();
	}
	
		
	

}
