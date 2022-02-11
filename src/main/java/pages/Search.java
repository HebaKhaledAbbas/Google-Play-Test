package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search extends PageBase{

	public Search(WebDriver driver) {
		super(driver);
	}

	
	@FindBy(css="input#gbqfq.gbqfif")
	WebElement SearchBar;
	
	@FindBy(css="span.gbqfi.gb_uc")    //button#gbqfb.gbqfb
	WebElement searchBTN;
	
	
	
	public void searchForItem (String SearchItem) 
	{
		setTxtElementTxt(SearchBar, SearchItem);
		clickButton(searchBTN);
		
	}
}
