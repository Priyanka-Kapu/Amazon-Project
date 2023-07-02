package tests;


import java.util.ArrayList;
import java.util.Iterator;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import datadriventests.ExcelTestCreateAccPage;
import pages.CreateAccountsPage;


public class CreateAccountsPageTCs extends BaseTest
{
	
//*********************************************************************************************************

@DataProvider (name = "excel-data")
public  Iterator<Object[]> getTestData()
{
  ArrayList<Object[]> testData = ExcelTestCreateAccPage.getDatafromExcel();
  return testData.iterator();
}


//*********************************************************************************************************
@Test(dataProvider = "excel-data")
	public void createAccount(String name, String mobileNumber, String password)
	{
	
	CreateAccountsPage createaccpage = PageFactory.initElements(driver, CreateAccountsPage.class);
	waitforCertaintime(driver);
	
	createaccpage.navigate(driver);
	createaccpage.createAccount(name, mobileNumber, password);
	}

//*********************************************************************************************************
	
}
