package testClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import common.BaseTest;
import pageClasses.HomePage;
import pageClasses.LoginPage;

public class LoginPageTest extends BaseTest{

	@Test
	public void loginWithCorrectCredential(){
		LoginPage loginPage = new LoginPage(driver);
		HomePage homePage = new HomePage(driver);
		loginPage.loginIntoPortal("Admin", "admin");
		Assert.assertTrue(homePage.isUserLoggedIn());
	}
	
	@Test
	public void loginWithInCorrectCredential(){
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginIntoPortal("Admin", "test123");
		Assert.assertEquals(loginPage.getCredentialMessage(), "Invalid credentials");
	}
}
