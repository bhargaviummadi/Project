package testBase;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTestBase1 {
	public static WebDriver driver;
	public static Properties prop;
	
	public WebTestBase1()
	{
		try
		{
			//reading the property file
			//user.dir-> It will take the current path
			FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir")+"//properties//config.properties");
			prop = new Properties();
			//loading the property file
			prop.load(fileInputStream);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void initialization()
	 {
		//for reading the property
        String browserName = prop.getProperty("browser");
        
        
        if (browserName.equals("chrome")){
        	//loading the driver
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driver/chromedriver.exe");
            ChromeOptions options = new ChromeOptions();		
    		options.addArguments("--remote-allow-origins=*");
    		//creating object for chrome driver 
    	     driver = new ChromeDriver(options);
    	    driver.navigate().to(prop.getProperty("url"));
           driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
           driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
           driver.manage().deleteAllCookies();
        }

	 }
}
