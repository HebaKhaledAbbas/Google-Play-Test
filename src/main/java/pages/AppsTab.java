package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AppsTab extends PageBase{

	public AppsTab(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText="Apps")
	WebElement AppsTab;

	
	public void SelectAppsTab () 
	{
		clickButton(AppsTab);
		
	}
}
