package test.pageobject.resources;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;

public class POBaseClass {

	public WebDriver driver;

	@Parameters({ "homeURL" })
	@BeforeClass(alwaysRun = true)
	public void beforeClass(ITestContext suite, String homeURL) throws Exception {

		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get(homeURL);

	}

	@AfterClass
	public void afterClass() {

		driver.quit();

	}

}
