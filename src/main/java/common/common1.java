package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class common1 {

	 public WebDriver dr;
	@BeforeMethod
	public void beforeEachTest()
	{
	
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		 dr=new ChromeDriver();
		 dr.get("https://opensource-demo.orangehrmlive.com/");
		 dr.manage().window().maximize();
	}
	
	@AfterMethod
	public void AfterEachTest()
	{
	//WebDriverFactory.dr.quit();
	}

}
