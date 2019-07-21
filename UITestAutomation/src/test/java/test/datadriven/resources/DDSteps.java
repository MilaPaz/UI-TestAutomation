package test.datadriven.resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import main.datadriven.Home_main;

public class DDSteps extends DataProviderClass {

	public WebDriver driver;
	
	private static WebElement element = null;
	
	public static WebElement getSigninPage(WebDriver driver) {

	    Home_main.signinBtn(driver).click();
	    
	    if (!"Login - My Store".equals(driver.getTitle())) {
			throw new IllegalStateException("this page is not the login page");
		}
		
		return element;
	}
	

}
