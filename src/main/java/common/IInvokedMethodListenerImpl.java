package common;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class IInvokedMethodListenerImpl implements IInvokedMethodListener {

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult itestResult) {
		// TODO Auto-generated method stub
		
		if(itestResult.isSuccess())
		{
			@SuppressWarnings("deprecation")
			String randomNumber=new Long(System.currentTimeMillis()).toString();
		takeScreenshot(method.getTestMethod().getMethodName()+randomNumber+".png");
		}
		WebDriverFactory.getDriver().quit();
	
		
		
	}

	@Override
	public void beforeInvocation(IInvokedMethod arg0, ITestResult arg1) {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
			 WebDriverFactory.setDriver(new ChromeDriver());
			 WebDriverFactory.getDriver().manage().window().maximize();
			 WebDriverFactory.getDriver().get("https://opensource-demo.orangehrmlive.com/");
		
		
		
	}
	
	public static void takeScreenshot(String FileNameWithPath)
	{
		
		File srcFile=((TakesScreenshot) WebDriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File(FileNameWithPath));
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}

}
