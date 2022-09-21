package org.Actime.GenericUtilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtility {
	JavascriptExecutor js;

	/**
	 * this method is intialisation the JavaScriptExcecutor
	 * 
	 * 
	 */
	public void intialisationJS(WebDriver driver) {
		js = (JavascriptExecutor) driver;
	}

	/**
	 * this method is used to open app by give the url
	 * 
	 * @param url
	 */
	public void openApplicationusingjs(String url) {

		js.executeScript("window.location=arguments[0]", url);
	}

	/**
	 * this method give the inputs to element by js
	 * 
	 * @param element
	 * @param data
	 * 
	 */

	public void sendKeysusingjs(WebElement element, String data) {
		js.executeScript("arguments[0].value=arguments[1]", element, data);
	}

	/**
	 * this method is used to click the element
	 * 
	 * @param element
	 * 
	 */
	public void clickmethodByjs(WebElement element) {
		js.executeScript("arguments[0].click()", element);
	}

	/**
	 * this method is used to scroll upto the given element
	 * 
	 * @param element
	 * 
	 */
	public void scrolltillElement(WebElement element) {
		js.executeScript("arguments[0].scrollIntoVeiw()", element);
	}

}
