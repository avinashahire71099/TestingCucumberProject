package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import common.WebDriverFactory;

public class addUserData {
	
	@FindBy(id="systemUser_userType")
	WebElement userRole;
	
	@FindBy(id="systemUser_employeeName_empName")
	WebElement employeeName;
	
	@FindBy(id="systemUser_userName")
	WebElement userName;
	
	
	
	@FindBy(id="systemUser_status")
	WebElement userStatus;
	
	@FindBy(id="systemUser_password")
	WebElement userPassword;
	
	@FindBy(id="systemUser_confirmPassword")
	WebElement userConformPassword;
	

	
	public addUserData() {
		PageFactory.initElements(WebDriverFactory.getDriver(),this);
	}
	
	public save addUser() {
		
	 Select user1=new Select(userRole);
	 user1.selectByVisibleText("Admin");
	 
	 employeeName.sendKeys("Cassidy Hope");
	 
	 userName.sendKeys("Avinashahire12345");
	 
	 Select status=new Select(userStatus);
	 status.selectByVisibleText("Disabled");
	 
	 userPassword.sendKeys("Avinash@123");
	 
	 userConformPassword.sendKeys("Avinash@123");
	 
	 
	 return new save();
	 
	 
	 
	 
		
		
	}
}
