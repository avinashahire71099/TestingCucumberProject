
package common;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseSelenium {
	@BeforeMethod
	public void beforeEachTest()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		 WebDriverFactory.setDriver(new ChromeDriver());
		 WebDriverFactory.getDriver().manage().window().maximize();
		 WebDriverFactory.getDriver().get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@AfterMethod
	public void AfterEachTest()
	{
		
	//WebDriverFactory.getDriver().quit();
	}

}
