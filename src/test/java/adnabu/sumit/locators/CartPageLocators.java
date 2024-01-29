package adnabu.sumit.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import adnabu.base.utils.SeleniumBaseUtils;

public class CartPageLocators extends SeleniumBaseUtils{

	public CartPageLocators(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h1[text()='Your cart']")
	private WebElement cartPageTitle;
	
	@FindBy(xpath="//*[text()='Your cart is empty']")
	private WebElement yourCartIsEmptyMsg;
	
	@FindBy(xpath="//*[contains(@class, 'cart-item__name')]")
	private WebElement productNameInCart;
	
	@FindBy(xpath="//*[contains(@id, 'Remove')]/a")
	private WebElement removeProductBtn;
	
	@FindBy(xpath="//a[text()='Continue shopping']")
	private WebElement continueShopping;
	
	@FindBy(xpath="//th[contains(text(), 'Product')]")
	private WebElement prodHeader;
	
	@FindBy(xpath="//th[contains(text(), 'Quantity')]")
	private WebElement qtyHeader;
	
	@FindBy(xpath="(//th[contains(text(), 'Total')])[2]")
	private WebElement totalHeader;
	
	@FindBy(xpath="//img[@class='cart-item__image']")
	private WebElement prodImg;
	
	@FindBy(xpath="//a[contains(@class, 'cart-item__name')]")
	private WebElement prodName;
	
	@FindBy(xpath="//input[@class='quantity__input']")
	private WebElement prodQty;
	
	@FindBy(xpath="(//div[contains(@class, 'cart-item__price')]/span)[2]")
	private WebElement prodPrice;
	
	@FindBy(xpath="//h2[text()='Estimated total']/following-sibling::p")
	private WebElement estiTotal;
	
	@FindBy(xpath="//small[contains(@class, 'tax-note')]")
	private WebElement taxesAndDiscountsMsg;
	
	@FindBy(xpath="//button[@id='checkout']")
	private WebElement checkoutBtn;
	
	public WebElement getContinueShopping() {
		return continueShopping;
	}

	public WebElement getProdHeader() {
		return prodHeader;
	}

	public WebElement getQtyHeader() {
		return qtyHeader;
	}

	public WebElement getTotalHeader() {
		return totalHeader;
	}

	public WebElement getProdImg() {
		return prodImg;
	}

	public WebElement getProdName() {
		return prodName;
	}

	public WebElement getProdQty() {
		return prodQty;
	}

	public WebElement getProdPrice() {
		return prodPrice;
	}

	public WebElement getEstiTotal() {
		return estiTotal;
	}

	public WebElement getTaxesAndDiscountsMsg() {
		return taxesAndDiscountsMsg;
	}

	public WebElement getCheckoutBtn() {
		return checkoutBtn;
	}

	public WebElement getCartPageTitle() {
		return cartPageTitle;
	}

	public WebElement getYourCartIsEmptyMsg() {
		return yourCartIsEmptyMsg;
	}

	public WebElement getProductNameInCart() {
		return productNameInCart;
	}

	public WebElement getRemoveProductBtn() {
		return removeProductBtn;
	}
	
}
