package frameworks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDataDriven {

	public static void main(String[] args) throws Exception {
		
		WebDriver w = new ChromeDriver();
		FileInputStream fis = new FileInputStream("C:\\Users\\avina\\Desktop\\SearchData.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet xs=wb.getSheet("google");
		for(int i=1;i<=xs.getLastRowNum();i++)
		{
			XSSFRow xr=xs.getRow(i);
			XSSFCell xc=xr.getCell(0);
			Thread.sleep(2000);
			w.get("https://www.google.co.in/");
			Thread.sleep(2000);
			w.findElement(By.name("q")).sendKeys(xc.toString());
			Thread.sleep(2000);
			w.findElement(By.name("q")).click();
			
			
		}
		

	}

}
