package OrgTest;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
import com.aventstack.extentreports.utils.FileUtil;

public class SelTestClass {
	static WebDriver driver;
	
	static String filePath ="C:\\Users\\giridhar\\workspace8\\DemoProj\\test-output\\ExtentReports\\test.png";
	
	ExtentHtmlReporter reporter = new ExtentHtmlReporter("C:\\Users\\giridhar\\workspace8\\DemoProj\\test-output\\ExtentReports\\report.html");
	ExtentReports extent = new ExtentReports();
	ChromeOptions chromeOptions = new ChromeOptions();
    
	@BeforeClass
	public void setUp(){
		
		String driverPath = "C:\\Users\\giridhar\\workspace4\\SeleniumTest\\DriverServer\\Chrome\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		org.openqa.selenium.chrome.ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized"); 
		driver = new ChromeDriver(chromeOptions);
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
	public void testB() throws IOException{
		
		
		
		ExtentTest logger = extent.createTest("testB"); 
	    
	     
	    driver.get("http://www.yahoo.com");
	    
	   logger.log(Status.INFO, "login YAHOO info");
	   logger.log(Status.PASS, "login pass");
		//testing the files in the 
	   
	     logger.addScreenCaptureFromPath(SelTestClass.getScreenshot());
		
	   extent.flush();
		//new line added
		//another line added
		//another line added to test jenkins
		
		
	}
	
	
	public static String  getScreenshot() throws IOException{
		
		TakesScreenshot src = (TakesScreenshot)driver;
		
		File source = src.getScreenshotAs(OutputType.FILE);
		
		File destination = new File(filePath);
		FileUtils.copyFile(source, destination);
		
		
		return filePath;
		
	}
	
	
	@AfterClass
	public void testDown(){
		
		driver.quit();
		
	}

}
