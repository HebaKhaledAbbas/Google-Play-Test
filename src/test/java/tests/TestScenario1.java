package tests;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AppsTab;
import pages.PageCategory;
import pages.Search;
import pages.TEDsearchResult;

public class TestScenario1 extends TestBase{


	AppsTab AppsTabObject;
	PageCategory PageCategoryObject ;
	Search SearchObject ;
	TEDsearchResult TEDsearchResultObject;


	@Test (priority=0)
	public void UserCanSelectApps () 
	{
		AppsTabObject = new AppsTab(driver);
		AppsTabObject.SelectAppsTab();


		By CategoriesTab1 = By.cssSelector("span.TwyJFf");
		boolean isDisplayed = driver.findElement(CategoriesTab1).isDisplayed();
		Assert.assertTrue(isDisplayed);
	}

	@Test(priority=1)
	public void UserCanSelectEducation () 
	{
		PageCategoryObject = new PageCategory(driver);
		PageCategoryObject.selectEducation();

		By EducationTab = By.cssSelector("span.TwyJFf");
		boolean isDisplayed = driver.findElement(EducationTab).isDisplayed();
		Assert.assertTrue(isDisplayed);

	}

	@Test(priority=2)
	public void UserCanSearchForTED () 
	{

		SearchObject =new Search(driver);
		SearchObject.searchForItem("TED");

	}

	@Test(priority=3)
	public void UserCanSelectTEDapp () 
	{

		TEDsearchResultObject = new TEDsearchResult(driver);
		TEDsearchResultObject.SelectingTEDapp();


		By TEDimg = By.cssSelector("img.T75of.Gbp9Kb");
		boolean isDisplayed = driver.findElement(TEDimg).isDisplayed();
		Assert.assertTrue(isDisplayed);
	}

}
