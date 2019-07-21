package test.datadriven;

import org.testng.annotations.Test;
import main.datadriven.MyAccount_main;
import test.datadriven.resources.DDBaseClass;
import test.datadriven.resources.DDSteps;
import test.datadriven.resources.DataProviderClass;

public class Signin_test extends DDBaseClass {

	/*
	 * Test Type: UI Automation Data Driven 
	 * Site: eCom - http://automationpractice.com 
	 * Scenario: Login multiple users
	 */

	@Test(dataProvider = "loginCredentials", dataProviderClass = DataProviderClass.class)
	public void signin(String username, String passwd) {

		DDSteps.getSigninPage(driver);
		MyAccount_main.emailField(driver).sendKeys(username);
		MyAccount_main.passwdField(driver).sendKeys(passwd);

	}

}
