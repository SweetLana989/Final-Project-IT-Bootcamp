package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import constants.Constants;

public class DashboardPage {

	// Dashboard element
	public static WebElement getDashboardFromMenu(WebDriver driver) {
		WebElement we = driver.findElement(By.xpath(Constants.DASHBOARD_XPATH));
		return we;
	}

	public static void clickDashboardFromMenu(WebDriver driver) {
		getDashboardFromMenu(driver).click();
	}

	// ShifPlaning element
	public static WebElement getShiftPlaningFromMenu(WebDriver driver) {
		WebElement we = driver.findElement(By.xpath(Constants.SHIFT_PLANING_XPATH));
		return we;
	}

	public static void clickShiftPlaningFromMenu(WebDriver driver) {
		getShiftPlaningFromMenu(driver).click();
	}

	// TimeClock element
	public static WebElement getTimeClockFromMenu(WebDriver driver) {
		return driver.findElement(By.xpath(Constants.TIME_CLOCK_XPATH));
	}

	public static void clickTimeClockFromMenu(WebDriver driver) {
		getTimeClockFromMenu(driver).click();
	}

	// Leave-Vacations element
	public static WebElement getLeaveFromMenu(WebDriver driver) {
		return driver.findElement(By.xpath(Constants.LEAVE_XPATH));
	}

	public static void clickLeaveFromMenu(WebDriver driver) {
		getLeaveFromMenu(driver).click();
	}

	// Training element
	public static WebElement getTrainingFromMenu(WebDriver driver) {
		return driver.findElement(By.xpath(Constants.TRAINING_XPATH));
	}

	public static void clickTrainingFromMenu(WebDriver driver) {
		getTrainingFromMenu(driver).click();
	}

	// Staff element
	public static WebElement getStaffFromMenu(WebDriver driver) {
		return driver.findElement(By.xpath(Constants.STAFF_XPATH));
	}

	public static void clickStaffFromMenu(WebDriver driver) {
		getStaffFromMenu(driver).click();
	}

	// Availability element
	public static WebElement getAvailabilityFromMenu(WebDriver driver) {
		return driver.findElement(By.xpath(Constants.AVAILABILITY_XPATH));
	}

	public static void clickAvailabilityFromMenu(WebDriver driver) {
		getAvailabilityFromMenu(driver).click();
	}

	// Payroll element
	public static WebElement getPayrollFromMenu(WebDriver driver) {
		return driver.findElement(By.xpath(Constants.PAYROLL_XPATH));
	}

	public static void clickPayrollFromMenu(WebDriver driver) {
		getPayrollFromMenu(driver).click();
	}

	// Reports element
	public static WebElement getReportsFromMenu(WebDriver driver) {
		return driver.findElement(By.xpath(Constants.REPORTS_XPATH));
	}

	public static void clickReportsFromMenu(WebDriver driver) {
		getReportsFromMenu(driver).click();
	}

	// Settings element
	public static WebElement getSettingsFromMenu(WebDriver driver) {
		return driver.findElement(By.xpath(Constants.SETTINGS_XPATH));
	}

	public static void clickSettingsButton(WebDriver driver) {
		getSettingsFromMenu(driver).click();
	}

	// Profil element
	public static WebElement getProfilButton(WebDriver driver) {
		return driver.findElement(By.xpath(Constants.PROFIL_BUTTON_XPATH));
	}

	public static void clickProfilButton(WebDriver driver) {
		getProfilButton(driver).click();
	}

	public static WebElement getHoverProfilLink(WebDriver driver) {
		return driver.findElement(By.xpath(Constants.PROFIL_LINK_XPATH));
	}

	public static void clickProfilLInk(WebDriver driver) {
		getHoverProfilLink(driver).click();
	}

}
