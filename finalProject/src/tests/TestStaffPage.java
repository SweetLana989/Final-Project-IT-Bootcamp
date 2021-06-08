package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import constants.Constants;
import objects.DashboardPage;
import objects.LogInPage;
import objects.StaffPage;

public class TestStaffPage {

	private static WebDriver driver;
	private static WebDriverWait wait;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@BeforeMethod
	public static void setDriver() {
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, 15);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@AfterClass
	public static void closeDriver() {
		driver.quit();
	}

	@Test(priority = 1)
	public static void testAddingNewEmployee() {
		driver.navigate().to(Constants.LOGIN_PAGE_URL);
		LogInPage.SendKeysLogUsername(driver, "lana@gmail.com");
		LogInPage.SendKeysLogPassword(driver, "lana89");
		LogInPage.clickLoginButton(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		DashboardPage.clickStaffFromMenu(driver);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Constants.ADD_EPLOYEES_XPATH))).click();

		StaffPage.sendKeysFirstNameField(driver, "Panteleije");
		StaffPage.sendKeysLastNameField(driver, "Topalovic");
		StaffPage.sendKeysEmailField(driver, "panta@gamil.com");
		StaffPage.clickSaveButton(driver);

		Assert.assertTrue(driver.getPageSource().contains("panta@gamil.com"));

	}

	@Test(priority = 2)
	public static void testChangeNameEmployee() {
		driver.navigate().to(Constants.STAFF_URL);
		StaffPage.clickOnEmployee(driver);
		StaffPage.clickEditDetailsButton(driver);
		StaffPage.clearFirstNameForChage(driver);
		StaffPage.sendKeysFirstNameChange(driver, "Bili");
		StaffPage.clickSaveChanges(driver);

		Assert.assertTrue(driver.getPageSource().contains("Bili"));
	}

	@Test(priority = 3)
	public static void testUploadPic() {
		driver.navigate().to(Constants.STAFF_URL);
		StaffPage.clickOnEmployee(driver);
		driver.navigate().to(Constants.BILLI_PITON_PAGE_URL);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		StaffPage.clickEditDetailsButton(driver);

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		StaffPage.uploadPic(driver);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		StaffPage.clickSaveChanges(driver);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertTrue(driver.getPageSource().contains("biliPiton1.jpg"));

	}

}
