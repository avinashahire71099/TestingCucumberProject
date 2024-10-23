package Test;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import common.IInvokedMethodListenerImpl;
import page.LoginPage;
@Listeners({IInvokedMethodListenerImpl.class})
public class LoginTest{
	@Test
	public void verifyUserAdminLoginSuccessful()
	{
		
	LoginPage lp=new LoginPage();
	
	lp.login("Admin","admin123")
	.verifyWelcomeText("Welcome Paul")
	.adminpage()
	.addUser1()
	.addUser()
	.savedata();
		}
	
	}



