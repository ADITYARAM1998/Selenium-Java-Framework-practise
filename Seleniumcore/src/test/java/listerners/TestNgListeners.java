package listerners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNgListeners implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("@@@@ TEst STarted "+result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("@@@@ TEst Sucess "+result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("@@@@ TEst failed "+result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("@@@@ TEst Skipped "+result.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		System.out.println("@@@@ TEst STarted "+context.getName());
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("@@@@ TEst finshed "+context.getName());
		
	}

}
