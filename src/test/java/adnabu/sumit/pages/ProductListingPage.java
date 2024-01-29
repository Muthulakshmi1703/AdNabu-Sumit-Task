package adnabu.sumit.pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import adnabu.base.utils.BasePage;
import adnabu.base.utils.SeleniumBaseUtils;
import adnabu.sumit.locators.ProductListingPageLocators;

public class ProductListingPage extends SeleniumBaseUtils{

	public static ProductListingPageLocators locators = new ProductListingPageLocators(driver);

	/**
	 * This Function is to Verify Search Result page Header is displayed
	 * 
	 * @author Muthulakshmi 
	 * Created Date:23/01/2024
	 * 
	 * Modified By: 
	 * Modified Date:
	 * 
	 * @throws Exception 
	 */
	public void verifySearchResultPageHeaderDisplayed() throws Exception {
	try {
		elementDisplayed(new ProductListingPageLocators(driver).getSearchResultsHeader(), 10);
		reportStatus("PASS", "Search results Page header is displayed");
	}catch(Exception e) {
		reportStatus("FAIL", "Search results Page header isn't displayed");
	}
	}
	
	/**
	 * This Function is to Verify Search Result page Search data
	 * 
	 * @author Muthulakshmi 
	 * Created Date:23/01/2024
	 * 
	 * Modified By: 
	 * Modified Date:
	 * 
	 * @throws Exception 
	 */
	public void verifySearchResultsPageSearchData(String searchData) throws Exception {
	try {
		elementDisplayed(new ProductListingPageLocators(driver).getSearchTextbox(), 10);
		String actualSearchData = getAttribute(new ProductListingPageLocators(driver).getSearchTextbox(), "value");
		if(actualSearchData.equals(searchData)) {
			reportStatus("PASS WITH SCREENSHOT", searchData+" displayed in PLP page Search Textbox");
		}
	}catch(Exception e) {
		reportStatus("FAIL", searchData+" isn't displayed in PLP page Search Textbox");
	}
	}
	
	/**
	 * This Function is to Verify Availability filter is displayed
	 * 
	 * @author Muthulakshmi 
	 * Created Date:24/01/2024
	 * 
	 * Modified By: 
	 * Modified Date:
	 * 
	 * @throws Exception 
	 */
	public void verifyAvailabilityFilterIsDisplayed() throws Exception {
	try {
		elementDisplayed(new ProductListingPageLocators(driver).getAvailabilityFilter(), 10);
		reportStatus("PASS", "Availability filter is displayed");
	}catch(Exception e) {
		reportStatus("FAIL", "Availability filter isn't displayed");
	}
	}
	
	/**
	 * This Function is to Click on Availability filter
	 * 
	 * @author Muthulakshmi 
	 * Created Date:24/01/2024
	 * 
	 * Modified By: 
	 * Modified Date:
	 * 
	 * @throws Exception 
	 */
	public void clickOnAvailabilityFilter() throws Exception {
	try {
		click(new ProductListingPageLocators(driver).getAvailabilityFilter(), 10);
		reportStatus("PASS", "Clicked on Availability filter");
	}catch(Exception e) {
		reportStatus("FAIL", "Unable to Click on Availability filter");
	}
	}
	
