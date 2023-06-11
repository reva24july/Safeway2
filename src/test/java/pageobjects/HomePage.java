package pageobjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends Base
{
public HomePage() {
		PageFactory.initElements(driver,this);
	}


		//Elements
		@FindBy(xpath="(//button[normalize-space()='Accept All'])[1]")
		WebElement accept;
		
		@FindBy(xpath="//span[@class='button__item menu-nav__profile-button-sign-in-up d-none d-lg-inline-block dst-sign-in-up user-greeting']")
		WebElement signbutton;
		
		
		@FindBy(id="sign-in-modal-link")
		WebElement signingin;
		
		
		@FindBy(name="userId")
		WebElement username;
		
		@FindBy(name="inputPassword")
		WebElement password;
		
		@FindBy(id="btnSignIn")
		WebElement signin;
		
		@FindBy(xpath="//input[@id='skip-main-content']")
		WebElement search;
		
		@FindBy(xpath="(//span[normalize-space()='whole'])[1]")
		WebElement selectMilk;
		
		 @FindBy(xpath="//*[contains(@data-qa ,'addbutton')]")
		WebElement scroll;

		@FindBy(xpath="(//div[@class='product-title'])")
			List<WebElement>  listitems;
			
		@FindBy(xpath=" //*[contains(@data-qa ,'addbutton')]")
			WebElement add;
			
		@FindBy(xpath="//div[@id='addButton_136010121']")
			WebElement addtocart;
			
		  @FindBy(xpath="(//div[@id='addButton_136050017'])[1]")
			WebElement addSpecificProduct;
			
		@FindBy(xpath="//span[@id='abCartMini']//*[name()='svg']")
			WebElement checkingcart;
		
		@FindBy(xpath="(//span[@class='cart-count-wrapper'])[2]")
		WebElement cartCount;
		
		
		@FindBy(xpath="//button[@aria-label='close Shopping cart']//*[name()='svg']")
		WebElement closecart;
		
		@FindBy(xpath="//*[@class='typeAhead']")
		List<WebElement> secondelems;
		
		@FindBy(xpath="//button[@class='btn btn-lg btn-primary cart-dst-header-button']")
		WebElement checkout;
		
		@FindBy(xpath="//div[@id='addButton_960149890']")
		WebElement product2addtocart;
		
		
		
        //actions 
	public void accept() {
	      // waitmethod().until(ExpectedConditions.elementToBeClickable(accept)).click();
			accept.click();}
	
		//******clicking the signin button*****////
	public void signin() {
			signbutton.click();
		}
	public void clicksignin() {
			signingin.click();}
	
	
	//*****Enter username and password to signin*****//
	 public void enterusername(String name) {
      //  wait.until(ExpectedConditions.elementToBeClickable(username));
		username.sendKeys(name);
	   }
	  public void enterpassword(String pw) {
		password.sendKeys(pw);
		//signin.click();
		
	   }
	   public void accountlogin() {
		signin.click();
	   }
	   public void clearingcapeche() throws InterruptedException  {
	     // waitmethod().until(ExpectedConditions.elementToBeClickable(search));
		Thread.sleep(30000);
		   
	    }
		public void selectingtheProduct() {
			search.sendKeys("Milk");
			implicitwait();
			}
	
		public void clicktheproduct() {
			search.sendKeys(Keys.ENTER);
			//selectMilk.sendKeys(Keys.ENTER);
		}
		public void addtocart() {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);",scroll);
			js.executeScript("window.scrollBy(0,-350)");
			js.executeScript("arguments[0].click",scroll);
	      //addtocart.click();
		}
		public String gettingaddtocartnumber() {
			 return  cartCount.getText();
		}
		
		public void selectingproductsfromList() {
			for(WebElement item:listitems) {
				if( (item.getText()).contains("Horizon Organic 2% Reduced Fat DHA Omega-3 Milk - 0.5 Gallon")){
					item.click();
					break;
				}
			}
		}
		public void addingSpecificProduct() {
			addSpecificProduct.click();
			implicitwait();
		}
		
//***checking cart to check the added products*****//
		public void checkingcart() {
			Explicitwait();
			 checkingcart.click();
			
		}
		public void closingcart() {
			Explicitwait();
			closecart.click();
		}
		//public void checkout() {
			//implicitwait();
			//checkout.click();
//		}
		public void searching2ndproduct() {
			search.sendKeys("chicken");
			Explicitwait();}
		
		public void clicking2ndproduct() {
			WebElement second=secondelems.get(4);
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", second);
			
		}
		public void addingsecondproduct() {
			product2addtocart.click();
		}

	
		


	
  
}
