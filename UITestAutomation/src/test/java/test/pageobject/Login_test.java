package test.pageobject;

import org.testng.annotations.Test;
import test.pageobject.resources.POBaseClass;
import test.pageobject.resources.POSteps;

public class Login_test extends POBaseClass {

	/*
	 * Test Type: UI Automation Page Object 
	 * Site: Bank - https://parabank.parasoft.com 
	 * Scenario: login user
	 */

	@Test
	public void login() {

		POSteps.loginUser(driver);

	}

}
