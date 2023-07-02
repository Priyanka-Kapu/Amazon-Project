package listerners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import utilities.BrowserFactory;
import utilities.Helper;

/**
 * @author Priyanka
 *
 * 
 */
public class TestFail extends Helper implements ITestListener  {
	
	 public void onTestFailure(ITestResult result) {
		 
		 System.out.println("Failed Test");
		 captureScreenshotOnTestFail(result.getMethod().getMethodName(), BrowserFactory.driver);
		 
	}


	

	
	
	
	
	
	
}
