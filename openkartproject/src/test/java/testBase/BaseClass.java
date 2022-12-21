package testBase;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ResourceBundle;
import java.util.logging.FileHandler;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
       public static WebDriver driver;
       public ResourceBundle rb;
      public Logger logger;
	@BeforeClass
	@Parameters("browser")
	public void setup(String br)
	
	{
		logger=LogManager.getLogger(this.getClass()); 
		rb=ResourceBundle.getBundle("config");
         if(br.equals("chrome"))
		{
        	 WebDriverManager.chromedriver().setup();
        	 driver=new ChromeDriver();
		}
         else if (br.equals("edge"))
         {
        	 driver=new EdgeDriver();
			
		 }
         else  
         {
			driver=new FirefoxDriver();
		 }
        
        	 
         
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.get(rb.getString("url"));
		driver.manage().window().maximize();
		
	}
	
	
	public void captureScreenShot(String name) throws IOException
	{
		
		TakesScreenshot ts = ((TakesScreenshot)driver);
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\udhan\\eclipse-workspace\\openkartProject\\screenshots\\"+name+".png");
		org.openqa.selenium.io.FileHandler.copy(src, dest);
		
	}
	
	
	
	
	
}
