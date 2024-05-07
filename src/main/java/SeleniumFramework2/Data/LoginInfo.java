package SeleniumFramework2.Data;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginInfo {
	
	WebDriver driver;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	String urlname;
	String browserName;
	
	public LoginInfo(WebDriver driver,XSSFWorkbook workbook)
	{
		//initialization
		this.driver=driver;
		PageFactory.initElements(driver, this);
		this.workbook=workbook;
	}
	
	@FindBy(id = "userEmail")
	WebElement username;
	
	
	
	@FindBy(id="userPassword")
	WebElement pwd;
	
	@FindBy(id="login")
	WebElement login_web;
	

	public void Login(String user_name,String user_pwd) throws IOException {
		System.out.println("I came hereee in login");	
		System.out.println(user_name+"anddddddddddd"+user_pwd);
		username.sendKeys(user_name);
		pwd.sendKeys(user_pwd);
		login_web.click();
		//username.sendKeys("kumar@abcd.com");
		//pwd.sendKeys("Lokesh123");
		//login_web.click();
		//sign_out.click();
		System.out.println("I have ended");
	}
	

}
