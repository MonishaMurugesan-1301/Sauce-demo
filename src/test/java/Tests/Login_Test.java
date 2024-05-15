package Tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.Login;
 class Login_Test extends Driver {
	 
	@Test(dataProvider="getData")
	public void LoginMethod(String Username,String Password){
		
		Login lo = new Login(driver);
		lo.Credentials(Username,Password);
		lo.LoginButton();
		lo.LastProduct();
		lo.Product_Validation();
		lo.Remove();
		lo.Continue_shopping();
		
	}
	@DataProvider
	public Object[][] getData() {
	    String sheetname = "Login";
	    int rows = excel.getRowCount(sheetname);
	    int cols = excel.getColumnCount(sheetname);
	    
	    // Ensure that the data array size matches the number of rows
	    Object[][] data = new Object[rows - 1][cols];
	    
	    for (int rowNum = 2; rowNum <= rows; rowNum++) {
	        for (int colNum = 0; colNum < cols; colNum++) {
	            data[rowNum - 2][colNum] = excel.getCellData(sheetname, colNum, rowNum);
	        }
	    }
	    
	    return data;
	}
}
