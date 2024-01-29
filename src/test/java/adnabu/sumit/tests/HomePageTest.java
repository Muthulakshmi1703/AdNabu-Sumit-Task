package adnabu.sumit.tests;

import org.testng.annotations.Test;

import adnabu.base.utils.BasePage;
import adnabu.sumit.pages.HomePage;
import adnabu.sumit.pages.ProductListingPage;

public class HomePageTest extends BasePage{
	
	/**
	 * Verify User able Search data
	 * 
	 * @author: Muthulakshmi
	 * Created Date: 23/01/2024
	 * 
	 * Modified By: <Name>
	 * Modified Date: <Date>
	 * 
	 * @throws Exception
	 */
	@Test(groups = { "Regression", "HomePage" },
			description = "Verify User able Search data", 
			testName = "HomePage_01")
	public void verifyUserAbleToSearchData() throws Exception {
		
		String url = getTestData("ADNABU_SUMIT_URL");
		String searchData = getTestData("SEARCH_DATA");
		
		HomePage homePage = new HomePage();
		ProductListingPage plpPage = new ProductListingPage();
		
		createTestName("HomePage_01");
		launchAdNabuSumitURL();
		waitForLoader();
		
		homePage.verifyAdNabuSumitPageLaunched(url);
		homePage.clickOnSearchIcon();
		homePage.enterSearchData(searchData);
		homePage.clickOnSearchToGetResults();
		plpPage.verifySearchResultPageHeaderDisplayed();
		plpPage.verifySearchResultsPageSearchData(searchData);
	}

	/**
	 * Verify Search Suggestions
	 * 
	 * @author: Muthulakshmi
	 * Created Date: 24/01/2024
	 * 
	 * Modified By: <Name>
	 * Modified Date: <Date>
	 * 
	 * @throws Exception
	 */
	@Test(groups = { "Regression", "HomePage" },
			description = "Verify Search Suggestions", 
			testName = "HomePage_02")
	public void verifySearchSuggestions() throws Exception {
		
		String url = getTestData("ADNABU_SUMIT_URL");
		String searchData = getTestData("SEARCH_DATA");
		
		HomePage homePage = new HomePage();
		
		createTestName("HomePage_02");
		launchAdNabuSumitURL();
		waitForLoader();
		
		homePage.verifyAdNabuSumitPageLaunched(url);
		homePage.clickOnSearchIcon();
		homePage.enterSearchData(searchData);
		homePage.verifySearchSuggestionsAreDisplayed(searchData);
		homePage.verifySuggestionProductsAreDisplayed(searchData);
	}

}
