package xyz_testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ExtentManager;


public class Driver_xyz {

	WebDriver driver;
	
	public static ExtentReports report = ExtentManager.getInstance();
	public static ExtentTest test;
	
	@BeforeClass
	public void browsersetup() throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); 
	
		String actURL = "https://globalsqa.com/angularJs-protractor/BankingProject/#/login";
		driver.get("https://globalsqa.com/angularJs-protractor/BankingProject/#/login");
		driver.manage().window().maximize(); 
		driver.manage().deleteAllCookies(); 
		Thread.sleep(2000);
		
		String expURL = driver.getCurrentUrl();
		Assert.assertEquals(actURL, expURL); 
		System.out.println("Validation Successful"); 
	}

	
//	@AfterClass
//	public void closebrowser() {
//		
//		if (driver != null) {
//			driver.quit();
//		}
//	}

}
