package test.datadriven.resources;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

	@DataProvider(name = "loginCredentials")
	public static Object[][] loginCredentials() {

		return new Object[][] {

				{ "testuser1@gmail.com", "pass123" }, 
				{ "testuser2@gmail.com", "pass321" },
				{ "testuser3@gmail.com", "pass456" }

		};

	}

}