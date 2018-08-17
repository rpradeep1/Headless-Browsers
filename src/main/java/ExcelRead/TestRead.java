package ExcelRead;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class TestRead {
	
	@Test
	public void TestReadData(){	

	File src=new File("H:/Automation POC/TestData/TestData.xls");

	try {

	Workbook wb=Workbook.getWorkbook(src);
	Sheet sh1= wb.getSheet(0);
	Cell c1=sh1.getCell(0,1);
	Cell c2=sh1.getCell(0,2);
	String data1=c1.getContents();	
	String data2 = c2.getContents();
	System.out.println(data1 + "-->" + data2);
	System.out.println("Sheet data is "+data1 + "-->" + data2);

	}
	
	catch (BiffException e)
	{
	e.printStackTrace();

	} 
	
	catch (IOException e) 
	{
	e.printStackTrace();
	}
	



}
	
}

