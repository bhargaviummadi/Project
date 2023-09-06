package utilis;



import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import testBase.WebTestBase1;

public class Utility1 extends WebTestBase1 {
public static void selectValue(WebElement Element,String term, String value) {
	Select dropDown=new Select(Element);
	if(term.equalsIgnoreCase("byValue")){
        dropDown.selectByValue(value);
    }else if(term.equalsIgnoreCase("byIndex")){
        dropDown.selectByIndex(Integer.parseInt(value));
    }else if(term.equalsIgnoreCase("byVisibleText")) {
    	dropDown.selectByVisibleText(value);
    }else{
        System.out.println("Please select the correct value");
    }
}
public static void mouseHover(WebDriver driver, WebElement hover) {
	// TODO Auto-generated method stub
	Actions action=new Actions(driver);
	action.moveToElement(hover)
	        .build()
	        .perform();
	
	 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
}
public static void scrollDownByElement(WebDriver driver, WebElement twitterOption) {
	// TODO Auto-generated method stub
	 JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;
     javascriptExecutor.executeScript("arguments[0].scrollIntoView();", twitterOption);
	
	
}
public static void switchToWindows(WebDriver driver) {
	// TODO Auto-generated method stub
	String parentWindows = driver.getWindowHandle();//parent Id==1
    Set<String> allWindow = driver.getWindowHandles();//Parent+child<1,2>
    for (String s : allWindow) {
    	//child Id
        if (!parentWindows.contentEquals(s)) {
            driver.switchTo().window(s);
            driver.close();
        }
       
    }
    driver.switchTo().window(parentWindows);
	
	
}
public static void getCookies() {
	// TODO Auto-generated method stub
	Set<Cookie> cookies = driver.manage().getCookies();
    for (Cookie c : cookies){
        System.out.println(c);
    }
	
}

}
