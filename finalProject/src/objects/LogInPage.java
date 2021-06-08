package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import constants.Constants;

public class LogInPage {

	// Username log in
	public static WebElement getLogUsername(WebDriver driver) {
		WebElement wb = driver.findElement(Constants.username_input);
		return wb;
	}

	public static void SendKeysLogUsername(WebDriver driver, String str) {
		getLogUsername(driver).sendKeys(str);
	}

	// Password log in
	public static WebElement getLogPassword(WebDriver driver) {
		WebElement wb = driver.findElement(Constants.password_input);
		return wb;
	}

	public static void SendKeysLogPassword(WebDriver driver, String str) {
		getLogPassword(driver).sendKeys(str);
	}

	// Log in confrim
	public static WebElement getLoginButton(WebDriver driver) {
		WebElement wb = driver.findElement(By.xpath(Constants.LOGIN_BUTTON_XPATH));
		return wb;
	}

	public static void clickLoginButton(WebDriver driver) {
		getLoginButton(driver).click();

	}

}
