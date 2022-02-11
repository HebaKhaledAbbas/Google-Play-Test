package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Search;
import pages.SearchForFacebook;

public class TestScenario2 extends TestBase{
	
	Search SearchObject ;
	SearchForFacebook SearchForFacebookObject;
	
	@Test
	public void UserCanSearchForFacebook() 
	{
		
		SearchObject = new Search(driver);
		SearchObject.searchForItem("Facebook");
		
		SearchForFacebookObject = new SearchForFacebook(driver);
		SearchForFacebookObject.selectFacebook();
		
		By Facebookimg = By.cssSelector("img.T75of.sHb2Xb"); 
		boolean isDisplayed = driver.findElement(Facebookimg).isDisplayed();
		Assert.assertTrue(isDisplayed);
		
		//boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Facebook");
		//assertTrue(verifyTitle);
		
	}

}
