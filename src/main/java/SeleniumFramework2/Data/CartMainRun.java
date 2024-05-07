package SeleniumFramework2.Data;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class CartMainRun {
	
	public WebDriver driver;
	FileInputStream fis;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	String urlname;
	String browserName;
	
	@BeforeClass
	public void PreRun() throws IOException {
		System.out.println("I am in cart2");
		fis=new FileInputStream("E:\\html2\\test1.xlsx");
		ExcelMain em=new ExcelMain();
		workbook=em.StartExcel(fis);
		System.out.println("I came till fis");
		DriverInfo di=new DriverInfo(workbook);
		driver=di.initializeDriver();
		WebsiteURL web=new WebsiteURL(workbook);
		String urlname=web.WebsiteURLLoad();
		System.out.println(urlname);
		driver.get(urlname);
		
	}
	
	@Test(dataProvider ="cartlogin", dataProviderClass = LoginDataFetch.class)
	public void CartMainRun(String username,String userpwd) throws IOException, InterruptedException {		
		LoginInfo lg=new LoginInfo(driver,workbook);
		lg.Login(username,userpwd);
		Thread.sleep(5000);
		//em.EndExcel(fis, workbook);
		LogoutInfo lgout=new LogoutInfo(driver);
		lgout.logout();
	}
		
}
