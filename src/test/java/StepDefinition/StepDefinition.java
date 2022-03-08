package StepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import PageObject.Login;
import PageObject.Menu;
import PageObject.Search;
import PageObject.Sign_up;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	
	@Before
	public void setUp() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver", "/home/shelke/Documents/VI/Selenium_Akash/Driver/chromedriver");
		driver = new ChromeDriver(options);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@Given("User navigates to the application url")
	public void user_navigates_to_the_application_url() {
		driver.navigate().to("https://www.justdial.com/");
		a = new Sign_up(driver);
		l = new Login(driver);
		s = new Search(driver);
		m = new Menu(driver);
	}

	@When("User clicks on Sign up link at the top right corner of the application")
	public void user_clicks_on_sign_up_link_at_the_top_right_corner_of_the_application() {
		a.SignUp();

	}

	@When("User enters name as {string} and Phone number as {string} and clicks on Submit Button")
	public void user_enters_name_as_and_phone_number_as_and_clicks_on_submit_button(String name, String number) {

		a.name(name);
		a.Phone_Number(number);
		a.Submit();

	}

	@Then("User is displayed with the message as {string}")
	public void user_is_displayed_with_the_message_as(String string) {
		a.confirmMes();
	}

	@When("User clicks on Login-in link at the top right corner of the application")
	public void user_clicks_on_login_in_link_at_the_top_right_corner_of_the_application() {

		l.clickLogin();
	}

	@Then("User gets error message as {string}")
	public void user_gets_error_message_as(String string) {

		l.submitMe();

	}

	@When("User do not enter any name and phone number but clicks on Submit Button")
	public void user_do_not_enter_any_name_and_phone_number_but_clicks_on_submit_button() {

		l.submitMe();
	}

	// Mobile Scenario 4

	@Then("User is able to enter only {string} digits in the Mobile text field")
	public void user_is_able_to_enter_only_digits_in_the_mobile_text_field(String digit) {

		String count = l.CountDigit();
		System.out.println(count);

		boolean b;

		if (digit.equals(count)) {
			b = true;
		} else {
			b = false;
		}

		Assert.assertTrue("TRue", b);
	}

	/// -------------Search_Resta Scenario---------------------------------

	@When("User enters {string} in search text box")
	public void user_enters_in_search_text_box(String p) {

		s.searchProduct(p);
	}

	@When("User clicks search button")
	public void user_clicks_search_button() {
		s.clickSearchBtn();
	}

	// -----------------------------------------------------------------------

	@Then("User is able to see search result related to {string}")
	public void user_is_able_to_see_search_result_related_to(String string) {

		s.countProductDetails();
	}

//-----------------------Search_Resta------------------------

	@Then("User is able to see the drop down under search text box with all the items with text {string}")
	public void user_is_able_to_see_the_drop_down_under_search_text_box_with_all_the_items_with_text(String resta) {
		s.chooseProduct(resta);
	}

//------------------------------------------------------------------------------------

	// Online Scenario
	@When("User clicks on {string}")
	public void user_clicks_on(String items) {

		m.clickOnSideMenu(items);
	}

	@Then("User is navigates to the corresponding link realted to {string}")
	public void user_is_navigates_to_the_corresponding_link_realted_to(String linkOfItems) {

	}

	@After
	public void tearDown() {
		driver.close();

	}

	
	
	
	@Given("User Navigate to URL")
	public void user_navigate_to_url() {

	}

@When("Fill form using below data")
public void fill_form_using_below_data(DataTable dataTable) {
	
	List<List<String>> list =dataTable.asLists(String.class);


	for(int i=0;i<list.size();i++)
	{
		System.out.println(list);
	}
	
}

	@Then("Close Browser")
	public void close_browser() {

	}

}
