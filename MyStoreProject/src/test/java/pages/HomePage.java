package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.WebTestBase1;

public class HomePage extends WebTestBase1 {
	@FindBy(xpath = "//a[@class='login']") 
	WebElement signInBtn;
	
/*	@FindBy(xpath = "//img[@class='logo img-responsive']")
	WebElement myStoreLogo;
	
	@FindBy(id="search_query_top")
	WebElement searchProductBox;
	
	@FindBy(name="submit_search")
	WebElement submitButton;       */
	
	
    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    public void clickOnSignIn(){
    	signInBtn.click();
    }
    
  /*  public void validateLogo() {
    	myStoreLogo.isDisplayed();
    }
    
    @SuppressWarnings("unused")
	public void getMystoreTitle() {
    	String myStoreTitle=driver.getTitle();
    }
    
    public void searchProduct() {
    	searchProductBox.isDisplayed();
    }                                                  */

}

