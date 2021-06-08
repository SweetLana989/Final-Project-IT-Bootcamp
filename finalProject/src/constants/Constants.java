package constants;

import org.openqa.selenium.By;

public class Constants {

	// HomePage constants
	public static final String HOME_PAGE_URL = "https://www.humanity.com";
	public static final String LOGIN_PAGE_URL = "https://www.humanity.com/app/";
	public static final String HOME_PAGE_COMPANY_URL = "https://itbootcampxgeneration.humanity.com/app/";
	public static final String DASHBOARD_PAGE_URL = "https://itbootcampxgeneration.humanity.com/app/dashboard/";
	public static final String ABOUT_US_PAGE_URL = "https://www.humanity.com/about";

	public static final String ABOUT_US_HEADER_XPATH = "//*[@id=\"navbarSupportedContent\"]/ul/li[6]";
	public static final String ABOUT_US_XPATH = "//*[@id=\"navbarSupportedContent\"]/ul/li[6]/ul/li[1]/a/p[1]";
	public static final String LOGIN_XPATH = "//*[@id=\"navbarSupportedContent\"]/div/a[2]/p";
	public static final String ANNOUNCEMENT_POP_UP_XPATH = "//*[@id=\"tcp-modal\"]/div/div/div[1]/button";
	public static final String DENNY_BUTTON_COOKIES_MSG_XPATH = "//*[@id=\"cf-root\"]/div/div/div/div[2]/div[2]/div[2]/button";
	public static final String HUMANITY_BOT_POP_UP_XPATH = "//*[@id=\"intercom-container\"]/div/div/div[2]/div/div/div[1]/div/div[1]/div/div[1]/div/div[2]/div[2]/div/div/div";
	public static final String CLOSE_HUMANITY_BOT_POP_UP_XPATH = "//*[@id=\"intercom-container\"]/div/div/div[1]/div/div/span";

	// LogInPage constants
	public static By username_input = By.id("email");
	public static By password_input = By.id("password");

	public static final String LOGIN_BUTTON_XPATH = "//*[@id=\"LoginForm\"]/div[3]/div/button[1]";

	// DashboardPage constants						https://itbootcampxgeneration.humanity.com/app/schedule/employee/day/overview/overview/8%2c5%2c2021/--> -36 
	public static final String SHIFT_PLANING_URL = "https://itbootcampxgeneration.humanity.com/app/schedule/employee/week/overview/overview/7%2c5%2c2021/";
	public static final String TIME_CLOCK_URL = "https://itbootcampxgeneration.humanity.com/app/timeclock/";
	public static final String LEAVE_URL = "https://itbootcampxgeneration.humanity.com/app/requests/vacation/";
	public static final String TRAINING_URL = "https://itbootcampxgeneration.humanity.com/app/training/";
	public static final String STAFF_URL = "https://itbootcampxgeneration.humanity.com/app/staff/list/load/true/";
	public static final String AVAILABILITY_URL = "https://itbootcampxgeneration.humanity.com/fe/availability/#/requests/week/2021-05-30/1";
	public static final String PAYROLL_URL = "https://itbootcampxgeneration.humanity.com/app/payroll/scheduled-hours/";
	public static final String REPORTS_URL = "https://itbootcampxgeneration.humanity.com/app/reports/dashboard/";

	public static final String DASHBOARD_XPATH = "//*[@id=\"sn_dashboard\"]/span/i";
	public static final String SHIFT_PLANING_XPATH = "//*[@id=\"sn_schedule\"]/span/p";
	public static final String TIME_CLOCK_XPATH = "//*[@id=\"sn_timeclock\"]/span/p";
	public static final String LEAVE_XPATH = "//*[@id=\"sn_requests\"]/span/p";
	public static final String TRAINING_XPATH = "//*[@id=\"sn_training\"]/span";
	public static final String STAFF_XPATH = "//*[@id=\"sn_staff\"]/span";
	public static final String AVAILABILITY_XPATH = "//*[@id=\"sn_availability\"]/span/i";
	public static final String PAYROLL_XPATH = "//*//*[@id=\"sn_payroll\"]/span";
	public static final String REPORTS_XPATH = "//*//*[@id=\"sn_reports\"]/span";
	public static final String SETTINGS_XPATH = "//*[@id=\"sn_admin\"]/span/i";
	public static final String PROFIL_BUTTON_XPATH = "//*[@id=\"wrap_us_menu\"]";
	public static final String PROFIL_LINK_XPATH = "//*[@id=\"userm\"]/div/a[1]";

	// StaffPage constants
	public static By first_name_input = By.id("_asf1");
	public static By last_name_input = By.id("_asl1");
	public static By email_employee_input = By.id("_ase1");

	public static final String ADD_EMPLOYEES_PAGE_URL = "https://itbootcampxgeneration.humanity.com/app/staff/add/";
	public static final String BILLI_PITON_PAGE_URL = "https://itbootcampxgeneration.humanity.com/app/staff/detail/6365025/";
	
	public static final String ADD_EPLOYEES_XPATH = "//*[@id=\"act_primary\"]";
	public static final String STAFF_CLICK = "//*[@id=\"sn_staff\"]/span";
	public static final String SAVE_BUTTON_EMPLOYEE_XPATH = "//*[@id=\"_as_save_multiple\"]";
																		
	public static final String EMPLOYEE_XPATH = "//*[@id=\"7\"]/a";
	public static final String EDIT_DETAILS_XPATH = "//*[@id=\"_cd_staff\"]/div[2]/div[2]/div[1]/a[2]";
	public static final String CHAGE_FIRST_NAME_XPATH = "//*[@id=\"first_name\"]";
	public static final String SAVE_CHANGES_XPATH = "//*[@id=\"NewEmployeeForm\"]/table/tbody/tr[39]/td/input";
	public static final String UPLOAD_PIC_XPATH = "//*[@id=\"fileupload\"]";

	// Settings page constats
	public static final String SETTINGS_URL = "https://itbootcampxgeneration.humanity.com/app/admin/settings/";
	
	public static final String SELECT_LANGUAGE_XPATH = "//*[@id=\"adminSettingsForm\"]/div[1]/table/tbody/tr[3]/td[2]/select";
	public static final String SAVE_SETTINGS_XPATH = "//*[@id=\"_save_settings_button\"]";

	public static final By settings_notification_email = By.id("pref_pref_email");
	public static final By settings_notification_sms = By.id("pref_pref_sms");
	public static final By settings_notification_mobile_push = By.id("pref_pref_mobile_push");

	// Profile page constats
	public static final String PROFILE_PAGE_URL = "https://itbootcampxgeneration.humanity.com/app/staff/detail/6357511/";

	public static final String SAVE_BUTTON_PROFIL_XPATH = "//*[@id=\"NewEmployeeForm\"]/table/tbody/tr[42]/td/input";
	
	public static By nick_name_input = By.id("nick_name");
	public static By city_input = By.id("city");
	public static By choose_gender = By.id("gender");

}
