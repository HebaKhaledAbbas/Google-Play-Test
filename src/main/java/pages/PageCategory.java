package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageCategory extends PageBase{

	public PageCategory(WebDriver driver) {
		super(driver);
	}

	@FindBy(css="span.TwyJFf")
	WebElement CategoriesTab;
	
	@FindBy(linkText="Education")
	WebElement EducationCategory;
	
	
	public void selectEducation () 
	{
		clickButton(CategoriesTab);
		clickButton(EducationCategory);
	}
	
}
