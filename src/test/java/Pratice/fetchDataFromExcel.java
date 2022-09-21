package Pratice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class fetchDataFromExcel
{

	
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{

		/***
		 * using row value and cell value to read the data
		 * @param args
		 * @throws EncryptedDocumentException
		 * @throws IOException
		 */
		
//		FileInputStream fis = new FileInputStream("./src/test/resources/testData.xlsx");
//		Workbook workbook = WorkbookFactory.create(fis);
//    	Sheet sheet = workbook.getSheet("Demo");
//		String rowcolco_ord = sheet.getRow(7).getCell(2).getStringCellValue();
//		System.out.println(rowcolco_ord);
//        workbook.close();  
		
		/**
		 * insert data in the newly created cell and save the data 
		 */
/*		FileInputStream fis = new FileInputStream("./src/test/resources/testData.xlsx");
     	Workbook workbook = WorkbookFactory.create(fis);
    	Sheet sheet = workbook.getSheet("Demo");
    	Cell cell = sheet.createRow(10).createCell(1);
    	cell.setCellValue("indian");
    	FileOutputStream fos = new FileOutputStream("./src/test/resources/testData.xlsx");
    	workbook.write(fos);
 */	    	
    	/**
    	 * get all the data in the sheet by using for loop
    	 * 
    	 */
    	
/*		Workbook workbooK = WorkbookFactory.create(new FileInputStream("./src/test/resources/testData.xlsx"));
		Sheet sheet = workbooK.getSheet("Sheet1");
		DataFormatter df = new DataFormatter();
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int j = 0; j < sheet.getRow(i).getLastCellNum(); j++) {
				System.out.print(df.formatCellValue(sheet.getRow(i).getCell(j)) + "  ");
			}
			System.out.println();
		}
		System.out.println();
*/		
		
		
		// map and list is had pending titles
		
		
		
			
		
		
		
		
		
		
		
		
		
		
    	
    	
			}

}	
