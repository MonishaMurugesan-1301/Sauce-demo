package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//Scenario-3:Verify whether user can add multiple product to the cart and remove any product from the cart.

public class MultipleProducts extends BaseClass {
	public MultipleProducts(WebDriver driver) {
		this.driver = driver;
	}
    By pro1 = By.xpath("(//button[@class='btn btn_primary btn_small btn_inventory '])[position()=3]");
    By pro2 = By.id("add-to-cart-sauce-labs-backpack");
    By cart = By.xpath("//a[@class='shopping_cart_link']");
    By validate1 = By.xpath("(//div[@class='inventory_item_name'])[1]");
    By validate2   = By.xpath("(//div[@class='inventory_item_name'])[2]");
    By remove2 = By.xpath("(//button[@class='btn btn_secondary btn_small cart_button'])[2]");
    By cont = By.id("continue-shopping");
    
    public void Adding_Product3() {
    	WebElement a = driver.findElement(pro1);
    	ClickMethod(a);
    }
    public void Adding_Product1() {
    	WebElement b = driver.findElement(pro2);
    	ClickMethod(b);
    }
    public void Cart_Icon() {
    	WebElement c = driver.findElement(cart);
    	ClickMethod(c);
    }
    public void ValidateText1() {
    	WebElement v1 = driver.findElement(validate1);
 	   String d=	getTextMethod(v1);
 	   System.out.println("Text Validation1 : " +d );  	
    }
    public void ValidateText2() {
    	WebElement v2 = driver.findElement(validate2);
 	   String e =	getTextMethod(v2);
 	   System.out.println("Text Validation2 : " +e);  	
    }
    public void Removing_Product() {
    	WebElement f = driver.findElement(remove2);
    	ClickMethod(f);	
    }
    public void Continue_Shopping() {
    	WebElement g = driver.findElement(cont);
    	ClickMethod(g);
    	try {
			Thread.sleep(3000);
			}catch(Exception e) {
			}
    }
}
