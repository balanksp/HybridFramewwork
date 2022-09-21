package org.Actime.GenericUtilities;  // some changes had in the code 

import java.util.Random;

/**
 * notes : - 
 * Java Utility is one class in generic component, which contain java specific methods which can be used across the test Scripts / Application 
 * like methods getRandowmNumbers( ),getSystemDate()
 * @author BALA
 *
 */
    

public class JavaUtiltity {

	/**
	 * this method is uaes to genrate random numbers
	 * 
	 * @param limit
	 * 
	 * 
	 */
	public int getRandowmNumbers(int limit) {
		return new Random().nextInt(limit);
	}

	/**
	 * this method is used to convert data from String to any data
	 * 
	 * @param strategy
	 * @param data
	 */
	

	public Object ConertStringtoAnydata(String data, DataType strategy) {
		Object obj = null;
		if (strategy.toString().equalsIgnoreCase("long")) {
			obj = Long.parseLong(data);
		} else if (strategy.toString().equalsIgnoreCase("int")) {
			obj = Integer.parseInt(data);
		}
		return obj;
	}

	
	
	
	
	
	
}
