package main.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Register_main {

	private static WebElement element = null;

	public static  WebElement firstName(WebDriver driver) {

		element = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='customer.firstName']")));
		
		return element;
	}

	public static WebElement lastName(WebDriver driver) {

		element = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='customer.lastName']")));

		return element;
	}

	public static WebElement address(WebDriver driver) {

		element = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='customer.address.street']")));

		return element;
	}

	public static WebElement city(WebDriver driver) {

		element = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='customer.address.city']")));

		return element;
	}

	public static WebElement state(WebDriver driver) {

		element = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='customer.address.state']")));

		return element;
	}

	public static WebElement zipcode(WebDriver driver) {

		element = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='customer.address.zipCode']")));

		return element;
	}

	public static WebElement phone(WebDriver driver) {

		element = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='customer.phoneNumber']")));

		return element;
	}

	public static WebElement ssn(WebDriver driver) {

		element = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='customer.ssn']")));

		return element;
	}

	public static WebElement username(WebDriver driver) {

		element = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='customer.username']")));

		return element;
	}

	public static WebElement password(WebDriver driver) {

		element = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='customer.password']")));

		return element;
	}

	public static WebElement confirmPass(WebDriver driver) {

		element = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='repeatedPassword']")));

		return element;
	}

	public static WebElement registerBtn(WebDriver driver) {

		element = (new WebDriverWait(driver, 10)).until(
				ExpectedConditions.elementToBeClickable(By.xpath("//table[@class='form2']//input[@class='button']")));

		return element;
	}
	
	public static WebElement welcome(WebDriver driver) {

		element = (new WebDriverWait(driver, 10)).until(
				ExpectedConditions.elementToBeClickable(By.xpath("//b[contains(text(),'Welcome')]")));

		return element;
	}
	
	


}
