package xyz_webPage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Login_xyz extends Baseclass_xyz {

	WebDriver driver;

	public Login_xyz(WebDriver driver) {
		this.driver = driver;
	}

	By managerLoginbtn = By.xpath("(//div[@class='center'])[2]/button");
	By custbtn = By.xpath("//div[@class='border box padT20 ng-scope']/div[1]/button[1]");
	By fnpath = By.xpath("(//div[@class='form-group'])[1]/input");
	By lnpath = By.xpath("(//div[@class='form-group'])[2]/input");
	By pcode = By.xpath("(//div[@class='form-group'])[3]/input");
	By adcusBtn = By.xpath("//button[@class='btn btn-default']");
	By accpath = By.xpath("//div[@class='border box padT20 ng-scope']/div[1]/button[2]");
	By drpdown = By.xpath("//select[@id='userSelect']");
	By drpdown2 = By.xpath("//select[@id='currency']");
	By submitbtn = By.xpath("//button[text()='Process']");
	By customerpath = By.xpath("//div[@class='border box padT20 ng-scope']/div[1]/button[3]");
	By custname = By.xpath("//input[@placeholder='Search Customer']");
	By accnumber = By.xpath("//tr[@class='ng-scope']/td[4]/span");
	
	
	public void Login() throws InterruptedException, IOException {

		waits(driver, Duration.ofSeconds(30), managerLoginbtn);
		WebElement managerLogin = driver.findElement(managerLoginbtn);
		ClickMethod(managerLogin);

		waits(driver, Duration.ofSeconds(30), custbtn);
		WebElement addCustomer = driver.findElement(custbtn);
		ClickMethod(addCustomer);

		waits(driver, Duration.ofSeconds(30), fnpath);
		WebElement fname = driver.findElement(fnpath);
		ClickMethod(fname);
		SendkeysMethod(fname, "Monisha");

		waits(driver, Duration.ofSeconds(30), lnpath);
		WebElement lsname = driver.findElement(lnpath);
		ClickMethod(lsname);
		SendkeysMethod(lsname, "M");

		waits(driver, Duration.ofSeconds(30), pcode);
		WebElement postcode = driver.findElement(pcode);
		ClickMethod(postcode);
		SendkeysMethod(postcode, "560037");
		
		

		WebElement addcust = driver.findElement(adcusBtn);
		ClickMethod(addcust);
		Thread.sleep(2000);
	
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File file = ts.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(file, new File("C:\\Users\\monimuru\\eclipse-workspace\\scenario\\test-output\\Screenshot_customerId:" + ".png"));


//		waits(driver, Duration.ofSeconds(30), adcusBtn);
		Alert a1 = driver.switchTo().alert();
		a1.accept();
		

		waits(driver, Duration.ofSeconds(30), accpath);
		WebElement account = driver.findElement(accpath);
		ClickMethod(account);
		Thread.sleep(2000);

		Select selt = new Select(driver.findElement(drpdown));
		selt.selectByIndex(6);
		Thread.sleep(2000);
		
		Select selt2 = new Select(driver.findElement(drpdown2));
		selt2.selectByIndex(3);
		Thread.sleep(2000);
		
		WebElement submit = driver.findElement(submitbtn);
		ClickMethod(submit);
		Thread.sleep(2000);

		Alert a2 = driver.switchTo().alert();
		a2.accept();
		
		waits(driver, Duration.ofSeconds(30), customerpath);
		WebElement customer = driver.findElement(customerpath);
		ClickMethod(customer);
		Thread.sleep(2000);
		
//		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 200)");
		waits(driver, Duration.ofSeconds(30), custname);
		WebElement Name = driver.findElement(custname);
		ClickMethod(Name);
		SendkeysMethod(Name, "Monisha");
		Thread.sleep(2000);
		
		WebElement AccountNumber = driver.findElement(accnumber);
		String text = AccountNumber.getText();
		System.out.println("Customer Account Number: " +text);
	}
	
		public void screenshot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:\\Users\\monimuru\\eclipse-workspace\\scenario\\test-output\\Screenshot_custDetails" + ".png"));

		
	}

}
