package tests;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import constants.Constants;
import objects.DashboardPage;
import objects.LogInPage;
import objects.SettingsPage;

public class TestSettingsPage {
	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@BeforeMethod
	public static void setDriver() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterClass
	public static void closeDriver() {
		driver.close();
	}

	@Test(priority = 1)
	public void testChangeLanguage() {
		driver.navigate().to(Constants.LOGIN_PAGE_URL);
		LogInPage.SendKeysLogUsername(driver, "lana@gmail.com");
		LogInPage.SendKeysLogPassword(driver, "lana89");
		LogInPage.clickLoginButton(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		DashboardPage.clickSettingsButton(driver);
		SettingsPage.selectLanguage(driver, "Serbian");
		SettingsPage.saveSettings(driver);
		
		Select select = new Select(driver.findElement(By.xpath(Constants.SELECT_LANGUAGE_XPATH)));
		Assert.assertEquals(select.getFirstSelectedOption().getText(), "Serbian (machine)");

	}
	@Test(priority = 2)
	public void uncheckNotifications() {
		driver.navigate().to(Constants.SETTINGS_URL);
		SettingsPage.disabeleNotificationEmail(driver);
		SoftAssert sa = new SoftAssert();
		driver.navigate().refresh();
		sa.assertTrue(!driver.findElement(Constants.settings_notification_email).isSelected());
		sa.assertTrue(!driver.findElement(Constants.settings_notification_sms).isSelected());
		sa.assertTrue(!driver.findElement(Constants.settings_notification_mobile_push).isSelected());
		SettingsPage.saveSettings(driver);
		sa.assertAll();
	}

}