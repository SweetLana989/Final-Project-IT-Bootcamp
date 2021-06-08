package tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import constants.Constants;
import objects.HomePage;

public class TestHomePage {

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
	public static void testClosePopUpMsg() {
		driver.navigate().to(Constants.HOME_PAGE_URL);
		try {
			HomePage.clickToCloseAnnouncementPopUp(driver);
		} catch (Exception e) {
		}
	}

	@Test(priority = 3)
	public static void testOkOnPopUpAboutCookies() {

		driver.navigate().to(Constants.HOME_PAGE_URL);
		try {
			HomePage.clickDennyOnPopUpAboutCookies(driver);
		} catch (Exception e) {
		}
	}

	@Test(priority = 2)
	public static void testClosePopUpByHumanityBotMsg() {

		driver.navigate().to(Constants.HOME_PAGE_URL);
		try {
			HomePage.clickClosePopUpByHumanityBot(driver);
		} catch (Exception e) {
		}
	}

	@Test
	public static void testAboutUs() {
		driver.navigate().to(Constants.HOME_PAGE_URL);
		driver.navigate().refresh();
		HomePage.clickAboutUs(driver);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, Constants.ABOUT_US_PAGE_URL);
	}

	@Test
	public static void testLogIn() {
		driver.navigate().to(Constants.HOME_PAGE_URL);
		HomePage.clickLogInHP(driver);

		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, Constants.LOGIN_PAGE_URL);
	}

	@Test
	public static void testAboutUsScreen() throws IOException {
		driver.navigate().to(Constants.HOME_PAGE_URL);
		driver.navigate().refresh();
		HomePage.clickAboutUs(driver);

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		HomePage.captureScreenShot(driver, "C:\\Screenshot\\screenshot.png");
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, Constants.ABOUT_US_PAGE_URL);
	}

}
