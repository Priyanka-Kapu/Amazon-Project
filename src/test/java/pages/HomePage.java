package pages;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Priyanka
 *
 * 
 */
public class HomePage {

	WebDriver driver;

//**************************************************************************************************************

	public HomePage(WebDriver driver) {
		super();
		this.driver = driver;
	}
//**************************************************************************************************************
//WebElements of Home Page
//**************************************************************************************************************

	@FindBy(how = How.XPATH, using = "//a[@id = \"nav-logo-sprites\"]")
	WebElement logo;
	@FindBy(how = How.XPATH, using = "//a[@id = \"nav-global-location-popover-link\"]")
	WebElement selectAddress;
	@FindBy(xpath = "//input[@id = \"GLUXZipUpdateInput\"]")
	WebElement pincode;
	@FindBy(xpath = "//span[@id = 'GLUXZipUpdate']")
	WebElement applyButton;
	@FindBy(xpath = "//input[@id = \"twotabsearchtextbox\"]")
	WebElement searchBox;
	@FindBy(how = How.XPATH, using = "//a[@id = \"icp-nav-flyout\"]")

	// LanguageCountry
	WebElement languageCountry;
	@FindBy(xpath = "//div[@id= 'icp-language-settings']//following::input[@value = 'te_IN']")
	WebElement changeLangTel;
	@FindBy(how = How.XPATH, using = "//div[@id= 'icp-language-settings']//following::input[@value = 'en_IN']")
	WebElement changLangEn;
	@FindBy(xpath = "//span[@id= 'icp-save-button']")
	WebElement saveChanges;

	@FindBy(how = How.XPATH, using = "//a[@id= 'nav-link-accountList']")
	WebElement accounts;
	@FindBy(how = How.XPATH, using = "//a[@id= 'nav-orders']")
	WebElement returnsAndOrders;
	@FindBy(how = How.CSS, using = "a#nav-cart")
	WebElement cart;

//**************************************************************************************************************
//Methods to operate on above data of Home Page
//**************************************************************************************************************

	public void validateLogoImage() {
		// validation1: Check Logo
		Boolean ImagePresent = (Boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].complete "
				+ "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", logo);
		if (!ImagePresent) {
			System.out.println("Image not displayed.");
		} else {
			System.out.println("Image displayed.");
		}
	}

	public void isLogoClickable() {
		// validation2: Redirect- to Home page
		logo.click();
	}

	public void addPincode(String pinCode) {
		selectAddress.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		pincode.sendKeys(pinCode);
		alert.accept();
		// or
		applyButton.click();
	}

	public void searchProduct(String word) {
		searchBox.sendKeys(word);
		searchBox.sendKeys(Keys.ENTER);
	}

	public void languageChangeToTel() {
		languageCountry.click();
		changeLangTel.click();
		saveChanges.click();
	}

	public void languageChangeToEn() {
		languageCountry.click();
		changLangEn.click();
		saveChanges.click();
	}

}
