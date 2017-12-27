package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import common.BasePage;

public class HomePage extends BasePage{
	//WebDriver driver;

	@FindBy(id = "welcome")
	private WebElement welcomeLink;
	
	@FindBy(id = "dhksdjhf")
	private WebElement logo;
	
	public HomePage(WebDriver driver) {
		super(driver);
		//this.driver = driver;
		//PageFactory.initElements(driver, this);
	}
	
	public boolean isUserLoggedIn(){
		actions.applyImplicitWait(5);
		return welcomeLink.isDisplayed();
	}
	
	public boolean isLogoVisibleOnPge(){
		return logo.isDisplayed();
	}
}
