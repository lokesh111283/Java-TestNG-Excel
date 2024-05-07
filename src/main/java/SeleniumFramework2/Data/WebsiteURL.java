package SeleniumFramework2.Data;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class WebsiteURL {
	
	WebDriver driver;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	String urlname;
	String browserName;
	
	public WebsiteURL(XSSFWorkbook workbook) {
		this.workbook=workbook;
	}
	
	public String WebsiteURLLoad() throws IOException {
		sheet=workbook.getSheet("URLname");
		System.out.println(sheet);
		row=sheet.getRow(0);
		cell=row.getCell(1);
		urlname=cell.getStringCellValue();
		System.out.println("My value is "+urlname);
		return urlname;
}

}
