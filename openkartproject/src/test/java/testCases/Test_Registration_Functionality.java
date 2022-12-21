package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.RegistrationPage;
import testBase.BaseClass;

public class Test_Registration_Functionality extends BaseClass

{
	HomePage hm;
	RegistrationPage rg;
	
	@Test
	public void testReggFunction() throws InterruptedException
	{
		logger.info("*******program started*********");
		hm=new HomePage(driver);
		hm.clickOnMyAcc();
		logger.info("clicked on my account");
		hm.clickOnRegButton();
		logger.info("clicked on my registration");
		rg=new RegistrationPage(driver);
		rg.enterName("vishal");
		logger.info("entered name");
		rg.enterlName("udhan");
		logger.info("entered Lastname");
		rg.enterEmail("agdft12@gmail.com");
		logger.info("entered gmail");
		rg.enterPwd("123456");
		logger.info("entered password");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", rg.ckbox);
		logger.info("scrolled into view");
		Thread.sleep(500);
		rg.chekBOx();
	 
		logger.info("checkbox cheked");
		rg.clickOnConti();
		logger.info("clicked on continue");
		
		logger.info("*******program ended*********");
		
	}
	
	
	

}
