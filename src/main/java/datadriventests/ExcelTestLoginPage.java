package datadriventests;

import java.util.ArrayList;
import utilities.XlsReader;

/**
 * @author Priyanka
 *
 * 
 */
public class ExcelTestLoginPage {

	
	static XlsReader reader;

	public static ArrayList<Object[]> getDatafromExcel()
	{
		
		ArrayList<Object[]> data = new ArrayList<Object[]>();
		
		try {
			
			reader = new XlsReader("C:\\Users\\priya\\Desktop\\AmazonProject\\TestData.xlsx");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for(int rowNum = 2; rowNum <= reader.getRowCount("SigninwithMobile"); rowNum++)
		{
			String MobileNumber = reader.getCellData("SigninwithMobile", "MobileNumber", rowNum);
			String Passid = reader.getCellData("SigninwithMobile", "Passid", rowNum);

			
			Object ob[] = {MobileNumber, Passid};
			data.add(ob);
		}
		return data;
		
	}				
}
	
