package frameworks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo_DataDriven {

	public static void main(String[] args) throws Exception {
		WebDriver w = new ChromeDriver();
		FileInputStream fis = new FileInputStream("C:\\Users\\avina\\Desktop\\sd.xlsx");
		XSSFWorkbook work = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = work.getSheet("Sheet1");
		for(int i=1;i<=sheet1.getLastRowNum();i++)
		{
			XSSFRow row = sheet1.getRow(i);
			XSSFCell user = row.getCell(0);
			XSSFCell pass = row.getCell(1);
			w.get("https://www.saucedemo.com/v1/");
			Thread.sleep(2000);
			w.findElement(By.id("user-name")).sendKeys(user.toString());
			Thread.sleep(2000);
			w.findElement(By.id("password")).sendKeys(pass.toString());
			Thread.sleep(2000);
			w.findElement(By.id("login-button")).click();
			Thread.sleep(2000);
			try {
				w.findElement(By.xpath("//*[@id=\"menu_button_container\"]/div/div[3]/div/button")).click();
				Thread.sleep(2000);
				w.findElement(By.id("logout_sidebar_link")).click();
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		Thread.sleep(2000);
	}



		

	}