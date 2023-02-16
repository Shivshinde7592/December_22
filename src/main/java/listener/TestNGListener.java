package listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import driverfactory.DriverFactory;
import util.ScreenshotUtil;


public class TestNGListener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
        System.out.println("OnTestStart");
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestSuccess");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		//ScreenshotUtil.takeScreenshot(DriverFactory.getDriver(),result.getMethod().getMethodName());
		System.out.println("onTestFailure");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestSkipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestFailedButWithinSuccessPercentage");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("onTestFailedWithTimeout");
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("onStart");
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("onFinish");
	}


}
