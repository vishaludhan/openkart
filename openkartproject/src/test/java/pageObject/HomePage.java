package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	//thise is mybranch code
	@FindBy(xpath = "//span[text()='My Account']")private WebElement myAccDrpdwn;
	@FindBy(xpath = "//a[text()='Register']") private WebElement regButton;
	@FindBy(linkText = "Login")private WebElement loginbutton;
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnMyAcc()
	{
		myAccDrpdwn.click();
	}
	
	public void clickOnRegButton()
	{
		regButton.click();
	}
	
	public void clickonLoginButton()
	{
		loginbutton.click();
	}
	
	
	

}
