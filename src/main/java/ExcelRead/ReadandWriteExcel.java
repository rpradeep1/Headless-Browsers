package ExcelRead;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadandWriteExcel {
	
	public static void main(String []args){
		
		try {
		
			File src=new File("H:/Automation POC/TestData/TestData1.xlsx");	
		    FileInputStream fis=new FileInputStream(src);
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sh1= wb.getSheetAt(0);			
			System.out.println(sh1.getRow(0).getCell(0).getStringCellValue());	
			System.out.println(sh1.getRow(0).getCell(1).getStringCellValue());	
			System.out.println(sh1.getRow(1).getCell(0).getStringCellValue());	
			System.out.println(sh1.getRow(1).getCell(1).getStringCellValue());	
			System.out.println(sh1.getRow(2).getCell(0).getStringCellValue());	
			System.out.println(sh1.getRow(2).getCell(1).getStringCellValue());
		
		}
		
		catch (Exception e) {

			System.out.println(e.getMessage());
			
		}
		
		
	}
	
}

	
	
			
		
		
		



