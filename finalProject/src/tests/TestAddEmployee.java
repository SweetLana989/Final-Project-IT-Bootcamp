package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import constants.Constants;
import objects.DashboardPage;
import objects.LogInPage;
import objects.StaffPage;

public class TestAddEmployee {
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
	public void addEmployersTest() throws InterruptedException {

		File f = new File("Employees.xlsx");
		try {
			InputStream is = new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkbook(is);
			Sheet sheet = wb.getSheetAt(0);

			SoftAssert sa = new SoftAssert();

			driver.navigate().to(Constants.LOGIN_PAGE_URL);
			LogInPage.SendKeysLogUsername(driver, "lana@gmail.com");
			LogInPage.SendKeysLogPassword(driver, "lana89");
			LogInPage.clickLoginButton(driver);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

			for (int i = 0; i < 6; i++) {

				Row row = sheet.getRow(i);

				Cell c1 = row.getCell(0);
				Cell c2 = row.getCell(1);
				Cell c3 = row.getCell(2);

				String fname = c1.toString();
				String lname = c2.toString();
				String email = c3.toString();

				DashboardPage.clickStaffFromMenu(driver);
				Thread.sleep(3000);

				StaffPage.clickAddEmployeesButton(driver);
				Thread.sleep(5000);

				StaffPage.sendKeysFirstNameField(driver, fname);
				StaffPage.sendKeysLastNameField(driver, lname);
				StaffPage.sendKeysEmailField(driver, email);
				Thread.sleep(5000);
				StaffPage.clickSaveButton(driver);
				Thread.sleep(5000);
			}

			driver.navigate().to(Constants.STAFF_URL);

			Thread.sleep(3000);
			sa.assertTrue(driver.getPageSource().contains("maxa@gmail.com"));
			sa.assertTrue(driver.getPageSource().contains("milutin@gmail.com"));
			sa.assertTrue(driver.getPageSource().contains("laki@gmail.com"));
			sa.assertTrue(driver.getPageSource().contains("djenka@gmail.com"));
			sa.assertTrue(driver.getPageSource().contains("topalko@gmail.com"));
			sa.assertTrue(driver.getPageSource().contains("kika@gmail.com"));
			

			sa.assertAll();
			wb.close();

		} catch (IOException e) {
			System.out.println("Error");
			e.printStackTrace();
		}

	}

}

