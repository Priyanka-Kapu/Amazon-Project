package tests;

import java.util.ArrayList;
import java.util.Iterator;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import datadriventests.ExcelTestLoginPage;
import pages.SignInPage;

/**
 * @author Priyanka
 *
 * 
 */

public class SignInPageTCs extends BaseTest {
//*********************************************************************************************************

	@DataProvider(name = "excel-data")
	public Iterator<Object[]> getTestData() {
		ArrayList<Object[]> testData = ExcelTestLoginPage.getDatafromExcel();
		return testData.iterator();
	}

//*********************************************************************************************************

	@Test(dataProvider = "excel-data")
	public void LogIn(String mobileNumber, String password) {
		SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);
		waitforCertaintime(driver);

		signInPage.navigate(driver);
		signInPage.SignInWithNumber(mobileNumber, password);
	}

//*********************************************************************************************************

}
