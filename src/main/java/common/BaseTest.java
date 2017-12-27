package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	protected WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}

	@BeforeMethod
	public void setDriver() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")  + "//lib//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://opensource.demo.orangehrmlive.com/");
	}
	
	@AfterMethod
	public void quitBrowser(){
		driver.quit();
	}
}
