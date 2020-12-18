package utils;

public class Exceldataprovider {
	
	public static void main(String[] args) {
		String projectpath=System.getProperty("user.dir");
		testData(projectpath+"\\excel\\data.xlsx", "Sheet1");
	}
	
	public static void testData(String excelpath, String sheetname)
	{
		ExcelUtils excel=new ExcelUtils(excelpath, sheetname);
		
		int rowcount=excel.getrowcount();
		int colcount=excel.getcolcount();
		
		for(int i=1;i<rowcount;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				String cellData=excel.getcelldataString(i, j);
				System.out.println(cellData);
			}
		}
	}

}
