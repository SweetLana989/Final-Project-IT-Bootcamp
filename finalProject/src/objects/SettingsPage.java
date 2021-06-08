package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import constants.Constants;

public class SettingsPage {

	// click on language droplist
	public static void selectLanguage(WebDriver driver, String str) {
		driver.findElement(By.xpath(Constants.SELECT_LANGUAGE_XPATH)).sendKeys(str);
	}

	// click on save settings button
	public static void saveSettings(WebDriver driver) {
		driver.findElement(By.xpath(Constants.SAVE_SETTINGS_XPATH)).click();
	}

	// disable email chackbox
	public static void disabeleNotificationEmail(WebDriver driver) {
		if (driver.findElement(Constants.settings_notification_email).isSelected()) {
			driver.findElement(Constants.settings_notification_email).click();
		}
	}

	// disabele sms chacbox
	public static void disabeleNotificationSms(WebDriver driver) {
		if (driver.findElement(Constants.settings_notification_sms).isSelected()) {
			driver.findElement(Constants.settings_notification_sms).click();
		}
	}

	// disable mobilePush chacbox
	public static void disabeleNotificationMobilePush(WebDriver driver) {
		if (driver.findElement(Constants.settings_notification_mobile_push).isSelected()) {
			driver.findElement(Constants.settings_notification_mobile_push).click();
		}
	}

}
