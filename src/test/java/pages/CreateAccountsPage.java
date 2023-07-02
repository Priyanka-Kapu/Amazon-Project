package pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Priyanka
 *
 * 
 */
public class CreateAccountsPage {
	
WebDriver driver;

//**************************************************************************************************************
public CreateAccountsPage(WebDriver driver)
{
	this.driver = driver;
}
//**************************************************************************************************************
    //WebElements To move from "Home Page"(https://www.amazon.in/) To "Create account page"
    //To move hover on "Hellow,sign in Accounts & Lists" Web element, creating "accounts" WB
    
    @FindBy(how = How.XPATH, using = "//a[@id= 'nav-link-accountList']") WebElement accounts;

//**************************************************************************************************************
    //WebElements of Create Accounts Page
    
	@FindBy(how = How.CSS  , using = "input#ap_customer_name") WebElement name;
	
	@FindBy(css = "input#ap_phone_number[data-validation-id = \"phoneNumber\"]") WebElement phoneNumber;

	@FindBy(how = How.XPATH, using = "//input[@id = \"ap_password\" ]") WebElement password;
	
	@FindBy(xpath = "//input[@id = \"continue\" ]") WebElement button;

//**************************************************************************************************************
//Methods to operate on above data of Create Accounts Page
//**************************************************************************************************************
	
	//First Move from "Home Page"(https://www.amazon.in/) To "Create account page"
	
	public void navigate(WebDriver driver) {
		
        Actions act = new Actions(driver);
		act.moveToElement(accounts).perform(); // To move hover on "Hellow,sign in Accounts & Lists" Web element
		
		// explicit wait - to wait for the "New Customer-Start here" link to be click-able
		WebElement signUp = new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text() = 'Start here.']")));
		// click on the link as soon as the it is visible
		signUp.click();
    }
	
	//Create Account page methods
	//Yourname, phonenumber, password are mandatory fields
	public void createAccount(String Yourname, String phonenumber, String passid)
	
	{
		name.sendKeys(Yourname);
		phoneNumber.sendKeys(phonenumber);
		password.sendKeys(passid);
		button.click();
	}
	
//**************************************************************************************************************
	
	

	
}
