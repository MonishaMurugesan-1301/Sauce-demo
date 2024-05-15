package Pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.testng.Assert;

//Scenario-4: Verify whether user order the product.

public class ProductOrder extends BaseClass {
	public ProductOrder(WebDriver driver) {
		this.driver=driver;
	}
	By dropdwn = By.xpath("//span[@class='active_option']");
	By pro1 = By.id("add-to-cart-sauce-labs-onesie");
	By pro2 = By.id("add-to-cart-sauce-labs-bike-light");
	By pro3 = By.id("add-to-cart-sauce-labs-fleece-jacket");
	By Cart    = By.xpath("//a[@class='shopping_cart_link']");
	By check = By.xpath("//button[@class='btn btn_action btn_medium checkout_button ']");
	By frstname = By.id("first-name");
	By lstname  = By.id("last-name");
	By postcode = By.id("postal-code");
	By cont = By.id("continue");
	By finish = By.id("finish");
	By Text   = By.xpath("//h2[text()='Thank you for your order!']");
	By back = By.id("back-to-products");
	
public void dropdown() {
	 waits(driver, Duration.ofSeconds(10),dropdwn );
		WebElement drop = driver.findElement(dropdwn);
		Dropdown(drop, "Price (low to high)");
		try {
			Thread.sleep(3000);
			}catch(Exception e) {
			}
		String s = getTextMethod(drop);
		String act = "Price (low to high)";
		Assert.assertEquals(act, s);
		System.out.println("The products are displayed with price form low to high");
	}

	public void Product_1() {
		waits(driver, Duration.ofSeconds(10),pro1 );
		WebElement p1 = driver.findElement(pro1);
		ClickMethod(p1);
	}
	public void Product_2() {
		 waits(driver, Duration.ofSeconds(10),pro2 );

		WebElement p2 = driver.findElement(pro2);
		ClickMethod(p2);
	}
	public void Product_3() {
		 waits(driver, Duration.ofSeconds(10),pro3 );
		WebElement p3 = driver.findElement(pro3);
		ClickMethod(p3);
	}
	public void Add_to_Cart() {
		 waits(driver, Duration.ofSeconds(10),Cart );
		WebElement item = driver.findElement(Cart);
		ClickMethod(item);
	}
	public void Checkout() {
		waits(driver, Duration.ofSeconds(10),check );
		WebElement chkout = driver.findElement(check);
		ClickMethod(chkout);
	}
	public void Firstname(String FirstName) {
		//waits(driver, Duration.ofSeconds(10),frstname );
		WebElement fname= driver.findElement(frstname);
		//SendkeysMethod(fname, "Manasa");
		SendkeysMethod(fname, FirstName);
		
	}
	public void Lastname(String LastName) {
		 waits(driver, Duration.ofSeconds(10),lstname);
		WebElement lname = driver.findElement(lstname);
		//SendkeysMethod(lname, "Bethi");
		SendkeysMethod(lname, LastName);
		
	}
		
	public void Postal_Code( String PostalCode) {
		waits(driver, Duration.ofSeconds(10),postcode );
		WebElement pcode= driver.findElement(postcode);
		//SendkeysMethod(pcode, "505524");
		SendkeysMethod(pcode, PostalCode);
		try {
			takescreenshot("checkoutInformation");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	public void Continue() {
		 waits(driver, Duration.ofSeconds(10),cont );

		WebElement cntinue = driver.findElement(cont);
		ClickMethod(cntinue);
	}
	public void Finish() {
		 waits(driver, Duration.ofSeconds(10),finish );

		WebElement fnsh = driver.findElement(finish);
		ClickMethod(fnsh);
	}
	public void Confirmation_Text(){
		 waits(driver, Duration.ofSeconds(10),Text );

		WebElement text = driver.findElement(Text);
		String s=	getTextMethod(text);
		System.out.println("Confirmation text : " +s);
		
	}
	
	public void Back() {
		 waits(driver, Duration.ofSeconds(10),back );

		WebElement bck = driver.findElement(back);
		ClickMethod(bck);
		
		
	}
	
}
