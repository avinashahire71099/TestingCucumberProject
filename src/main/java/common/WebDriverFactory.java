package common;

import org.openqa.selenium.WebDriver;

public class WebDriverFactory {
	public static ThreadLocal<WebDriver> LocalStorage=new ThreadLocal<>();
	
	
	public static void setDriver(WebDriver dr)
	{
		LocalStorage.set(dr);
	}
	
	public static WebDriver getDriver()
	{
		return LocalStorage.get();
	}

}
