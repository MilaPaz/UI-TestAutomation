package main.datadriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyAccount_main {

	private static WebElement element = null;

	public static WebElement emailField(WebDriver driver) {

		element = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='email']")));

		return element;
	}

	public static WebElement passwdField(WebDriver driver) {

		element = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='passwd']")));

		return element;
	}

}
