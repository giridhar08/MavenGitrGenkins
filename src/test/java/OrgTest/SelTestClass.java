package OrgTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class SelTestClass {
	WebDriver driver;
	
	ExtentHtmlReporter reporter = new ExtentHtmlReporter("C:\\Users\\giridhar\\workspace8\\DemoProj\\test-output\\ExtentReports\\report.html");
	ExtentReports extent = new ExtentReports();
	ChromeOptions options;
    
	@BeforeClass
	public void setUp(){
		
		String driverPath = "C:\\Users\\giridhar\\workspace4\\SeleniumTest\\DriverServer\\Chrome\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		org.openqa.selenium.chrome.ChromeOptions chromeOptions = new ChromeOptions();
		options.addArguments("--start-maximized"); 
		driver = new ChromeDriver(options);
		 //driver.manage().window().maximize();
		
	}
	
	@Test
	public void testA(){
		
		
		
		extent.attachReporter(reporter);	
	    ExtentTest logger = extent.createTest("testA"); 
	    
	     
	    driver.get("http://www.google.com");
	    
	   logger.log(Status.INFO, "login GMAIL info");
	   logger.log(Status.PASS, "login pass");
		//testing the files in the 
		
	   extent.flush();
		//new line added
		//another line added
		//another line added to test jenkins
		
		
	}
	
	@Test
	public void testB(){
		
		
		
		ExtentTest logger = extent.createTest("testB"); 
	    
	     
	    driver.get("http://www.yahoo.com");
	    
	   logger.log(Status.INFO, "login YAHOO info");
	   logger.log(Status.PASS, "login pass");
		//testing the files in the 
		
	   extent.flush();
		//new line added
		//another line added
		//another line added to test jenkins
		
		
	}
	
	@AfterClass
	public void testDown(){
		
		driver.quit();
		
	}

}
