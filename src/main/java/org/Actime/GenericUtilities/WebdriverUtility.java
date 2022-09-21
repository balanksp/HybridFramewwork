package org.Actime.GenericUtilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverUtility {
	/**
	 * notes :- 
	 * WebdriverUtility  is a Generic class , which contains webdriver specific reusable actions like
	 * click,mousehover,dropdown 
	 * 
	 */
	
	
	/**
	 * this method is used to launch the corresponding browser
	 * 
	 * 
	 */
	WebDriver driver;
	public WebDriver launchBrowser (String Browser)
	{
		switch (Browser)
		{
		case "chrome":  WebDriverManager.chromedriver().setup();
			             driver = new ChromeDriver();    
		             	 break;
		case "firefox": WebDriverManager.firefoxdriver().setup();
                         driver = new FirefoxDriver();    
                         break;
		case "ie":      WebDriverManager.iedriver().setup();
        				 driver = new InternetExplorerDriver();    
                         break;   
                    
		default:
			break;
		}
		return driver;
	}
	
	/**
	 * this method is used to maximize the browser
	 * 
	 * 
	 */
	public void maximizebrowser()
	{
		driver.manage().window().maximize();
	}
	
	/**
	 * this method used to wait till loading page and get the all element 
	 * 
	 * 
	 */
	public void getpageLoadtimeOut (long longtimeunit)
	{
		driver.manage().timeouts().implicitlyWait((longtimeunit), TimeUnit.SECONDS);
	}
	
	/**
	 * method used to navigate to application using given url
	 * 
	 */
	
	public void NavigateToApplication(String url)
	{
		driver.get(url);
	}
	
	/**
	 * 
	 * this method is used to open the application & browser
	 * @param maximizebrowser 
	 */
	
	public WebDriver OpenApplicationAndBrowser (String Browser,long longtimeunit,String url )
	{
		launchBrowser(Browser);
		maximizebrowser();
		getpageLoadtimeOut(longtimeunit);
		NavigateToApplication(url);
		return driver;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

