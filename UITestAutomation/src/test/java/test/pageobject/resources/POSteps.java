package test.pageobject.resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import main.pageobject.Home_main;
import main.pageobject.Register_main;

public class POSteps {

	public WebDriver driver;

	private static WebElement element = null;

	public static WebElement loginUser(WebDriver driver) {

		Home_main.usernameField(driver).sendKeys(Users.user1());
		Home_main.passwordField(driver).sendKeys(Users.passwd());
		Home_main.loginBtn(driver).click();

		if (!"ParaBank | Accounts Overview".equals(driver.getTitle())) {
			throw new IllegalStateException("this page is not Accounts Overview");
		}

		return element;
	}

	public static WebElement fillForm(WebDriver driver) {

		Register_main.firstName(driver).sendKeys(Users.firstName());
		Register_main.lastName(driver).sendKeys(Users.lastName());
		Register_main.address(driver).sendKeys(Users.address());
		Register_main.city(driver).sendKeys(Users.city());
		Register_main.state(driver).sendKeys(Users.state());
		Register_main.zipcode(driver).sendKeys(Users.zipcode());
		Register_main.phone(driver).sendKeys(Users.phone());
		Register_main.ssn(driver).sendKeys(Users.ssn());
		Register_main.username(driver).sendKeys(Users.user1());
		Register_main.password(driver).sendKeys(Users.passwd());
		Register_main.confirmPass(driver).sendKeys(Users.passwd());

		return element;
	}
	
	public static WebElement submitRegistration(WebDriver driver) {

		Register_main.registerBtn(driver).click();

		return element;
	}
	
	public static WebElement verifyCustomerCreatedPageIsDisplayed(WebDriver driver) {
		
		if (!"ParaBank | Customer Created".equals(driver.getTitle())) {
			throw new IllegalStateException("page is not customer created");
		}

		return element;
	}
	
	public static WebElement getRegisterPage(WebDriver driver) {

		Home_main.registerLink(driver).click();

		return element;
	}
	
	public static WebElement verifyRegisterPageIsDisplayed(WebDriver driver) {
		
		if (!"ParaBank | Register for Free Online Account Access".equals(driver.getTitle())) {
			throw new IllegalStateException("this page is not Register");
		}

		return element;
	}
}
