package tests;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {

	public static void main(String[] args) 
	
	{
		
		System.setProperty("webdriver.gecko.driver","C:\\WebDrivers_Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.in");
		WebElement element = driver.findElement(By.xpath("//a[@id= 'nav-link-accountList']"));		
		
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();	
		

		// explicit wait - to wait for the "Sign in" button to be click-able
	
		WebElement signIn = new WebDriverWait(driver, Duration.ofSeconds(10))
		        .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-nav-role='signin']//span[text() = 'Sign in']")));
		// click on the "Sign in" button as soon as the it is visible
		signIn.click();
		
		//driver.quit();

		
		//

		
	}

}
