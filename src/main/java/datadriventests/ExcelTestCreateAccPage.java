package datadriventests;

import java.util.ArrayList;
import utilities.XlsReader;

/**
 * @author Priyanka
 *
 * 
 */

public class ExcelTestCreateAccPage {

static XlsReader reader;

public static ArrayList<Object[]> getDatafromExcel()
{
	
	ArrayList<Object[]> data = new ArrayList<Object[]>();
	
	try {
		
		reader = new XlsReader("C:\\Users\\priya\\Desktop\\AmazonProject\\TestData.xlsx");
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	for(int rowNum = 2; rowNum <= reader.getRowCount("CreateAccount"); rowNum++)
	{
		String Yourname = reader.getCellData("CreateAccount", "Yourname", rowNum);
		String phonenumber = reader.getCellData("CreateAccount", "phonenumber", rowNum);
		String passid = reader.getCellData("CreateAccount", "passid", rowNum);
		
		Object ob[] = {Yourname, phonenumber, passid};
		data.add(ob);
	}
	return data;
	
}
	
	
}