	/**
	 * This Function is to Verify Availability filter elements are displayed
	 * 
	 * @author Muthulakshmi 
	 * Created Date:24/01/2024
	 * 
	 * Modified By: 
	 * Modified Date:
	 * 
	 * @throws Exception 
	 */
	public void verifyAvailabilityFilterElementsAreDisplayed() throws Exception {
		
	try {
		elementDisplayed(new ProductListingPageLocators(driver).getSelectedElement(), 10);
		reportStatus("PASS", "Selected element is displayed");
	}catch(Exception e) {
		reportStatus("FAIL", "Selected element isn't displayed");
	}
	
	try {
		elementDisplayed(new ProductListingPageLocators(driver).getResetBtn(), 10);
		reportStatus("PASS", "Reset button is displayed");
	}catch(Exception e) {
		reportStatus("FAIL", "Reset button isn't displayed");
	}
	
	try {
		elementDisplayed(new ProductListingPageLocators(driver).getInStockCheckbox(), 10);
		reportStatus("PASS", "In Stock checkbox is displayed");
	}catch(Exception e) {
		reportStatus("FAIL", "In Stock checkbox isn't displayed");
	}
	
	try {
		elementDisplayed(new ProductListingPageLocators(driver).getOutOfStockCheckbox(), 10);
		reportStatus("PASS", "Out of Stock checkbox is displayed");
	}catch(Exception e) {
		reportStatus("FAIL", "Out of Stock checkbox isn't displayed");
	}
	}
	
	/**
	 * This Function is to Click on Instock Checkbox
	 * 
	 * @author Muthulakshmi 
	 * Created Date:24/01/2024
	 * 
	 * Modified By: 
	 * Modified Date:
	 * 
	 * @throws Exception 
	 */
	public void clickOnInStockCheckbox() throws Exception {
	try {
		scrollIntoView(new ProductListingPageLocators(driver).getInStockCheckbox());
		click(new ProductListingPageLocators(driver).getInStockCheckbox(), 20);
		reportStatus("PASS", "Clicked on In Stock Checkbox");
	}catch(Exception e) {
		reportStatus("FAIL", "Unable to Click on In Stock Checkbox");
		reportStatus("FAIL", e.getMessage());
	}
	}
	
	/**
	 * This Function is to Click on Out of Stock Checkbox
	 * 
	 * @author Muthulakshmi 
	 * Created Date:24/01/2024
	 * 
	 * Modified By: 
	 * Modified Date:
	 * 
	 * @throws Exception 
	 */
	public void clickOnOutOfStockCheckbox() throws Exception {
	try {
		scrollIntoView(new ProductListingPageLocators(driver).getOutOfStockCheckbox());
		click(new ProductListingPageLocators(driver).getOutOfStockCheckbox(), 20);
		reportStatus("PASS", "Clicked on Out of Stock Checkbox");
	}catch(Exception e) {
		reportStatus("FAIL", "Unable to Click on Out of Stock Checkbox");
		reportStatus("FAIL", e.getMessage());
	}
	}
	
	/**
	 * This Function is to Verify In Stock Label with Result Count
	 * 
	 * @author Muthulakshmi 
	 * Created Date:24/01/2024
	 * 
	 * Modified By: 
	 * Modified Date:
	 * 
	 * @throws Exception 
	 */
	public void verifyInStockLabelWithResultCount() throws Exception {
	try {
		WebElement inStock = new ProductListingPageLocators(driver).getSelectedInStockCheckbox();
		elementDisplayed(inStock, 10);
		if(inStock.isSelected()) {
			reportStatus("PASS WITH SCREENSHOT", "In Stock Checkbox selected");
			
			WebElement inStock1 = new ProductListingPageLocators(driver).getInStockCheckbox();

			String inStockText = inStock1.getText();
			String[] text = inStockText.split(" ");
			int noOfChars = text[2].length();
			String textOne = text[2].substring(1, noOfChars-1);
			int inStockCount = Integer.parseInt(textOne);
			
			Thread.sleep(3000);
			WebElement result = new ProductListingPageLocators(driver).getResultsCount();
			String text1[] = result.getText().split(" ");
			int resultCount = Integer.parseInt(text1[0]);
		
			if(inStockCount==resultCount) {
				reportStatus("PASS", "In stock products count is equal with the Filter Result Count");
			}else {
				reportStatus("FAIL", "In stock products count isn't equal with the Filter Result Count");
			}
		}else {
			reportStatus("FAIL", "In Stock Checkbox isn't selected");
		}
	}catch(Exception e) {
		reportStatus("FAIL", "In stock products count isn't equal with the Filter Result Count");
	}
	}
	
