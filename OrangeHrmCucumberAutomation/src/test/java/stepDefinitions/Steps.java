package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import pageObjects.LoginPage;

public class Steps {

	public WebDriver driver;
	public LoginPage lp;

	@Given("user launch chrome browser")
	public void user_launch_chrome_browser() {
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		lp = new LoginPage(driver);

	}

	@When("user opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	}

	@When("user enters username {string} and password {string}")
	public void user_enters_username_and_password(String username, String password) {
		lp.setUsename(username);
		lp.setPassword(password);
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		lp.clickLoginButton();
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String title) {
		if (driver.getPageSource().contains("Invalid credentials")) {
			driver.close();
			Assert.assertTrue(false);
		} else {
			Assert.assertEquals(title, driver.getTitle());
		}
	}

}
