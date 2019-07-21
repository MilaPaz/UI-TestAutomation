package test.pageobject;

import org.testng.annotations.Test;
import test.pageobject.resources.POBaseClass;
import test.pageobject.resources.POSteps;

public class Register_new_account_test extends POBaseClass {

	/*
	 * Test Type: UI Automation Page Object 
	 * Site: Bank - https://parabank.parasoft.com 
	 * Scenario: register new user account
	 */

	@Test
	public void complete_register_form() {

		POSteps.getRegisterPage(driver);		
		POSteps.verifyRegisterPageIsDisplayed(driver);
		POSteps.fillForm(driver);
		
	}

	@Test
	public void submit_register_form() {

		POSteps.submitRegistration(driver);
		POSteps.verifyCustomerCreatedPageIsDisplayed(driver);

	}


}
