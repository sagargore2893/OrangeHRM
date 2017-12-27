package testClasses;

import junit.framework.Assert;
import common.BaseTest;
import pageClasses.HomePage;

public class HomePageTest extends BaseTest{
	
	public void verifyLogo(){
		HomePage homePage = new HomePage(driver);
		Assert.assertTrue(homePage.isLogoVisibleOnPge());
	}
}
