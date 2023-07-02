package utilities;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

/**
 * @author Priyanka
 *
 * 
 */
public class Helper {
	

	//*************************************************************************************************************
	
	public static void captureScreenshotOnTestFail(String testMethodName, WebDriver driver) //Takes screenshot
	{
		String path_filedestination = "C:\\Users\\priya\\eclipse-workspace\\Amazon\\Screenshots\\" + testMethodName
				+ ".jpg";
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			
			FileUtils.copyFile(src, new File(path_filedestination));
			
		} catch (Exception e) {
			
			System.out.println("Unable to capture Screenshot." + e.getMessage());
		}
	}
	
	
	
	
}
