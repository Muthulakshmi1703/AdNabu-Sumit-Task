package adnabu.sumit.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPageLocators {

	public ProductDetailsPageLocators(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@name='add']")
	private WebElement addToCartBtn;
	
	@FindBy(xpath="//*[@id='cart-notification']")
	private WebElement cartPopup;
	
	@FindBy(xpath="//*[@class='cart-notification-product__name h4']")
	private WebElement prodNameInCartPopup;
	
	@FindBy(xpath="//a[contains(text(), 'View cart')]")
	private WebElement viewCartBtn;
	
	@FindBy(xpath="//*[contains(text(), 'Item added to your cart')]")
	private WebElement itemAddedToCartMsg;
	
	@FindBy(xpath="//button[contains(@class, 'cart-notification__close')]")
	private WebElement cartPopupCloseBtn;
	
	@FindBy(xpath="//a[@id='cart-icon-bubble']")
	private WebElement cartIcon;
	
	@FindBy(xpath="(//div[@class='cart-count-bubble']/span)[1]")
	private WebElement cartCount;

	public WebElement getAddToCartBtn() {
		return addToCartBtn;
	}

	public WebElement getCartPopup() {
		return cartPopup;
	}

	public WebElement getProdNameInCartPopup() {
		return prodNameInCartPopup;
	}

	public WebElement getViewCartBtn() {
		return viewCartBtn;
	}

	public WebElement getItemAddedToCartMsg() {
		return itemAddedToCartMsg;
	}

	public WebElement getCartPopupCloseBtn() {
		return cartPopupCloseBtn;
	}

	public WebElement getCartIcon() {
		return cartIcon;
	}

	public WebElement getCartCount() {
		return cartCount;
	}

}
