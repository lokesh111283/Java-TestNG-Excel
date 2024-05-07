package SeleniumFramework2.Data;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelMain {
	FileInputStream fis;
	XSSFWorkbook workbook;

	public XSSFWorkbook  StartExcel(FileInputStream fis) throws IOException{
		workbook=new XSSFWorkbook(fis);
		return workbook;
	}
	
	public void EndExcel(FileInputStream fis,XSSFWorkbook workbook) throws IOException {
		workbook.close();
		fis.close();
	}
		
}
