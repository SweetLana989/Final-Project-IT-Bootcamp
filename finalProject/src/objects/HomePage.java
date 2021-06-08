package objects;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import constants.Constants;

public class HomePage {
	
	// About us
	public static WebElement getHovergetAboutUs(WebDriver driver) {
		return driver.findElement(By.xpath(Constants.ABOUT_US_HEADER_XPATH));
		
	}
	public static WebElement getAboutUsFromHovering(WebDriver driver) {
		WebElement we = driver.findElement(By.xpath(Constants.ABOUT_US_XPATH));
		return we;
	}

	public static void hoverAboutUs(WebDriver driver) {
		Actions action = new Actions(driver);
		action.moveToElement(getHovergetAboutUs(driver)).perform();
	}

	public static void clickAboutUs(WebDriver driver) {
		hoverAboutUs(driver);
		getAboutUsFromHovering(driver).click();
	}

	// Log in
	public static WebElement getLogInHP(WebDriver driver) {
		WebElement we = driver.findElement(By.xpath(Constants.LOGIN_XPATH));
		return we;
	}

	public static void clickLogInHP(WebDriver driver) {
		getLogInHP(driver).click();
	}

	// Pop up message about Announcement
	public static WebElement getAnnouncementPopUp(WebDriver driver) {
		WebElement we = driver.findElement(By.xpath(Constants.ANNOUNCEMENT_POP_UP_XPATH));
		return we;
	}

	public static void clickToCloseAnnouncementPopUp(WebDriver driver) {
		getAnnouncementPopUp(driver).click();

	}

	// Pop up message about cookies
	public static WebElement getPopUpAboutCookies(WebDriver driver) {
		WebElement we = driver.findElement(By.xpath(Constants.DENNY_BUTTON_COOKIES_MSG_XPATH));
		return we;
	}

	public static void clickDennyOnPopUpAboutCookies(WebDriver driver) {
		getPopUpAboutCookies(driver).click();

	}

	// Pop up message by Humanity bot
	public static WebElement getHoverPopUpByHumanityBot(WebDriver driver) {
		WebElement we = driver.findElement(By.xpath(Constants.HUMANITY_BOT_POP_UP_XPATH));
		return we;
	}

	public static void hoverPopUpByHumanityBot(WebDriver driver) {
		Actions action = new Actions(driver);
		action.moveToElement(getHoverPopUpByHumanityBot(driver)).perform();
	}

	public static void clickClosePopUpByHumanityBot(WebDriver driver) {
		hoverPopUpByHumanityBot(driver);
		driver.findElement(By.xpath(Constants.CLOSE_HUMANITY_BOT_POP_UP_XPATH)).click();
	}
	
	//Screenshot
	public static void captureScreenShot(WebDriver driver, String obj) throws IOException {
		String yourfilepath = "C:\\Users\\38164\\eclipse-workspace\\finalProject\\screenshot.png";

		File snapshort_file = ((TakesScreenshot) driver)
		        .getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(snapshort_file, new File(yourfilepath));
	}

}
