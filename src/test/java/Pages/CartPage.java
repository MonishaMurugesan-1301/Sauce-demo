package Pages;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//Scenario-2:Verfiy whether user is able to navigate to cart page and click on Continue shopping button and validate user can navigate back to home page

public class CartPage extends BaseClass {
	WebDriver driver;
	public CartPage(WebDriver driver) {
		this.driver = driver;
	}
	By price1 = By.xpath("(//div[@class='inventory_item_price'])[position()=3]");
    By add = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    By cart = By.xpath("//a[@class='shopping_cart_link']");
    By validation = By.xpath("//div[@class='inventory_item_name']");
    By price2 = By.xpath("//div[@class='inventory_item_price']");
    By remove = By.xpath("//button[@class='btn btn_secondary btn_small cart_button']");
	By contin = By.id("continue-shopping");
    
  public void Price_Before() {
	 waits(driver, Duration.ofSeconds(10),price1 );
	   WebElement p1 = driver.findElement(price1);
	   String a=	getTextMethod(p1);
//	   waits(driver, Duration.ofSeconds(10),price1_b );
//	   WebElement p2 = driver.findElement(price1_b);
//	   String b=	getTextMethod(p2);
	   System.out.println("price Before Adding : " +a );  
  }
   public void Add_Item() {
	   waits(driver, Duration.ofSeconds(10),add );
	   WebElement item = driver.findElement(add);
	   ClickMethod(item);
   }
   public void Cart_Button() {
	   waits(driver, Duration.ofSeconds(10),cart );
	   WebElement cartbtn = driver.findElement(cart);
	   ClickMethod(cartbtn);
   }
   public void Validating_Product() {
	   waits(driver, Duration.ofSeconds(10),validation );
	   WebElement pro = driver.findElement(validation);
	   String b=	getTextMethod(pro);
		System.out.println("Product Validation : " +b);
		
   }
   public void Price_After() {
	   waits(driver, Duration.ofSeconds(10),price2 );
	   WebElement p2 = driver.findElement(price2);
	   String c=	getTextMethod(p2);
		System.out.println("price After Adding : " +c);  
   }
   public void Remove() {
		 waits(driver, Duration.ofSeconds(10),remove);
		WebElement re = driver.findElement(remove);
		ClickMethod(re);
	}
  public void Continue_shopping() {
  waits(driver, Duration.ofSeconds(10),contin);
	WebElement con = driver.findElement(contin);
	ClickMethod(con);
	try {
		Thread.sleep(3000);
		}catch(Exception e) {
		}
}
}
