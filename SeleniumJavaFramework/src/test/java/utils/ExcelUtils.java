package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	

	public ExcelUtils(String excelpath, String sheetname) {
		// TODO Auto-generated constructor stub
		try {
			workbook = new XSSFWorkbook(excelpath);
			sheet=workbook.getSheet(sheetname);

		} catch (IOException exp) {
			System.out.println("Message is: "+exp.getMessage());
			System.out.println("Cause is: "+exp.getCause());
			exp.printStackTrace();
		}
	}

	public static void main(String[] args) {
		getrowcount();
		getcelldataString(0, 0);
		getcelldatanumber(1, 1);
		
	}
	public static int getrowcount()
	{

		int rowcount=0;
		try {
			
			rowcount=sheet.getPhysicalNumberOfRows();
			System.out.println("No.of rows: "+rowcount);

		} catch (Exception exp) {
			System.out.println("Message is: "+exp.getMessage());
			System.out.println("Cause is: "+exp.getCause());
			exp.printStackTrace();
		}
		return rowcount;
	}

	public static int getcolcount()
	{

		int colcount=0;
		try {
			
			colcount=sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("No.of rows: "+colcount);

		} catch (Exception exp) {
			System.out.println("Message is: "+exp.getMessage());
			System.out.println("Cause is: "+exp.getCause());
			exp.printStackTrace();
		}
		return colcount;
	}

	
	public static String  getcelldataString(int rowNum,int colNum)
	{
		String celldata=null;
		try {
			
			celldata=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			//System.out.println(celldata);

		} catch (Exception exp) {
			System.out.println("Message is: "+exp.getMessage());
			System.out.println("Cause is: "+exp.getCause());
			exp.printStackTrace();
		}
		return celldata;
	}
	
	public static void getcelldatanumber(int rowNum,int colNum)
	{
		try {
			double cellcount=sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			//System.out.println(cellcount);

		} catch (Exception exp) {
			System.out.println("Message is: "+exp.getMessage());
			System.out.println("Cause is: "+exp.getCause());
			exp.printStackTrace();
		}
	}

	

}
