package practice_FW;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class searchprogram {

	public static void main(String[] args) throws Exception {
		
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		FileInputStream fis = new FileInputStream("C:\\Users\\avina\\Desktop\\Search2.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("sheet1");
		for(int i=1;i<=sheet.getLastRowNum();i++)
		{
			XSSFRow row = sheet.getRow(i);
			XSSFCell s = row.getCell(0);
			w.get("https://www.google.co.in/");
			Thread.sleep(2000);
			w.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys(s.toString());
			Thread.sleep(2000);
			w.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).submit();
			Thread.sleep(2000);
			
		}
		w.manage().window().minimize();
	}

}
