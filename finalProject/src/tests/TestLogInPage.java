package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import constants.Constants;
import objects.LogInPage;

public class TestLogInPage {
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

	@Test
	public void testLogin() {

		driver.navigate().to(Constants.LOGIN_PAGE_URL);
		LogInPage.SendKeysLogUsername(driver, "lana@gmail.com");
		LogInPage.SendKeysLogPassword(driver, "lana89");
		LogInPage.clickLoginButton(driver);

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		String currentUrl = driver.getCurrentUrl();

		Assert.assertEquals(currentUrl, Constants.DASHBOARD_PAGE_URL);
	}

}
