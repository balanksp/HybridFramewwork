package Pratice;

import java.io.IOException;

import org.Actime.GenericUtilities.AutoConstant_IConstant;
import org.Actime.GenericUtilities.DataType;
import org.Actime.GenericUtilities.JavaScriptUtility;
import org.Actime.GenericUtilities.JavaUtiltity;
import org.Actime.GenericUtilities.Property_File_Utility;
import org.Actime.GenericUtilities.WebdriverUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Testing {

	public static void main(String[] args) throws IOException 
	{
		WebDriver	driver ;
		WebdriverUtility wd= new WebdriverUtility();
		Property_File_Utility pu = new Property_File_Utility();
		JavaUtiltity ju  =   new JavaUtiltity ();
		JavaScriptUtility jsu = new JavaScriptUtility();
		
		
		pu.intialisationPropertyFiles(AutoConstant_IConstant.PROPERTY_PATH);

		String actUrl = pu.getDataFromPropertyFile("url");
		String browsers = pu.getDataFromPropertyFile("browser");

		String timeout = pu.getDataFromPropertyFile("timeout");
		long timeouts = (long) ju.ConertStringtoAnydata(timeout, DataType.LONG);
		driver = wd.OpenApplicationAndBrowser(browsers, timeouts, actUrl);
		
		jsu.intialisationJS(driver);
		    
		  String username = pu.getDataFromPropertyFile("Username");
		  
		   String password = pu.getDataFromPropertyFile("Password");
		   
		             
		
		  jsu.sendKeysusingjs(driver.findElement(By.xpath("//input[@id='username']")), username);
		
		  jsu.sendKeysusingjs(driver.findElement(By.xpath("//input[@name='pwd']")), password);
		  
		  jsu.clickmethodByjs(driver.findElement(By.xpath("//div[text()='Login ']")));// click the login btn
		  
		  jsu.clickmethodByjs(driver.findElement(By.xpath("//div[@id='container_users']")));// click user icon
		  
		  
		  
		  
		  
		  
		  
		  
	}

}
