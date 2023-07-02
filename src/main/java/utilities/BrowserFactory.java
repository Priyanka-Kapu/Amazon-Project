package utilities;
/**
 * @author Priyanka
 *
 * 
 */

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BrowserFactory {
	
	
	public static WebDriver driver = null;
	
	public static WebDriver getDriver(String browser)
	{
		switch (browser.toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\priya\\Desktop\\Home\\SeleniumShortCuts\\WebDrivers_Selenium\\chromedriver.exe");
			driver = new ChromeDriver();		
			break;
        
		case "firefox":
        	System.setProperty("webdriver.gecko.driver","C:\\WebDrivers_Selenium\\geckodriver.exe");
        	driver = new FirefoxDriver();
			break;
			
        case "edge":
        	System.setProperty("webdriver.edge.driver", "C:\\WebDrivers_Selenium\\msedgedriver.exe");
        	driver = new EdgeDriver();
			break;
		default:
			System.out.println("Browser not supported for now.");
		}
		driver.manage().window().maximize();
		return driver;
	}
	
	
	public static void waitforCertaintime(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	
	
}
