package MySteps;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import PageObjects.AddressesPage;
import PageObjects.FillUpAddressDetailsPage;
import PageObjects.LandingPage;
import PageObjects.MyAccountPage;
import PageObjects.OrderConfirmationPage;
import PageObjects.OrderSummaryPage;
import PageObjects.PaymentMethodPage;
import PageObjects.ProductConfirmationPopUpPage;
import PageObjects.ProductDetailsPage;
import PageObjects.ShippingPage;
import PageObjects.ShoppingCartSummaryPage;
import PageObjects.SignInPage;
import PageObjects.WomenPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinations2 {
	LandingPage landingPage=new LandingPage();
	SignInPage signInPage;
	MyAccountPage myAccountPage;
	WomenPage womenPage;
	ProductDetailsPage productDetailsPage;
	ProductConfirmationPopUpPage productConfirmationPopUpPage;
	ShoppingCartSummaryPage shoppingCartSummaryPage;
	ShippingPage shippingPage;
	AddressesPage addressesPage;
	FillUpAddressDetailsPage fillUpAddressDetailsPage;
	OrderSummaryPage orderSummaryPage;
	OrderConfirmationPage orderConfirmationPage;
	PaymentMethodPage paymentMethodPage;
	private TestContext context;

	/*@When("^selects women tab$")
	public void selects_women_tab() throws Throwable {
		
	    myAccountPage.clickOnWomenLink();
	}

	@When("^Clicks on first item to get the product details$")
	public void clicks_on_first_item_to_get_the_product_details() throws Throwable {
	   womenPage.selectProduct(0);
	}

	@When("^Clicks on Add to cart button$")
	public void clicks_on_Add_to_cart_button() throws Throwable {
	 productDetailsPage.clickOnAddToCart();
	}

	@When("^Choose to proceed to checkOut$")
	public void choose_to_proceed_to_checkOut() throws Throwable {
		productConfirmationPopUpPage.clickOnProceedToCheckOutBtn();
	    
	}

	@When("^Click on proceed to CheckOut button in Shoping Cart Summary Page$")
	public void click_on_proceed_to_CheckOut_button_in_Shoping_Cart_Summary_Page() throws Throwable {
		shoppingCartSummaryPage.clickOnProceedToCheckOutBtnInSummary();
	}

	@When("^user Clicks on add a new address in Address Page$")
	public void user_Clicks_on_add_a_new_address_in_Address_Page() throws Throwable {
	   addressesPage.clickOnAddaNewAddressBtn();
	}

	@When("^Add user Address Details$")
	public void add_user_Address_Details() throws Throwable {
	   fillUpAddressDetailsPage.addingAdressDetails();
	}

	@When("^Selects The address to deliver items and click on proceed to checkout$")
	public void selects_The_address_to_deliver_items_and_click_on_proceed_to_checkout() throws Throwable {
	    addressesPage.selectingDeliveryAdressFromDropDown("MyHome");
	}

	@When("^Accepts TC and Clicks on Proceed to checkout in shipping page$")
	public void accepts_TC_and_Clicks_on_Proceed_to_checkout_in_shipping_page() throws Throwable {
	   
		shippingPage.clickOnTermsOfService();
		shippingPage.clickOnproceedtoCheckOutInShippingPage();
	}

	@When("^Choose the payment method option \"([^\"]*)\"$")
	public void choose_the_payment_method_option(WebElement arg1) throws Throwable {
	    paymentMethodPage.clickOnPaymentMethod(arg1);
	}

	@When("^Confirms the order$")
	public void confirms_the_order() throws Throwable {
	    orderSummaryPage.clickOnConfirmMyOrder();
	}

	@Then("^confirmation information should be displayed$")
	public void confirmation_information_should_be_displayed() throws Throwable {
	
		Assert.assertEquals(orderConfirmationPage.orderConfirmationInfo(),"Your order on My Store is complete.");
	
	}*/


}
