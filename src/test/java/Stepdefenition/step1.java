package Stepdefenition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Base;
import pageobjects.HomePage;

public class step1 {

	WebDriver driver;


@Given("Launching the browser")
public void launching_the_browser() {
	new Base().invokeChrome();
}

@When("Navigate to signin menu")
public void navigate_to_signin_menu() {
	HomePage hp=new HomePage();
	   hp.accept();	
	   hp.signin();
   
}

@When("Click signin option")
public void click_signin_option() {
	HomePage hp=new HomePage();
 hp.clicksignin();   
}

@When("Enter {string} and {string}")
public void enter_and(String string1, String string2) {
	HomePage hp=new HomePage();
	//hp.enterusername("reva24july@gmail.com");
//	hp.enterpassword("Temp@123");
	hp.enterusername(string1);
	hp.enterpassword(string2);

}

@When("click login")
public void click_login() {
	HomePage hp=new HomePage();
	hp.accountlogin();
}

@Then("user navigates to account page")
public void user_navigates_to_account_page() {
  System.out.println("user is on account page");
}

//*****Adding product to cart*****//

@Given("logged in on the Safeway website")
public void i_am_logged_in_on_the_safeway_website() throws Exception {
	//System.out.println("user on the account page");
	HomePage hp=new HomePage();
	hp.clearingcapeche();
	

}

@When("search for an item {string}")
public void search_for_an_item(String string) {
	HomePage hp=new HomePage();
	hp.selectingtheProduct();
}


@When("click on the first search result")
public void i_click_on_the_first_search_result() {
	HomePage hp=new HomePage();
    hp.clicktheproduct();

}

@When("click the add to cart  button")
public void click_the_add_to_cart_button() {
	HomePage hp=new HomePage();
	hp.addtocart();
	hp.selectingproductsfromList();
	hp.addingSpecificProduct();
}


@Then(" item should be added to my cart")
public void the_item_should_be_added_to_my_cart() {
	HomePage hp=new HomePage();
	hp.checkingcart();
}

//***Adding second product****//


@Given("User is on the product page")
public void i_am_on_the_product_page() {
	HomePage hp=new HomePage();
	hp.closingcart();
   System.out.println("User is on the product page"); 
}

@When("Search  for the second product")
public void search_for_the_second_product() throws Exception {
	HomePage hp=new HomePage();
	hp.searching2ndproduct();
	hp.clearingcapeche();
	

}

@When("Select the second product")
public void select_the_second_product() {
	HomePage hp=new HomePage();
	hp.clicking2ndproduct();
}

@Then("click on the {string} button for the second product")
public void click_on_the_button_for_the_second_product(String string) {
	HomePage hp=new HomePage();
	hp.addingsecondproduct();
}

@Then("should see both products in the shopping cart")
public void should_see_both_products_in_the_shopping_cart() {
	HomePage hp=new HomePage();
	hp.checkingcart();
}







}
