package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.LogStatus;

import Tests.Driver;


public class CustomListeners extends Driver implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		test = report.startTest(result.getName());
		System.out.println("Test Starting");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(LogStatus.PASS, "Pass");
		report.endTest(test);
		report.flush();
		System.out.println("Test is success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

	@Override
	public void browserSetup() {
		// TODO Auto-generated method stub
		super.browserSetup();
	}

	@Override
	public void CloseBrowser() {
		// TODO Auto-generated method stub
		super.CloseBrowser();
	}
  
	

}
