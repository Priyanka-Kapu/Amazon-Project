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
public class SignInPage {
	
	
	WebDriver driver;
	
//**************************************************************************************************************
//Constructor
	
	public SignInPage(WebDriver driver){
		this.driver = driver;
	}
	
//**************************************************************************************************************
//WebElements To move from "Home Page"(https://www.amazon.in/) To "Sign in page"
//To move hover on "Hellow,sign in Accounts & Lists" Web element, creating "accounts" WB
	    
    @FindBy(how = How.XPATH, using = "//a[@id= 'nav-link-accountList']") WebElement accounts;

	
//Capturing WebElements of the Login page
	
	@FindBy(xpath = "//input[@id = 'ap_email']") WebElement userid;
	@FindBy(xpath = "//input[@id = 'continue']") WebElement continuebutton;
	@FindBy(how = How.XPATH, using = "//input[@id = 'ap_password']") WebElement password;
	@FindBy(how = How.XPATH, using = "//input[@id = 'signInSubmit']") WebElement signinButton;
	
	
//**************************************************************************************************************
//Methods to operate on above data of Sign in Page
		
       //First Move from "Home Page"(https://www.amazon.in/) To "Sign in Page"
		
		public void navigate(WebDriver driver) {
			
	    Actions act = new Actions(driver);
	    act.moveToElement(accounts).perform(); // To move hover on "Hellow,sign in Accounts & Lists" Web element
			
		// explicit wait - to wait for the "Sign in" button to be click-able
		WebElement signIn = new WebDriverWait(driver, Duration.ofSeconds(10))
		        .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-nav-role='signin']//span[text() = 'Sign in']")));
		// click on the "Sign in" button as soon as the it is visible
		signIn.click();			
	    }	
	
		//Sign in page methods
		
		//Email id, password are mandatory fields
		//*** Can log in using Email id/Mobile number
		public void SignInWithEmail(String emailid, String passid){
			userid.sendKeys(emailid);
			continuebutton.click();
			password.sendKeys(passid);
			signinButton.click();
		}
		
		
		//MobileNumber, password are mandatory fields
		//*** Can log in using Email id/Mobile number
		public void SignInWithNumber(String Mobilenumber, String passid){
					userid.sendKeys(Mobilenumber);
					continuebutton.click();
					password.sendKeys(passid);
					signinButton.click();
				}
		
	//**************************************************************************************************************
		
				
		
		

}
