package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.WebTestBase1;

import utilis.Utility1;

public class MyAccountPage extends WebTestBase1 {
	@FindBy(xpath = "//*[@id=\"columns\"]/div[1]")
    WebElement loginTitle;


	@FindBy(xpath = "//*[@id=\"search_query_top\"]")            
    WebElement searchTextBox;
	
	@FindBy(xpath = "//*[@id=\"searchbox\"]/button")
	WebElement searchBtn;
	

	//@FindBy(xpath = "//*[@id=\"index\"]/div[2]")
	@FindBy(xpath = "//*[@id=\"search_query_top\"]")            
    WebElement searchTitle;
	
     @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	    WebElement dropDown;
	 
	 @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	    WebElement hover;
	 
	 @FindBy(xpath = "//*[@id=\"social_block\"]/ul/li[2]/a")
	    WebElement twitterOption;
	
	
	
	public MyAccountPage(){
        PageFactory.initElements(driver, this);
    }

	public String getTextOfSearch() {
		//getting the result of search text
		return searchTitle.getText();
	}
	public String getTextOFMyAccountPage(){
        return loginTitle.getText();
    }
	
	public void search(){
        searchTextBox.click();
        searchTextBox.sendKeys("dresses");
        searchTextBox.sendKeys(Keys.ENTER);
        searchBtn.click();
    }
	public void selectDropDown(String term, String value) {
		dropDown.click();
		Utility1.selectValue(dropDown,term,value);
	}
	
	public void mouseHover() {
		Utility1.mouseHover(driver,hover);
	}
	public void scrollDownMethod() {
		// TODO Auto-generated method stub
		Utility1.scrollDownByElement(driver, twitterOption);
		twitterOption.click();
		
	}
	public void windowHandle() {
		// TODO Auto-generated method stub
		Utility1.scrollDownByElement(driver, twitterOption);
        twitterOption.click();
        Utility1.switchToWindows(driver);
		
	}
	public static void scrollDown() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
	}
	public static void scrollUp() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
	}
	public void getCookiesHandle() {
		// TODO Auto-generated method stub
		Utility1.getCookies();
		
	}
	
	
	
	
}
