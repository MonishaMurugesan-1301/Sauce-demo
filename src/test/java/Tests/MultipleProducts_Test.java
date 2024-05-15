package Tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Pages.MultipleProducts;

public class MultipleProducts_Test extends Driver {
	@Test
	public void MultipleproductsMethod() {
		MultipleProducts mp = new MultipleProducts(driver);
		mp.Adding_Product3();
		mp.Adding_Product1();
		mp.Cart_Icon();
		mp.ValidateText1();
		mp.ValidateText2();
        mp.Removing_Product();
		mp.Continue_Shopping();
	}

}
