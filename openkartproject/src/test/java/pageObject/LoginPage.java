package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	
	@FindBy(id = "input-email")private WebElement email;
	@FindBy(id = "input-password")private WebElement pwd;
	@FindBy(xpath = "//button[@type='submit']")private WebElement logbutton;
	
	
	  public LoginPage(WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
	  }
         
	  
	  
	  public void enterEmail(String mailid)
	  {
		  email.sendKeys(mailid);
	  }
	  public void enterPassword(String pswd)
	  {
		  pwd.sendKeys(pswd);
	  }
	  public void clickOnloginButton()
	  {
		  logbutton.click();
	  }
}
