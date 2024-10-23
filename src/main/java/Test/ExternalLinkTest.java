package Test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExternalLinkTest {
	public static void main(String args[])
	{
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	WebDriver dr=new ChromeDriver();
	 dr.get("https://opensource-demo.orangehrmlive.com/");
	 dr.manage().window().maximize();
	 dr.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
	 
	 dr.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
	 
	 dr.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
	 
	 dr.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();
	 
	String OrangeHrmWindow=dr.getWindowHandle();
	
	Set<String> windowHandle=dr.getWindowHandles();
	
	for(String handle:windowHandle)
	{
		if(handle.contentEquals(OrangeHrmWindow))
		{
			dr.switchTo().window(handle);
			System.out.println(dr.getTitle());
		}
		else
		{
			dr.switchTo().window(handle);
			System.out.println(dr.getTitle());
			dr.close();
			
		}
	}
}
}
