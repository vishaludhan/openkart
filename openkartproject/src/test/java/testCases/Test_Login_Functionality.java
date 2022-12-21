package testCases;

import java.time.Duration;

import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.LoginPage;
import testBase.BaseClass;

public class Test_Login_Functionality extends BaseClass
{

	HomePage hm;
	LoginPage lg;
	
	
	
	@Test
	public void validateLoginFuctinality() throws InterruptedException
	{
		hm=new HomePage(driver);
		lg=new LoginPage(driver);
		hm.clickOnMyAcc();
		hm.clickonLoginButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		lg.enterEmail(rb.getString("email"));
		Thread.sleep(1000);
		lg.enterPassword(rb.getString("password"));
		Thread.sleep(1000);
		lg.clickOnloginButton();
	}
	
	
}
