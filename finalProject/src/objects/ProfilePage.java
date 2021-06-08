package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import constants.Constants;

public class ProfilePage {

	// add nick name
	public static WebElement getNickNameField(WebDriver driver) {
		return driver.findElement(Constants.nick_name_input);
	}

	public static void sendKeysNickName(WebDriver driver, String nName) {
		getNickNameField(driver).sendKeys(nName);
	}

	// add city
	public static WebElement getCityField(WebDriver driver) {
		return driver.findElement(Constants.city_input);
	}

	public static void sendKeysCityField(WebDriver driver, String city) {
		getCityField(driver).sendKeys(city);
	}

	// save button
	public static WebElement getSaveProfilButton(WebDriver driver) {
		return driver.findElement(By.xpath(Constants.SAVE_BUTTON_PROFIL_XPATH));

	}

	public static void clickSaveProfilButton(WebDriver driver) {
		getSaveProfilButton(driver).click();
	}

	// choose genger
	public static void chooseGenger(WebDriver driver) {
		WebElement we = driver.findElement(Constants.choose_gender);
		we.click();
		Select drop = new Select(we);
		drop.selectByIndex(2);
	}
}
