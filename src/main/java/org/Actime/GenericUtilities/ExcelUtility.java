package org.Actime.GenericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Formatter;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * notes : -
 *As per the rule of automation, data should not be hardcoded with in the test scripts, so that to get the data from external file like Excel 
 * We go for ExcelUtility class is developed using apache Poi libraries, which is used to read the data from Excel 
 * @author BALA
 *
 */
public class ExcelUtility {

	/**
	 * using this method for intialization the workbook
	 * @throws IOException 
	 * @throws EncryptedDocumentException 
	 * 
	 * 
	 */
	Workbook workbook;
	public String intialisationExcel(String excelpath) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
		 workbook = WorkbookFactory.create(fis);
    	
		return null;
	}
	/**
	 * using this method for fetch the data from the excel workbook
	 * @param sheetname
	 * @param rowNumber
	 * @param colNumber
	 * @return
	 */
	public String getDataFromExcel(String sheetname,int rowNumber , int colNumber)
	{
		Sheet sheet = workbook.getSheet(sheetname);
	String value = new DataFormatter( ).formatCellValue(sheet.getRow(rowNumber).getCell(colNumber));
	return value;
	
	}
	/**
	 * 
	 * this method used to write the data in the excel 
	 * @param excelpath
	 * @param sheetname
	 * @param rowNumber
	 * @param cellnumber
	 * @param value
	 * @return
	 */
	public String writetoexcel (String excelpath,String sheetname,int rowNumber,int cellnumber,String value)
	
	{
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(excelpath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.getRow(rowNumber);
		Cell cell = row.createCell(cellnumber);
		cell.setCellValue(value);

		try {
			workbook.write(fos);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}
	/**
	 * this method is used to to close the workbook 
	 * 
	 */
	public void closeExcelWorkbook()
	{
		try {
			workbook.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
}

