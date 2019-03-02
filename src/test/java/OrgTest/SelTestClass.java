package OrgTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SelTestClass {
	WebDriver driver;
	@BeforeClass
	public void setUp(){
		
		String driverPath = "C:\\Users\\giridhar\\workspace4\\SeleniumTest\\DriverServer\\Chrome\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		 driver = new ChromeDriver();
		
	}
	
	@Test
	public void testA(){
		
		driver.get("http://www.google.com");
		
		//testing the files in the 
		
		//new line added
		
		
	}
	
	@AfterClass
	public void testDown(){
		
		driver.quit();
		
	}

}
