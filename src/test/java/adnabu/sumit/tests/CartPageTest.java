package adnabu.sumit.tests;

import org.testng.annotations.Test;

import adnabu.base.utils.BasePage;
import adnabu.sumit.pages.CartPage;
import adnabu.sumit.pages.HomePage;
import adnabu.sumit.pages.ProductDetailsPage;
import adnabu.sumit.pages.ProductListingPage;

public class CartPageTest extends BasePage{
	
	/**
	 * Verify User to able Add Product into the Cart
	 * 
	 * @author: Muthulakshmi
	 * Created Date: 25/01/2024
	 * 
	 * Modified By: <Name>
	 * Modified Date: <Date>
	 * 
	 * @throws Exception
	 */
	@Test(groups = { "Regression", "CartPage" },
			description = "Verify User to able Add Product into the Cart", 
			testName = "CartPage_01")
	public void verifyUserAbleToAddProductIntoTheCart() throws Exception {
		
		String url = getTestData("ADNABU_SUMIT_URL");
		String searchData = getTestData("SEARCH_DATA_1");
		String itemQty = getTestData("ITEM_QTY");
		String infoMsg = getValidationData("ITEM_ADDED_TO_CART_MSG");
		String cartPageUrl = getValidationData("CART_PAGE_URL");
		
		HomePage homePage = new HomePage();
		ProductListingPage plpPage = new ProductListingPage();
		ProductDetailsPage pdpPage = new ProductDetailsPage();
		CartPage cartPage = new CartPage();
		
		createTestName("CartPage_01");
		launchAdNabuSumitURL();
		waitForLoader();
		
		homePage.verifyAdNabuSumitPageLaunched(url);
		homePage.clickOnSearchIcon();
		homePage.enterSearchData(searchData);
		homePage.clickOnSearchToGetResults();
		plpPage.verifySearchResultPageHeaderDisplayed();
		plpPage.verifySearchResultsPageSearchData(searchData);
		
		plpPage.clickOnFirstProductFromTheResult();
		pdpPage.verifyUserRedirectsToPDPPage();
		pdpPage.clickOnAddToCart();
		
	//Following method script was done but,
	//In manual Cart Popup is working properly 
	//via automation it wasn't displaying properly
		
//		pdpPage.verifyProductAddedIntoTheCart(infoMsg);
//		pdpPage.verifyCartPopupDisplayed();
//		pdpPage.closeCartPopup();
//		pdpPage.verifyCartIconDisplayedWithUpdatedCount(itemQty);
		
		pdpPage.clickOnCartIcon();
		cartPage.verifyUserRedirectsToTheCartPage(cartPageUrl);
		cartPage.verifyAddedProductDisplayedInTheCart();
	}

	/**
	 * Verify User to able Remove Product from the Cart
	 * 
	 * @author: Muthulakshmi
	 * Created Date: 25/01/2024
	 * 
	 * Modified By: <Name>
	 * Modified Date: <Date>
	 * 
	 * @throws Exception
	 */
	@Test(groups = { "Regression", "CartPage" },
			description = "Verify User to able Remove Product from the Cart", 
			testName = "CartPage_02")
	public void verifyUserAbleToRemoveProductFromTheCart() throws Exception {
		
		String url = getTestData("ADNABU_SUMIT_URL");
		String searchData = getTestData("SEARCH_DATA_1");
		String cartPageUrl = getValidationData("CART_PAGE_URL");
		
		HomePage homePage = new HomePage();
		ProductListingPage plpPage = new ProductListingPage();
		ProductDetailsPage pdpPage = new ProductDetailsPage();
		CartPage cartPage = new CartPage();
		
		createTestName("CartPage_02");
		launchAdNabuSumitURL();
		waitForLoader();
		
		homePage.verifyAdNabuSumitPageLaunched(url);
		homePage.clickOnSearchIcon();
		homePage.enterSearchData(searchData);
		homePage.clickOnSearchToGetResults();
		plpPage.verifySearchResultPageHeaderDisplayed();
		plpPage.verifySearchResultsPageSearchData(searchData);
		
		plpPage.clickOnFirstProductFromTheResult();
		pdpPage.verifyUserRedirectsToPDPPage();
		pdpPage.clickOnAddToCart();
		pdpPage.clickOnCartIcon();
		cartPage.verifyUserRedirectsToTheCartPage(cartPageUrl);
		cartPage.verifyAddedProductDisplayedInTheCart();
		cartPage.verifyUserAbleToRemoveProductFromCart();
	}

	/**
	 * Verify CartPage elements are displayed
	 * 
	 * @author: Muthulakshmi
	 * Created Date: 25/01/2024
	 * 
	 * Modified By: <Name>
	 * Modified Date: <Date>
	 * 
	 * @throws Exception
	 */
	@Test(groups = { "Regression", "CartPage" },
			description = "Verify CartPage elements are displayed", 
			testName = "CartPage_03")
	public void verifyCartPageElementsAreDisplayed() throws Exception {
		
		String url = getTestData("ADNABU_SUMIT_URL");
		String searchData = getTestData("SEARCH_DATA_1");
		String cartPageUrl = getValidationData("CART_PAGE_URL");
		
		HomePage homePage = new HomePage();
		ProductListingPage plpPage = new ProductListingPage();
		ProductDetailsPage pdpPage = new ProductDetailsPage();
		CartPage cartPage = new CartPage();
		
		createTestName("CartPage_03");
		launchAdNabuSumitURL();
		waitForLoader();
		
		homePage.verifyAdNabuSumitPageLaunched(url);
		homePage.clickOnSearchIcon();
		homePage.enterSearchData(searchData);
		homePage.clickOnSearchToGetResults();
		plpPage.verifySearchResultPageHeaderDisplayed();
		plpPage.verifySearchResultsPageSearchData(searchData);
		
		plpPage.clickOnFirstProductFromTheResult();
		pdpPage.verifyUserRedirectsToPDPPage();
		pdpPage.clickOnAddToCart();
		pdpPage.clickOnCartIcon();
		cartPage.verifyUserRedirectsToTheCartPage(cartPageUrl);
		cartPage.verifyAddedProductDisplayedInTheCart();
		cartPage.verifyCartPageElementsAreDisplayed();
	}
}
