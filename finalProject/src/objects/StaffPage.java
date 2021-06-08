package objects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import constants.Constants;

public class StaffPage {

	// adding new employee button
	public static WebElement getAddEmployeesButton(WebDriver driver) {
		return driver.findElement(By.xpath(Constants.ADD_EPLOYEES_XPATH));
	}

	public static void clickAddEmployeesButton(WebDriver driver) {
		getAddEmployeesButton(driver).click();
	}

	// adding new employee first name
	public static WebElement getFirstNameField(WebDriver driver) {
		return driver.findElement(Constants.first_name_input);
	}

	public static void sendKeysFirstNameField(WebDriver driver, String fname) {
		getFirstNameField(driver).sendKeys(fname);
	}

	// adding new employee last name
	public static WebElement getLastNameField(WebDriver driver) {
		return driver.findElement(Constants.last_name_input);
	}

	public static void sendKeysLastNameField(WebDriver driver, String lname) {
		getLastNameField(driver).sendKeys(lname);
	}

	// adding new employee e-mail
	public static WebElement getEmailField(WebDriver driver) {
		return driver.findElement(Constants.email_employee_input);
	}

	public static void sendKeysEmailField(WebDriver driver, String mail) {
		getEmailField(driver).sendKeys(mail);
	}

	// click on save button
	public static WebElement getSaveButton(WebDriver driver) {
		return driver.findElement(By.xpath(Constants.SAVE_BUTTON_EMPLOYEE_XPATH));
	}

	public static void clickSaveButton(WebDriver driver) {
		getSaveButton(driver).click();
	}

	// choose employee
	public static WebElement getEmpoyee(WebDriver driver) {
		return driver.findElement(By.xpath(Constants.EMPLOYEE_XPATH));
	}

	public static void clickOnEmployee(WebDriver driver) {
		getEmpoyee(driver).click();
	}

	// edit details
	public static WebElement getEditDetailsButton(WebDriver driver) {
		return driver.findElement(By.xpath(Constants.EDIT_DETAILS_XPATH));
	}

	public static void clickEditDetailsButton(WebDriver driver) {
		getEditDetailsButton(driver).click();
	}

	// changing new employee first name
	public static WebElement getFirstNameChange(WebDriver driver) {
		return driver.findElement(By.xpath(Constants.CHAGE_FIRST_NAME_XPATH));
	}

	public static void clearFirstNameForChage(WebDriver driver) {
		getFirstNameChange(driver).clear();
	}

	public static void sendKeysFirstNameChange(WebDriver driver, String str) {
		getFirstNameChange(driver).sendKeys(str);
	}

	// save changes
	public static WebElement getSaveChanges(WebDriver driver) {
		return driver.findElement(By.xpath(Constants.SAVE_CHANGES_XPATH));
	}

	public static void clickSaveChanges(WebDriver driver) {
		getSaveChanges(driver).click();
	}

	// upload picture
	public static WebElement getUploadPicButton(WebDriver driver) {
		return driver.findElement(By.xpath(Constants.UPLOAD_PIC_XPATH));
	}

	public static void uploadPic(WebDriver driver) {
		getUploadPicButton(driver).sendKeys("C:\\Users\\38164\\eclipse-workspace\\finalProject\\biliPiton1.jpg");
	}

}
