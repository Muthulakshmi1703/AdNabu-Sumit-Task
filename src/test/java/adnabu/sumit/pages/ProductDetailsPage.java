package adnabu.sumit.pages;

import org.openqa.selenium.WebElement;

import adnabu.base.utils.BasePage;
import adnabu.base.utils.SeleniumBaseUtils;
import adnabu.sumit.locators.ProductDetailsPageLocators;

public class ProductDetailsPage extends SeleniumBaseUtils{

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
	public void verifyUserRedirectsToPDPPage() throws Exception {
	try {
		Thread.sleep(3000);
		elementDisplayed(new ProductDetailsPageLocators(driver).getAddToCartBtn(), 10);
		reportStatus("PASS", "User redirects to the PDPPage");
	}catch(Exception e) {
		reportStatus("FAIL", "User not redirects to the PDPPage");
	}
	}
	
	/**
	 * This Function is to Click on Add to Cart
	 * 
	 * @author Muthulakshmi 
	 * Created Date:25/01/2024
	 * 
	 * Modified By: 
	 * Modified Date:
	 * 
	 * @throws Exception 
	 */
	public void clickOnAddToCart() throws Exception {
	try {
		click(new ProductDetailsPageLocators(driver).getAddToCartBtn(), 10);
		reportStatus("PASS", "Clicked on Add to Cart");
	}catch(Exception e) {
		reportStatus("FAIL", "Unable to Click on Add to Cart");
	}
	}
	

	/**
	 * This Function is to Verify Product added into the Cart
	 * 
	 * @author Muthulakshmi 
	 * Created Date:25/01/2024
	 * 
	 * Modified By: 
	 * Modified Date:
	 * 
	 * @throws Exception 
	 */
	public void verifyProductAddedIntoTheCart(String infoMsg) throws Exception {
	try {
		WebElement msg = new ProductDetailsPageLocators(driver).getItemAddedToCartMsg();
		elementDisplayed(msg, 10);
		if(msg.getText().contains(infoMsg)) {
			reportStatus("PASS", "Product added into the Cart");
		}else {
			reportStatus("FAIL", "Product not added into the Cart");
		}
	}catch(Exception e) {
		reportStatus("FAIL", "Product not added into the Cart");
	}
	}
	
	/**
	 * This Function is to Verify Cart Popup is displayed
	 * 
	 * @author Muthulakshmi 
	 * Created Date:25/01/2024
	 * 
	 * Modified By: 
	 * Modified Date:
	 * 
	 * @throws Exception 
	 */
	public void verifyCartPopupDisplayed() throws Exception {
	try {
		WebElement popup = new ProductDetailsPageLocators(driver).getCartPopup();
		elementDisplayed(popup, 10);
		reportStatus("PASS", "Cart Popup is displayed");
	}catch(Exception e) {
		reportStatus("FAIL", "Cart Popup isn't displayed");
	}
	}
	
	/**
	 * This Function is to Close Cart Popup
	 * 
	 * @author Muthulakshmi 
	 * Created Date:25/01/2024
	 * 
	 * Modified By: 
	 * Modified Date:
	 * 
	 * @throws Exception 
	 */
	public void closeCartPopup() throws Exception {
	try {
		click(new ProductDetailsPageLocators(driver).getAddToCartBtn(), 10);
		reportStatus("PASS", "Clicked on Cart Popup close button");
	}catch(Exception e) {
		reportStatus("FAIL", "Unable to Click on Cart Popup close button");
	}
	}
	
	/**
	 * This Function is to Verify Cart Icon displayed with Updated count
	 * 
	 * @author Muthulakshmi 
	 * Created Date:25/01/2024
	 * 
	 * Modified By: 
	 * Modified Date:
	 * 
	 * @throws Exception 
	 */
	public void verifyCartIconDisplayedWithUpdatedCount(String qty) throws Exception {
	try {
		WebElement itemQty = new ProductDetailsPageLocators(driver).getItemAddedToCartMsg();
		elementDisplayed(itemQty, 10);
		if(itemQty.getText().equals(qty)) {
			reportStatus("PASS", "Cart Icon displayed with Updated count");
		}else {
			reportStatus("FAIL", "Cart Icon isn't Updated");
		}
	}catch(Exception e) {
		reportStatus("FAIL", "Cart Icon displayed with Updated count");
	}
	}
	
	/**
	 * This Function is to Click on Cart Icon
	 * 
	 * @author Muthulakshmi 
	 * Created Date:25/01/2024
	 * 
	 * Modified By: 
	 * Modified Date:
	 * 
	 * @throws Exception 
	 */
	public void clickOnCartIcon() throws Exception {
	try {
		BasePage.waitForLoader();
		click(new ProductDetailsPageLocators(driver).getCartIcon(), 10);
		reportStatus("PASS", "Clicked on Cart Icon");
	}catch(Exception e) {
		reportStatus("FAIL", "Unable to Click on Cart Icon");
	}
	}
}
