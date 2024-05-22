package flipkart.flipkart;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class DataProviderExcel {
	
	@Test(dataProvider="getData1")
	public void test(Map <String,String> map)
	{
		System.out.println(map.get("username"));
		System.out.println(map.get("pwd"));
		
	}
	
	@DataProvider
	public Object[] getData1() throws IOException
	{
		FileInputStream fs = new FileInputStream("E:\\Selenium_Projects\\flipkart\\sample.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		
		int rowNum = sheet.getLastRowNum();
		int colNum = sheet.getRow(0).getLastCellNum();
	
		Map<String,String> map;
		
		Object[] data = new Object[rowNum];
		
		for(int i=1;i<=rowNum;i++)
		{
			map = new HashMap<>();
			
			for(int j=0;j<colNum;j++)
			{
				String key = sheet.getRow(0).getCell(j).getStringCellValue();
				String value = sheet.getRow(i).getCell(j).getStringCellValue();
				map.put(key, value);
				data[i-1] = map;
			}
		}
		
		return data;
		
	}
	
	
	
	@DataProvider
	public Object[][] getData() throws IOException
	{
		FileInputStream fs = new FileInputStream("E:\\Selenium_Projects\\flipkart\\sample.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		
		int rowNum = sheet.getLastRowNum();
		int colNum = sheet.getRow(0).getLastCellNum();
		//System.out.println(colNum);
		
		Object[][] data = new Object[rowNum][colNum];
		
		for(int i=1;i<=rowNum;i++)
		{
			for(int j=0;j<colNum;j++)
			{
				data[i-1][j]= sheet.getRow(i).getCell(j).getStringCellValue();
			}
		}
		
		return data;
		
	}
}
