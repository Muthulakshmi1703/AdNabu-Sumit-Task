package adnabu.sumit.tests;

import org.testng.annotations.Test;

import adnabu.base.utils.BasePage;
import adnabu.sumit.pages.HomePage;
import adnabu.sumit.pages.ProductListingPage;

public class ProductListingPageTest extends BasePage{

	/**
	 * Verify In stock Availability Filter option
	 * 
	 * @author: Muthulakshmi
	 * Created Date: 24/01/2024
	 * 
	 * Modified By: <Name>
	 * Modified Date: <Date>
	 * 
	 * @throws Exception
	 */
	@Test(groups = { "Regression", "PLPPage" },
			description = "Verify In stock Availability Filter option", 
			testName = "PLPPage_01")
	public void verifyInStockAvailabilityFilter() throws Exception {
		
		String url = getTestData("ADNABU_SUMIT_URL");
		String searchData = getTestData("SEARCH_DATA");
		
		HomePage homePage = new HomePage();
		ProductListingPage plpPage = new ProductListingPage();
		
		createTestName("PLPPage_01");
		launchAdNabuSumitURL();
		waitForLoader();
		
		homePage.verifyAdNabuSumitPageLaunched(url);
		homePage.clickOnSearchIcon();
		homePage.enterSearchData(searchData);
		homePage.clickOnSearchToGetResults();
		plpPage.verifySearchResultPageHeaderDisplayed();
		plpPage.verifySearchResultsPageSearchData(searchData);
		plpPage.verifyAvailabilityFilterIsDisplayed();
		plpPage.clickOnAvailabilityFilter();
		plpPage.verifyAvailabilityFilterElementsAreDisplayed();
		
		plpPage.clickOnInStockCheckbox();
		plpPage.verifyInStockLabelWithResultCount();
		plpPage.clickOnResetButton();
		plpPage.verifyFiltersAreRemoved();
	}
	
	/**
	 * Verify Out of stock Availability Filter option
	 * 
	 * @author: Muthulakshmi
	 * Created Date: 24/01/2024
	 * 
	 * Modified By: <Name>
	 * Modified Date: <Date>
	 * 
	 * @throws Exception
	 */
	@Test(groups = { "Regression", "PLPPage" },
			description = "Verify Out of stock Availability Filter option", 
			testName = "PLPPage_02")
	public void verifyOutOfStockAvailabilityFilter() throws Exception {
		
		String url = getTestData("ADNABU_SUMIT_URL");
		String searchData = getTestData("SEARCH_DATA");
		
		HomePage homePage = new HomePage();
		ProductListingPage plpPage = new ProductListingPage();
		
		createTestName("PLPPage_02");
		launchAdNabuSumitURL();
		waitForLoader();
		
		homePage.verifyAdNabuSumitPageLaunched(url);
		homePage.clickOnSearchIcon();
		homePage.enterSearchData(searchData);
		homePage.clickOnSearchToGetResults();
		plpPage.verifySearchResultPageHeaderDisplayed();
		plpPage.verifySearchResultsPageSearchData(searchData);
		plpPage.verifyAvailabilityFilterIsDisplayed();
		plpPage.clickOnAvailabilityFilter();
		plpPage.verifyAvailabilityFilterElementsAreDisplayed();
		
		plpPage.clickOnOutOfStockCheckbox();
		plpPage.verifyOutOfStockLabelWithResultCount();
		plpPage.clickOnResetButton();
		plpPage.verifyFiltersAreRemoved();
	}
}
