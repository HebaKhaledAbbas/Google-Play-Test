package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchForFacebook extends PageBase{

	public SearchForFacebook(WebDriver driver) {
		super(driver);
	}

	
	@FindBy(id="yDmH0d")
	WebElement facebookIcon;
	
	public void selectFacebook () 
	{
		clickButton(facebookIcon);
	}
	
}
