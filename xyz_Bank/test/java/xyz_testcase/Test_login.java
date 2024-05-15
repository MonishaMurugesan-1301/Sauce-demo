package xyz_testcase;

import java.io.IOException;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import xyz_webPage.Login_xyz;

public class Test_login extends Driver_xyz {
	
	@Test
	
	public void testlogin() throws InterruptedException, IOException {
		
		Login_xyz lp = new Login_xyz(driver);
		
		lp.Login();
		lp.screenshot();
		
		
		test = report.startTest("Test_xyz");
		test.log(LogStatus.PASS, "Test is pass");
		report.endTest(test);
		report.flush();
	}
	
}
