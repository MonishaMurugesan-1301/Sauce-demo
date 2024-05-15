package Tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;


import Pages.CartPage;

public class CartPage_Test extends Driver {
	@Test
	public void CartPageMethd() {
		CartPage cp = new CartPage(driver);
		cp.Price_Before();
	    cp.Add_Item();
		cp.Cart_Button();
		cp.Validating_Product();
		cp.Price_After();
		cp.Remove();
		cp.Continue_shopping();
		
	}

}
