package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
/*https://opensource-demo.orangehrmlive.com/web/index.php/auth/login*/
	public WebDriver driver;
	
	public LoginPage(WebDriver dr) {
		this.driver = dr;
		PageFactory.initElements(dr,this);
	}
	
	@FindBy(xpath = "//input[@name='username']")
	WebElement txtUsername;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement txtPassword;
	
	@FindBy(xpath = "//button[contains(.,'Login') and @type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath = "//h6[contains(.,'Dashboard')]")
	WebElement dashboardTitle;
	
	public void setUsename(String uname){
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		txtUsername.click();
		txtUsername.sendKeys(uname);
	}
	public void setPassword(String pwd) {
		txtPassword.click();
		txtPassword.sendKeys(pwd);
	}
	public void clickLoginButton() {
		loginBtn.click();
	}
	public boolean isDisplayDashboard() {
		dashboardTitle.equals(dashboardTitle);
		return true;
	}
}
