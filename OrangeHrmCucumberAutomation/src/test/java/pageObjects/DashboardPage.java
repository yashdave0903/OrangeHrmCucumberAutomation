package pageObjects;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

	WebDriver dr;
	

	DashboardPage(WebDriver driver) {
		this.dr = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='orangehrm-quick-launch-heading']")
	WebElement quickLaunchTitles[];

	public void getAllTitles() {
		for (int i = 0; i <= quickLaunchTitles.length; i++) {
			quickLaunchTitles[i].getText();
			ArrayList list = new ArrayList<>();
			list.add(quickLaunchTitles[i].getText());
		}
	}
}
