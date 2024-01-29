package adnabu.sumit.pages;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import adnabu.base.utils.BasePage;
import adnabu.base.utils.SeleniumBaseUtils;
import adnabu.sumit.locators.CartPageLocators;

public class CartPage extends SeleniumBaseUtils{

	/**
	 * This Function is to Verify User redirects to the Cart Page
	 * 
	 * @author Muthulakshmi 
	 * Created Date:25/01/2024
	 * 
	 * Modified By: 
	 * Modified Date:
	 * 
	 * @throws Exception 
	 */
	public void verifyUserRedirectsToTheCartPage(String cartPageUrl) throws Exception {
	try {
		BasePage.waitForLoader();
		refresh();
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.urlContains(cartPageUrl));
		
		String currentUrl = getCurrentUrl();
		if(currentUrl.endsWith(cartPageUrl)) {
			reportStatus("PASS", "User redirects to the CartPage");
		}else {
			reportStatus("FAIL", "User not redirects to the CartPage");	
		}
	}catch(Exception e) {
		reportStatus("FAIL", "User not redirects to the CartPage");
	}
	}
	
	/**
	 * This Function is to Verify User redirects to the PDP Page
	 * 
	 * @author Muthulakshmi 
	 * Created Date:25/01/2024
	 * 
	 * Modified By: 
	 * Modified Date:
	 * 
	 * @throws Exception 
	 */
	public void verifyAddedProductDisplayedInTheCart() throws Exception {
	try {
		refresh();
		BasePage.waitForLoader();
		WebElement prodName = new CartPageLocators(driver).getProductNameInCart();
		elementDisplayed(prodName, 10);
		reportStatus("PASS WITH SCREENSHOT", prodName.getText()+" added Product displayed in the Cart");
	} 
	catch(Exception e) {
		reportStatus("FAIL", "Unable to Verify added Product isn't displayed in the Cart");
	}
	}
	
	/**
	 * This Function is to Verify User able to Remove product from Cart
	 * 
	 * @author Muthulakshmi 
	 * Created Date:25/01/2024
	 * 
	 * Modified By: 
	 * Modified Date:
	 * 
	 * @throws Exception 
	 */
	public void verifyUserAbleToRemoveProductFromCart() throws Exception {
	try {
		WebElement remove = new CartPageLocators(driver).getRemoveProductBtn();
		elementDisplayed(remove, 10);
		click(remove, 10);
		reportStatus("PASS", "Clicked on Product Remove button from the Cart");
	} 
	catch(Exception e) {
		reportStatus("FAIL", "Unable to Click Product Remove button from the Cart");

	}
	try {
		BasePage.waitForLoader();
		elementDisplayed(new CartPageLocators(driver).getYourCartIsEmptyMsg(), 30);
		reportStatus("PASS WITH SCREENSHOT", "Product removed from the Cart");
	}
	catch(Exception e) {
		reportStatus("PASS", "Unable to Verify Verify User able to Remove product from Cart");
	}
	}
	
	/**
	 * This Function is to Verify CartPage Elements are displayed
	 * 
	 * @author Muthulakshmi 
	 * Created Date:25/01/2024
	 * 
	 * Modified By: 
	 * Modified Date:
	 * 
	 * @throws Exception 
	 */
	public void verifyCartPageElementsAreDisplayed() throws Exception {
	try {
		WebElement pageTitle = new CartPageLocators(driver).getCartPageTitle();
		elementDisplayed(pageTitle, 10);
		reportStatus("PASS WITH SCREENSHOT", "CartPage Title is displayed");
	} 
	catch(Exception e) {
		reportStatus("FAIL", "CartPage Title isn't displayed");

	}
	try {
		elementDisplayed(new CartPageLocators(driver).getContinueShopping(), 10);
		reportStatus("PASS", "Continue Shopping is displayed");
	}
	catch(Exception e) {
		reportStatus("FAIL", "Continue Shopping isn't displayed");
	}
	try {
		elementDisplayed(new CartPageLocators(driver).getProdHeader(), 10);
		reportStatus("PASS", "Product header is displayed");
	} 
	catch(Exception e) {
		reportStatus("FAIL", "Product header isn't displayed");

	}
	try {
		elementDisplayed(new CartPageLocators(driver).getQtyHeader(), 10);
		reportStatus("PASS", "Quantity header is displayed");
	}
	catch(Exception e) {
		reportStatus("FAIL", "Quantity header isn't displayed");
	}
	try {
		elementDisplayed(new CartPageLocators(driver).getTotalHeader(), 10);
		reportStatus("PASS", "Total header is displayed");
	}
	catch(Exception e) {
		reportStatus("FAIL", "Total header isn't displayed");
	}
	try {
		elementDisplayed(new CartPageLocators(driver).getProdImg(), 10);
		reportStatus("PASS", "Product Image is displayed");
	} 
	catch(Exception e) {
		reportStatus("FAIL", "Product Image isn't displayed");

	}
	try {
		elementDisplayed(new CartPageLocators(driver).getProdName(), 10);
		reportStatus("PASS", "Product Name is displayed");
	}
	catch(Exception e) {
		reportStatus("FAIL", "Product Name isn't displayed");
	}
	try {
		elementDisplayed(new CartPageLocators(driver).getProdQty(), 10);
		reportStatus("PASS", "Product Quantity is displayed");
	} 
	catch(Exception e) {
		reportStatus("FAIL", "Product Quantity isn't displayed");
	}
	try {
		elementDisplayed(new CartPageLocators(driver).getProdPrice(), 10);
		reportStatus("PASS", "Product price is displayed");
	}
	catch(Exception e) {
		reportStatus("FAIL", "Product price isn't displayed");
	}
	try {
		elementDisplayed(new CartPageLocators(driver).getEstiTotal(), 10);
		reportStatus("PASS", "Estimated total is displayed");
	}
	catch(Exception e) {
		reportStatus("FAIL", "Estimated total isn't displayed");
	}
	try {
		elementDisplayed(new CartPageLocators(driver).getTaxesAndDiscountsMsg(), 10);
		reportStatus("PASS", "Tax notes msg is displayed");
	} 
	catch(Exception e) {
		reportStatus("FAIL", "Tax notes msg isn't displayed");

	}
	try {
		elementDisplayed(new CartPageLocators(driver).getCheckoutBtn(), 10);
		reportStatus("PASS", "Checkout is displayed");
	}
	catch(Exception e) {
		reportStatus("FAIL", "Checkout isn't displayed");
	}
	}
}
