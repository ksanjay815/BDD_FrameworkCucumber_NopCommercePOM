package StepDefinitions;

import Base.BaseTest;
import Pages.AddcustomerPage;
import Pages.LoginPage;
import Pages.SearchCustomerPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginSteps extends BaseTest {
	public LoginSteps() throws Throwable {
		super();

	}

	public LoginPage lp;
	public AddcustomerPage addCust;
	public SearchCustomerPage searchCust;

	@Before
	public void setup() throws Throwable {
		logger.info("opening browser");
		initialization();
		lp = new LoginPage(driver);

	}

	@After
	public void teardown() {
		logger.info("closing browser");
		driver.quit();

	}

	

	// Login steps....................

	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		logger.info(" browser launched successfully");
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		logger.info("opening url");
		driver.get(url);
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password) {
		logger.info("entering username & password");
		lp.setUserName(email);
		lp.setPassword(password);
	}

	@When("Click on Login")
	public void click_on_login() {
		lp.clickLogin();
		logger.info("login successful");
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String exptitle) throws InterruptedException {
		if (driver.getPageSource().contains("Login was unsuccessful")) {

			driver.close();
			Assert.assertTrue(false);
		} else {

			Assert.assertEquals(exptitle, driver.getTitle());
		}
		Thread.sleep(2000);

	}

	@When("User click on Log out link")
	public void user_click_on_log_out_link() throws InterruptedException {
		lp.clickLogout();
		Thread.sleep(2000);
	}


}