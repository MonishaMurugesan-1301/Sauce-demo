package Tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Pages.Reset_App;


public class Reset_App_Test extends Driver{

	@Test
	public void ResetAppMethod() {
		Reset_App reap = new Reset_App(driver);
		reap.Drop_down();
		reap.Adding_Items();
		reap.Menu_bar1();
		reap.Reset_App();
		//reap.Menu_bar2();
		reap.Logout();
		
		
	}
}
