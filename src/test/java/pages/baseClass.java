package pages;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseClass {

    
	protected WebDriver driver;
	
	@BeforeClass
	public void setupApplication()
	{
		
		
		
                driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		
	}
	
	
	@AfterClass
	public void closeApplication()
	{
		driver.quit();
		
		
	}	
}
