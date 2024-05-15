package Tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Pages.ProductOrder;
public class ProductOrder_Test extends Driver {
	@Test(dataProvider="getData")
	public void ProductOrderMethod(String FirstName,String LastName,String PostalCode) {
		ProductOrder po = new ProductOrder(driver);
		po.Product_1();
		po.Product_2();
		po.Product_3();
		po.Add_to_Cart();
		po.Checkout();
		po.Firstname(FirstName);
		po.Lastname(LastName);
		po.Postal_Code(PostalCode);
		po.Continue();
		po.Finish();
		po.Confirmation_Text();
	    po.Back();
		
	}
	@DataProvider
	public Object[][] getData() {
		String sheetname = "Data";
		int rows = excel.getRowCount(sheetname);
		int cols = excel.getColumnCount(sheetname);
		Object[][] data = new Object[rows - 1][cols];// object[1][1]
		for (int rowNum = 2; rowNum <= rows; rowNum++) {
			for (int colNum = 0; colNum <cols; colNum++) {
				// data[0][0]
				data[rowNum - 2][colNum] = excel.getCellData(sheetname, colNum, rowNum);
			}
		}
		return data;
	}

}
