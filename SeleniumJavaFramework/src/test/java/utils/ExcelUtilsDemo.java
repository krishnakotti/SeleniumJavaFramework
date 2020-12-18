package utils;

public class ExcelUtilsDemo {

	public static void main(String[] args) {
		
		String projectpath=System.getProperty("user.dir");
		ExcelUtils excel=new ExcelUtils(projectpath+"\\excel\\data.xlsx", "Sheet1");
		
		excel.getrowcount();
		excel.getcelldataString(0, 0);
		excel.getcelldataString(0, 1);
		excel.getcelldataString(1, 0);
		excel.getcelldatanumber(1, 1);
		

	}
}
