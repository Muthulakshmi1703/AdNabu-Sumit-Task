package adnabu.sumit.pages;

import static org.testng.Assert.assertThrows;

import java.util.List;

import org.openqa.selenium.WebElement;

import adnabu.base.utils.BasePage;
import adnabu.base.utils.SeleniumBaseUtils;
import adnabu.sumit.locators.HomePageLocators;
import adnabu.sumit.locators.ProductListingPageLocators;

public class HomePage extends BasePage{
	
	public static HomePageLocators locators = new HomePageLocators(driver);
	
	/**
	 * This Function is to Verify AdNabu-Sumit Page is launched
	 * 
	 * @author Muthulakshmi 
	 * Created Date:23/01/2024
	 * 
	 * Modified By: 
	 * Modified Date:
	 * 
	 * @throws Exception 
	 */
	public void verifyAdNabuSumitPageLaunched(String url) throws Exception {
	try {
		String currentUrl = getCurrentUrl();
		if(currentUrl.equals(url)) {
			reportStatus("PASS", "AdNabu-Sumit URL launched successfully");
		}else {
			reportStatus("FAIL", "AdNabu-Sumit URL not launched");
		}
	}catch(Exception e) {
		reportStatus("FAIL", e.getMessage());
	}	
	}

	/**
	 * This Function is to Click on Search Icon
	 * 
	 * @author Muthulakshmi 
	 * Created Date:23/01/2024
	 * 
	 * Modified By: 
	 * Modified Date:
	 * 
	 * @throws Exception 
	 */
	public void clickOnSearchIcon() throws Exception {
	try {
		elementDisplayed(new HomePageLocators(driver).getSearchIcon(), 10);
		reportStatus("PASS", "Search Icon is displayed");
		click(new HomePageLocators(driver).getSearchIcon(), 10);
		reportStatus("PASS", "Search Icon is Clicked");
	}catch(Exception e) {
		reportStatus("FAIL", "Unable to Click Search Icon");
	}	
	}
	
	/**
	 * This Function is to Enter data in Search Textbox
	 * 
	 * @author Muthulakshmi 
	 * Created Date:23/01/2024
	 * 
	 * Modified By: 
	 * Modified Date:
	 * 
	 * @throws Exception 
	 */
	public void enterSearchData(String searchData) throws Exception {
	try {
		WebElement search = new HomePageLocators(driver).getSearchTextbox();
		elementDisplayed(search, 10);
		reportStatus("PASS", "Search textbox is displayed");
		dataSend(search, searchData);
		reportStatus("PASS", searchData+" entered in Search textbox");
	}catch(Exception e) {
		reportStatus("FAIL", "Unable to Enter data in Search Textbox");
	}	
	}
	
	/**
	 * This Function is to Click on Search to get results
	 * 
	 * @author Muthulakshmi 
	 * Created Date:23/01/2024
	 * 
	 * Modified By: 
	 * Modified Date:
	 * 
	 * @throws Exception 
	 */
	public void clickOnSearchToGetResults() throws Exception {
	try {
		WebElement search = new HomePageLocators(driver).getSearchTextbox();
		elementDisplayed(search, 10);
		submit(search);
		reportStatus("PASS", "Clicked on Search to get results");
	}catch(Exception e) {
		reportStatus("FAIL", "Unable to Click on Search to get results");
	}	
	}
	
	/**
	 * This Function is to Verify Search Suggestions are displayed
	 * 
	 * @author Muthulakshmi 
	 * Created Date:24/01/2024
	 * 
	 * Modified By: 
	 * Modified Date:
	 * 
	 * @throws Exception 
	 */
	public void verifySearchSuggestionsAreDisplayed(String searchData) throws Exception {
	try {
		waitForLoader();
		elementDisplayed(new HomePageLocators(driver).getSuggestionHeader(), 20);
		reportStatus("PASS WITH SCREENSHOT", "Suggestions are displayed");
		List<WebElement> suggestions = new HomePageLocators(driver).getSuggestions();
		for (WebElement suggText : suggestions) {
			if(suggText.getText().contains(searchData.toLowerCase())) {
				reportStatus("PASS", "Suggestions contains the Search data");
			}else {
				reportStatus("FAIL", "Suggestions doesn't contains the Search data");
			}
		}
	}catch(Exception e) {
		reportStatus("FAIL", "Suggestions doesn't contains the Search data");
	}	
	}
	
	/**
	 * This Function is to Verify Suggestion products are displayed
	 * 
	 * @author Muthulakshmi 
	 * Created Date:24/01/2024
	 * 
	 * Modified By: 
	 * Modified Date:
	 * 
	 * @throws Exception 
	 */
	public void verifySuggestionProductsAreDisplayed(String searchData) throws Exception {
	try {
		List<WebElement> suggestionProducts = new HomePageLocators(driver).getSuggestionProducts();
		reportStatus("PASS WITH SCREENSHOT", "Suggestion Products are displayed");

		for (WebElement products : suggestionProducts) {
			if(products.getText().contains(searchData)) {
				reportStatus("PASS", "Suggestion Products contains the Search data");
			}else {
				reportStatus("FAIL", "Suggestion Products doesn't contains the Search data");
			}
		}
	}catch(Exception e) {
		reportStatus("FAIL", "Suggestion Products doesn't contains the Search data");
	}	
	}
}
