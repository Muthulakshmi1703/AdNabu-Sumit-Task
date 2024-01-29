package adnabu.sumit.locators;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import adnabu.base.utils.SeleniumBaseUtils;

public class HomePageLocators extends SeleniumBaseUtils{

	public HomePageLocators(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@aria-label='Search']")
	private WebElement searchIcon;
	
	@FindBy(xpath="(//*[contains(@id,'Search')])[1]")
	private WebElement searchTextbox;

	@FindBy(xpath="(//button[@aria-label='Search'])[1]")
	private WebElement searchBtn;
	
	@FindBy(xpath="//*[text()='Suggestions']")
	private WebElement suggestionHeader;
	
	@FindBy(xpath="//*[text()='Suggestions']/parent::div/ul/li/a/div/p/mark")
	private List<WebElement> suggestions;
	
	@FindBy(xpath="//*[text()='Products']/parent::div/ul/li/a/div/p")
	private List<WebElement> suggestionProducts;
	
	public WebElement getSearchIcon() {
		return searchIcon;
	}

	public WebElement getSearchTextbox() {
		return searchTextbox;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public List<WebElement> getSuggestions() {
		return suggestions;
	}

	public List<WebElement> getSuggestionProducts() {
		return suggestionProducts;
	}

	public WebElement getSuggestionHeader() {
		return suggestionHeader;
	}
	
}
