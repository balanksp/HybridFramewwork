package org.Actime.GenericUtilities;

public interface AutoConstant_IConstant 
{
// It’s an Interface where contains all the common data which can be used across the Framework
	
	String PROJECT_PATH = System.getProperty("user.dir");
	String EXCEL_PATH = PROJECT_PATH + "/src/test/resources/testData.xlsx";
	String PROPERTY_PATH = PROJECT_PATH +"/src/test/resources/Data.properties";
	String JDBC_USERNAME = "root";
	String JDBC_PASSWORD = "root";
	String DB_URL = "jdbc:mysql://localhost:3306/tyss";
    int IMPLICITY_TIMEOUTS =10;
	int EXPLICITY_TIMEOUTS = 10;
	String PHOTOS_PATH= PROJECT_PATH +"/src/test/resources/Photos";
	
	
	
	
}
