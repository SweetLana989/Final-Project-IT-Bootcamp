package tests;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import constants.Constants;
import objects.DashboardPage;
import objects.LogInPage;
import objects.ProfilePage;
import objects.StaffPage;

public class TestProfile {
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
		driver.quit();
	}

	@Test
	public static void testEditProfile() {
		SoftAssert sa = new SoftAssert();
		driver.navigate().to(Constants.LOGIN_PAGE_URL);
		LogInPage.SendKeysLogUsername(driver, "lana@gmail.com");
		LogInPage.SendKeysLogPassword(driver, "lana89");
		LogInPage.clickLoginButton(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		DashboardPage.clickProfilButton(driver);
		DashboardPage.clickProfilLInk(driver);

		driver.navigate().to(Constants.PROFILE_PAGE_URL);
		StaffPage.clickEditDetailsButton(driver);
		ProfilePage.getNickNameField(driver).clear();
		ProfilePage.sendKeysNickName(driver, "Lana");
		ProfilePage.getCityField(driver).clear();
		ProfilePage.sendKeysCityField(driver, "Belgrade");
		ProfilePage.chooseGenger(driver);
		ProfilePage.clickSaveProfilButton(driver);
		driver.navigate().refresh();
		
		Select select = new Select(driver.findElement(Constants.choose_gender));
		sa.assertEquals(select.getFirstSelectedOption().getText(), "Female");
		sa.assertTrue(driver.getPageSource().contains("Lana"));
		sa.assertTrue(driver.getPageSource().contains("Belgrade"));
		sa.assertAll();
	}

}
