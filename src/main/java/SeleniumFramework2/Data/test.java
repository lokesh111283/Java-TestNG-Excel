package SeleniumFramework2.Data;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class test {

	public static void main(String[] args) throws IOException {
		FileInputStream fis;
		XSSFWorkbook workbook;
		XSSFSheet sheet;
		XSSFRow row;
		XSSFCell cell;
		String urlname;
		
		
		// TODO Auto-generated method stub
		System.out.println("I cam here in getexcel");
		fis=new FileInputStream("E:\\html2\\test1.xlsx");
		workbook=new XSSFWorkbook(fis);
		sheet =workbook.getSheet("LoginInfo");
		String[][] exceldatainfo =null;
		int rowcount=sheet.getLastRowNum();
		int colcount=sheet.getRow(0).getLastCellNum();
		System.out.println(rowcount);
		System.out.println(colcount);
		exceldatainfo = new String[rowcount][colcount];
		for(int i=1;i<=rowcount;i++) {
			for(int j=0;j<1;j++) {
				
				exceldatainfo[i-1][j]=sheet.getRow(i).getCell(0).getStringCellValue();
				exceldatainfo[i-1][j+1]=sheet.getRow(i).getCell(1).getStringCellValue();
			}
			
			System.out.println(exceldatainfo[0][0]);
			System.out.println(exceldatainfo[0][1]);

	}

}
}
