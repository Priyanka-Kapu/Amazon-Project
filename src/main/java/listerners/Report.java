package listerners;

import java.util.List;
import java.util.Map;
import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.xml.XmlSuite;

/**
 * @author Priyanka
 *
 * 
 */
public class Report implements IReporter
{
	  public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory)
	  {
	      //Iterate over every suite assigned for execution
		  for(ISuite suite: suites){
			  String suiteName = suite.getName();
			  
			  Map<String, ISuiteResult> suiteResults = suite.getResults();
			  
			  for(ISuiteResult suiteResult:suiteResults.values() ){
				
				  ITestContext tc = suiteResult.getTestContext();
				  
				  System.out.println("Passed tests for suite '" + suiteName +
			               "' is:" + tc.getPassedTests().getAllResults().size());
			      System.out.println("Failed tests for suite '" + suiteName +
			               "' is:" + tc.getFailedTests().getAllResults().size());
			      System.out.println("Skipped tests for suite '" + suiteName +
			               "' is:" + tc.getSkippedTests().getAllResults().size());			  
			  }
		  }
	  }
}
