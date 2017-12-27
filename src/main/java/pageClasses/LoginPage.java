package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import common.BasePage;

public class LoginPage extends BasePage{
	WebDriver driver;

	@FindBy(css = "#txtUsername")
	private WebElement usernameTextBox;
	
	@FindBy(css = "#txtPassword")
	private WebElement passwordTextBox;
	
	@FindBy(css = "#btnLogin")
	private WebElement loginButton;
	
	@FindBy(id = "spanMessage")
	private WebElement spanMessage;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		//this.driver = driver;
		//PageFactory.initElements(driver, this);
	}
	
	public void loginIntoPortal(String username, String password){
		actions.applyDefaultImplicitWait();
		usernameTextBox.sendKeys(username);
		actions.applyImplicitWait(5);
		passwordTextBox.sendKeys(password);
		actions.waitElementToBeClickable(loginButton, 5);
		loginButton.click();
	}
	
	public String getCredentialMessage(){
		actions.waitElementToBeClickable(loginButton, 5);
		return spanMessage.getText().trim();
	} 
}
