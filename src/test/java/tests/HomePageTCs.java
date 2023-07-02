package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.HomePage;


/**
 * @author Priyanka
 *
 * 
 */
public class HomePageTCs extends BaseTest{

	//*********************************************************************************************************
	    @Test
		public void verifyLogo(){
	    	HomePage homepage = PageFactory.initElements(driver, HomePage.class);
	    	waitforCertaintime(driver);
	    	homepage.validateLogoImage();
		}

	
	
}
