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

public class flipkartdatadriven {

	public static void main(String[] args) throws Exception {
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		FileInputStream fis = new FileInputStream("C:\\Users\\avina\\Desktop\\Flipkart.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("search");
		for(int i=1;i<=sheet.getLastRowNum();i++)
		{
			XSSFRow row = sheet.getRow(i);
			XSSFCell c = row.getCell(0);
			w.get("https://www.flipkart.com/");
			Thread.sleep(1000);
			w.findElement(By.name("q")).sendKeys(c.toString());
			Thread.sleep(1000);
			w.findElement(By.name("q")).submit();
		}

	}

}
