package Pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

//Scenario-5: Verify whether user can reset the application state.

public class Reset_App extends BaseClass{
    WebDriver driver;
    public Reset_App(WebDriver driver) {
    	this.driver=driver;
	}
    By drop = By.xpath("//select[@class='product_sort_container']");
    By allitems = By.xpath("//div[@class='inventory_list']");
    By item_1 = By.id("add-to-cart-sauce-labs-backpack");
    By item_2 = By.id("add-to-cart-sauce-labs-bike-light");
    By item_3 = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    By crticon = By.xpath("//a[@class='shopping_cart_link']/child::span[text()=3]");
    By menubar1 = By.id("react-burger-menu-btn");
    By reset = By.id("reset_sidebar_link");
    By icon = By.xpath("//a[@class='shopping_cart_link']");
    By menubar2 = By.id("react-burger-menu-btn");
    By logout = By.id("logout_sidebar_link");
    
    public void Drop_down() {
    //	WebElement drpdwn = driver.findElement(drop);
    	Select s = new Select(driver.findElement(drop));
    	try {
			Thread.sleep(3000);
			}catch(Exception e) {
			}
    	
//   	 List <WebElement> op = driver.findElements(allitems);
//    	 int size = op.size();
//         for(int i =0; i<size ; i++){
//            String options = op.get(i).getText();
//            System.out.println("Options are:"+options);
//         }
    }
    public void Adding_Items() {
    	WebElement i1 = driver.findElement(item_1);
    	ClickMethod(i1);	
    	WebElement i2 = driver.findElement(item_2);
    	ClickMethod(i2);
    	WebElement i3 = driver.findElement(item_3);
    	ClickMethod(i3);
    	WebElement cart = driver.findElement(crticon);
    	ClickMethod(cart);
    	WebElement Icon = driver.findElement(crticon);
      	ClickMethod(Icon);
//   	String s = getTextMethod(Icon);
     	String expected="3";
    	String s2=	getTextMethod(Icon);
		System.out.println("The Added Products to the Cart are:" +s2);
		Assert.assertEquals(s2, expected);
		System.out.println("Validation successful");
		System.out.println("Products added Suucessfully");
        
    }
    public void Menu_bar1() {
    	WebElement mbar1 = driver.findElement(menubar1);
    	ClickMethod(mbar1);
    }
    public void Reset_App() {
    	WebElement resetapp = driver.findElement(reset);
    	ClickMethod(resetapp);	
    	WebElement i = driver.findElement(icon);
    	String s2 = getTextMethod(i);
    	System.out.println("The products in cart are:"+s2);
      	String act = "";
      	Assert.assertEquals(act, s2);
      	System.out.println("There are no Products in Cart");
      }
//    public void Menu_bar2() {
//    	WebElement mbar2 = driver.findElement(menubar2);
//    	ClickMethod(mbar2);
//    }
    public void Logout() {
    	WebElement lgout = driver.findElement(logout);
    	ClickMethod(lgout);
    	
    }
    
    
}

