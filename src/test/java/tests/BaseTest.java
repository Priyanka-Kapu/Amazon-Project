package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import utilities.BrowserFactory;

/**
 * @author Priyanka
 *
 * 
 */
public class BaseTest extends BrowserFactory {

	public static WebDriver driver = null;

	@BeforeMethod
	@Parameters({ "browserInstance", "url" })

	public WebDriver setUp(String browser, String url)

	{
		driver = getDriver(browser); // Browser Set up
		waitforCertaintime(driver);
		driver.get(url);

		return driver;
	}

	@AfterMethod

	public void tearDown() {
		driver.quit();
	}

}
