package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import constants.Constants;
import objects.DashboardPage;
import objects.LogInPage;

public class TestDashboardPage {
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
		driver.close();
	}

	@Test
	public static void testMenuElements() {

		SoftAssert sa = new SoftAssert();

		driver.navigate().to(Constants.LOGIN_PAGE_URL);
		LogInPage.SendKeysLogUsername(driver, "lana@gmail.com");
		LogInPage.SendKeysLogPassword(driver, "lana89");
		LogInPage.clickLoginButton(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		DashboardPage.clickDashboardFromMenu(driver);
		sa.assertEquals(driver.getCurrentUrl(), Constants.DASHBOARD_PAGE_URL);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Constants.SHIFT_PLANING_XPATH))).click();
		DashboardPage.clickShiftPlaningFromMenu(driver);
		String expectedUrlShiftP = Constants.SHIFT_PLANING_URL;
		expectedUrlShiftP = expectedUrlShiftP.substring(0, expectedUrlShiftP.length() - 36);

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sa.assertTrue(driver.getCurrentUrl().contains(expectedUrlShiftP));
		
		DashboardPage.clickTimeClockFromMenu(driver);
		sa.assertEquals(driver.getCurrentUrl(), Constants.TIME_CLOCK_URL);

		DashboardPage.clickLeaveFromMenu(driver);
		sa.assertEquals(driver.getCurrentUrl(), Constants.LEAVE_URL);

		DashboardPage.clickTrainingFromMenu(driver);
		sa.assertEquals(driver.getCurrentUrl(), Constants.TRAINING_URL);

		DashboardPage.clickStaffFromMenu(driver);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sa.assertEquals(driver.getCurrentUrl(), Constants.STAFF_URL);

		DashboardPage.clickPayrollFromMenu(driver);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sa.assertEquals(driver.getCurrentUrl(), Constants.PAYROLL_URL);


		DashboardPage.clickReportsFromMenu(driver);
		String expectedUrlReports = Constants.REPORTS_URL;
		expectedUrlReports = expectedUrlReports.substring(0, expectedUrlReports.length() - 13);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sa.assertTrue(driver.getCurrentUrl().contains(expectedUrlReports));

		DashboardPage.clickAvailabilityFromMenu(driver);
		String expectedUrlAvailability = Constants.AVAILABILITY_URL;
		expectedUrlAvailability = expectedUrlAvailability.substring(0, expectedUrlAvailability.length() - 13);
		
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sa.assertTrue(driver.getCurrentUrl().contains(expectedUrlAvailability));

		sa.assertAll();

	}

}