	/**
	 * This Function is to Verify Out of Stock Label with Result Count
	 * 
	 * @author Muthulakshmi 
	 * Created Date:24/01/2024
	 * 
	 * Modified By: 
	 * Modified Date:
	 * 
	 * @throws Exception 
	 */
	public void verifyOutOfStockLabelWithResultCount() throws Exception {
	try {
		WebElement outOfStock = new ProductListingPageLocators(driver).getSelectedOutOfStockCheckbox();
		elementDisplayed(outOfStock, 10);
		if(outOfStock.isSelected()) {
			reportStatus("PASS WITH SCREENSHOT", "Out of Stock Checkbox selected");
			
			WebElement outOfStock1 = new ProductListingPageLocators(driver).getOutOfStockCheckbox();

			String outOfStockText = outOfStock1.getText();
			String[] text = outOfStockText.split(" ");
			int noOfChars = text[3].length();
			String textOne = text[3].substring(1, noOfChars-1);
			int outOfStockCount = Integer.parseInt(textOne);
			
			Thread.sleep(3000);
			WebElement result = new ProductListingPageLocators(driver).getResultsCount();
			String text1[] = result.getText().split(" ");
			int resultCount = Integer.parseInt(text1[0]);
		
			if(outOfStockCount==resultCount) {
				reportStatus("PASS", "Out of stock products count is equal with the Filter Result Count");
			}else {
				reportStatus("FAIL", "Out of stock products count isn't equal with the Filter Result Count");
			}
		}else {
			reportStatus("FAIL", "Out of Stock Checkbox isn't selected");
		}
	}catch(Exception e) {
		reportStatus("FAIL", "Out of stock products count isn't equal with the Filter Result Count");
	}
	}
	
	/**
	 * This Function is to Click on Reset button
	 * 
	 * @author Muthulakshmi 
	 * Created Date:24/01/2024
	 * 
	 * Modified By: 
	 * Modified Date:
	 * 
	 * @throws Exception 
	 */
	public void clickOnResetButton() throws Exception {
	try {
		click(new ProductListingPageLocators(driver).getResetBtn(), 10);
		reportStatus("PASS", "Clicked on Reset button");
	}catch(Exception e) {
		reportStatus("FAIL", "Unable to Click on Reset button");
		reportStatus("FAIL", e.getMessage());
	}
	}

	/**
	 * This Function is to Verify Filters are removed
	 * 
	 * @author Muthulakshmi 
	 * Created Date:24/01/2024
	 * 
	 * Modified By: 
	 * Modified Date:
	 * 
	 * @throws Exception 
	 */
	public void verifyFiltersAreRemoved() throws Exception {
	try {
		Thread.sleep(3000);
		WebElement inStock = new ProductListingPageLocators(driver).getSelectedInStockCheckbox();
		WebElement outOfStock = new ProductListingPageLocators(driver).getSelectedOutOfStockCheckbox();
	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementSelectionStateToBe(inStock, inStock.isSelected()));
		
		if((!inStock.isSelected()) && (!outOfStock.isSelected())) {
			reportStatus("PASS WITH SCREENSHOT", "Filters are Removed");
		}else {
			reportStatus("FAIL", "Filters aren't Removed");
		}
	}catch(Exception e) {
		reportStatus("FAIL", "Filters aren't Removed");
		reportStatus("FAIL", e.getMessage());
	}
	}
	
	/**
	 * This Function is to Click on First Product from the Results
	 * 
	 * @author Muthulakshmi 
	 * Created Date:25/01/2024
	 * 
	 * Modified By: 
	 * Modified Date:
	 * 
	 * @throws Exception 
	 */
	public void clickOnFirstProductFromTheResult() throws Exception {
	try {
		click(new ProductListingPageLocators(driver).getProductTitle(), 10);
		reportStatus("PASS", "Clicked on First product");
	}catch(Exception e) {
		reportStatus("FAIL", "Unable to Click on First product");
	}
	}
}
