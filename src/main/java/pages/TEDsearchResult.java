package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TEDsearchResult extends PageBase{

	public TEDsearchResult(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(css="div.b8cIId.ReQCgd.KoLSrc")
	WebElement TEDapp;
	
	
	public void SelectingTEDapp () 
	{
		clickButton(TEDapp);
	}
}
