package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage 
{
      @FindBy(name = "firstname")private WebElement name;
      @FindBy(name = "lastname")private WebElement lname;
      @FindBy(name = "email")private WebElement email;
      @FindBy(name = "password")private WebElement pswd;
      @FindBy(name = "agree")public WebElement ckbox;
      @FindBy(xpath = "//button[@type='submit']") private WebElement continu;
      
      public RegistrationPage(WebDriver driver)
      {
    	  PageFactory.initElements(driver, this);
      }
      
      
      public void enterName(String myname)
      {
    	  name.sendKeys(myname);
      }
      public void enterlName(String myLname)
      {
    	  lname.sendKeys(myLname);
      }
      public void enterEmail(String id)
      {
    	  email.sendKeys(id);
      }
      public void enterPwd(String pwd)
      {
    	  pswd.sendKeys(pwd);
      }
      public void chekBOx()
      {
    	  ckbox.click();
      }
      public void clickOnConti()
      {
    	  
    	  continu.click();
      }
}
