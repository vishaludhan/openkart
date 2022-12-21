package utilities;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import testBase.BaseClass;

public class Listeners extends BaseClass  implements  ITestListener  
{
	
	
	public void onStart(ITestContext context)
	{
		
		
		
	}
	
	public void onFinish(ITestContext context) 
	{
		
		
	}
	
	public void onTestFailure(ITestResult result) 
	{
		try {
			captureScreenShot(result.getName());
			Reporter.log("screenshotTaken", true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
