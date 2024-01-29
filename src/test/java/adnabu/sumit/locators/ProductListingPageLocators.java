package adnabu.sumit.locators;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import adnabu.base.utils.SeleniumBaseUtils;

public class ProductListingPageLocators extends SeleniumBaseUtils{

	public ProductListingPageLocators(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='Search-In-Template']")
	private WebElement searchTextbox;
	
	@FindBy(xpath="//h3[contains(@id, 'title')]")
	private WebElement productTitle;
	
	@FindBy(xpath="//h1[text()='Search results']")
	private WebElement searchResultsHeader;
	
	@FindBy(xpath="//span[contains(text(), 'results') and @id='ProductCountDesktop']")
	private WebElement resultsCount;
	
	@FindBy(xpath="//h3[contains(@id, 'title')]")
	private List<WebElement> productTitles;
	
	@FindBy(xpath="//span[contains(text(), 'Availability')]")
	private WebElement availabilityFilter;
	
	@FindBy(xpath="(//*[contains(text(), 'In stock')])[1]")
	private WebElement inStockCheckbox;
	
	@FindBy(xpath="(//*[contains(text(), 'In stock')])[1]/preceding-sibling::input")
	private WebElement selectedInStockCheckbox;
	
	@FindBy(xpath="(//*[contains(text(), 'Out of stock')])[1]")
	private WebElement outOfStockCheckbox;
	
	@FindBy(xpath="(//*[contains(text(), 'Out of stock')])[1]/preceding-sibling::input")
	private WebElement selectedOutOfStockCheckbox;
	
	@FindBy(xpath="//span[contains(text(), 'selected')]")
	private WebElement selectedElement;
	
	@FindBy(xpath="//a[contains(text(), 'Reset')]")
	private WebElement resetBtn;
	
	@FindBy(xpath="(//*[text()='Remove filter'])[1]")
	private WebElement removeFilterBtn;
	
	@FindBy(xpath="(//*[text()='Remove all']/parent::a)[1]")
	private WebElement removeAllBtn;
	
	
	public WebElement getSelectedInStockCheckbox() {
		return selectedInStockCheckbox;
	}
	
	public WebElement getSelectedOutOfStockCheckbox() {
		return selectedOutOfStockCheckbox;
	}

	public WebElement getAvailabilityFilter() {
		return availabilityFilter;
	}

	public WebElement getInStockCheckbox() {
		return inStockCheckbox;
	}

	public WebElement getOutOfStockCheckbox() {
		return outOfStockCheckbox;
	}

	public WebElement getSelectedElement() {
		return selectedElement;
	}

	public WebElement getResetBtn() {
		return resetBtn;
	}

	public WebElement getRemoveFilterBtn() {
		return removeFilterBtn;
	}

	public WebElement getRemoveAllBtn() {
		return removeAllBtn;
	}

	public WebElement getSearchTextbox() {
		return searchTextbox;
	}

	public WebElement getProductTitle() {
		return productTitle;
	}

	public WebElement getSearchResultsHeader() {
		return searchResultsHeader;
	}

	public WebElement getResultsCount() {
		return resultsCount;
	}
	
	public List<WebElement> getProductTitles() {
		return productTitles;
	}
	
	
}
