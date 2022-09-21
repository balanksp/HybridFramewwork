package org.Actime.GenericUtilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * notes :-
 *FileUtility is used to get the data from .properties file 
 * @author BALA
 *
 */

public class Property_File_Utility {

	/**
	 * This method is used to initialize Property file
	 * 
	 * @throws IOException---to declare exceptions that can occur during the
	 *                          execution of a program
	 * 
	 */

	Properties property;

	public String intialisationPropertyFiles(String propertyFilepath) throws IOException {
		FileInputStream fis = new FileInputStream(propertyFilepath);
		 property = new Properties();
		property.load(fis);
		return propertyFilepath;

	}

	/**
	 * this method is used to get data from properties file
	 * 
	 */
	public String getDataFromPropertyFile(String key) {

		 return property.getProperty(key).trim();
		

	}

}
