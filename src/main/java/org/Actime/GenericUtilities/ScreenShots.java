package org.Actime.GenericUtilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShots {

	/**
	 * this method is used to take screen shot for failed test cases and save on the designation place
	 * 
	 */

	public void takeScreenShot(WebDriver driver) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(AutoConstant_IConstant.PHOTOS_PATH+"jpg");
		
		try {
			FileUtils.copyDirectory(src, destination);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
