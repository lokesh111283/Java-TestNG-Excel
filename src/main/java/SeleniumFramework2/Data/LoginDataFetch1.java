package SeleniumFramework2.Data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.helpers.XSSFRowShifter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

public class LoginDataFetch1 extends ExcelMain {
	
	public static void main(String args[]) throws IOException {
		
		FileInputStream fis;
		XSSFWorkbook workbook;
		XSSFSheet sheet;
		XSSFRow row;
		XSSFRow row2;
		XSSFCell cell;
		String urlname;
		
		//Create an object of File class to open xls file
		File file=new File("E:\\html2\\file1.xlsx");
		
		//Create an object of FileInputStream class to read excel file
		fis=new FileInputStream(file);
		
		//Create an object of FileInputStream class to read excel file
		workbook =new XSSFWorkbook(fis);
		
		//creating a Sheet object
		sheet=workbook.getSheet("SeleniumSheet");
		
		//create a new row
		row =sheet.getRow(0);
		
		//set the value in 1st column
		row.createCell(0).setCellValue("hiiiiiiii");
		
		//create a new row
		row2 =sheet.getRow(1);
				
		//set the value in 1st column
		row2.createCell(0).setCellValue("hellooooooooooo");
		
		System.out.println("i came to end");
		
		// Write the data back in the Excel file
		FileOutputStream fos=new FileOutputStream(file);
		workbook.write(fos);
		
		workbook.close();
		fos.close();
		fis.close();
		
	}		
	
}
