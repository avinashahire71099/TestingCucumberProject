package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import common.IInvokedMethodListenerImpl;
import common.WebDriverFactory;

@Listeners({IInvokedMethodListenerImpl.class})
public class AddUserText{
	
	
	
	  @Test
		public void loginSuccessful()
		{
			// TODO Auto-generated method stub
	    
	    	 
	    	 WebDriverFactory.getDriver().findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	    	 WebDriverFactory.getDriver().findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
			WebElement ds=WebDriverFactory.getDriver().findElement(By.xpath("//input[@id='btnLogin']"));
			ds.click();
			
		
			
		}
	    
	    
	   @Test
		public void loginUnsuccessfulUsername()
		{
	    	
	    	
	    	WebDriverFactory.getDriver().findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Avinash");
			WebDriverFactory.getDriver().findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
			WebElement ds=WebDriverFactory.getDriver().findElement(By.xpath("//input[@id='btnLogin']"));
			ds.click();
			
		}
	
	 @Test
		public void loginUnsuccessfulPassword()
		{
	    
	    	 
	    	WebDriverFactory.getDriver().findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	    	WebDriverFactory.getDriver().findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin");
			WebElement ds=WebDriverFactory.getDriver().findElement(By.xpath("//input[@id='btnLogin']"));
			ds.click();
			
		}
		
	    @Test
		public void loginUnsuccessfulUsernamePassword()
		{
	    	

	    	WebDriverFactory.getDriver().findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Avinash");
	    	WebDriverFactory.getDriver().findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
			WebElement ds=WebDriverFactory.getDriver().findElement(By.xpath("//input[@id='btnLogin']"));
			ds.click();
			
		}

}
