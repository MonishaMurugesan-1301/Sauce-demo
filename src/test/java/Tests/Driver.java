package Tests;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Utilities.ExcelReader;
import Utilities.ExtentManager;
public class Driver {
	public static WebDriver driver;
	public static ExtentReports report = ExtentManager.getInstance();
	public static ExtentTest test;
	public static ExcelReader excel= new ExcelReader("C:\\Users\\BEMANASA\\eclipse-workspace\\SauceDemo_1\\src\\test\\resources\\Excel\\SauceAddress.xlsx");
	@BeforeSuite
	public void browserSetup() {
			
			System.setProperty("WebDriver.Edge.driver","C://Users//BEMANASA//Downloads//edgedriver_win64//msedgedriver.exe");
			//System.setProperty("WebDriver.edge.driver", ("user dir")+ "msedgedriver.exe"); 
			driver = new EdgeDriver();
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			
		 }
			@AfterSuite
			public void CloseBrowser() {
				if(driver!=null) {
					driver.quit();
					
					
				}
			}
	}

