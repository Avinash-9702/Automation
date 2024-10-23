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

public class jForce {

	public static void main(String[] args) throws Exception {
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		FileInputStream fis = new FileInputStream("C:\\Users\\avina\\Desktop\\jforce.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("create");
		
		for(int i=0;i<=sheet.getLastRowNum();i++)
		{
			XSSFRow row = sheet.getRow(i);
			XSSFCell fname = row.getCell(0);
			XSSFCell lname = row.getCell(1);
			XSSFCell email = row.getCell(2);
			XSSFCell pass1 = row.getCell(3);
			XSSFCell pass2 = row.getCell(4);
			w.get("https://magento.softwaretestingboard.com/");
			Thread.sleep(2000);
			w.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[3]/a")).click();
			Thread.sleep(1000);
			w.findElement(By.id("firstname")).sendKeys(fname.toString());
			Thread.sleep(1000);
			w.findElement(By.id("lastname")).sendKeys(lname.toString());
			Thread.sleep(1000);
			w.findElement(By.id("email_address")).sendKeys(email.toString());
			Thread.sleep(1000);
			w.findElement(By.id("password")).sendKeys(pass1.toString());
			Thread.sleep(1000);
			w.findElement(By.id("password-confirmation")).sendKeys(pass2.toString());
			Thread.sleep(1000);
			w.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button/span")).click();
			Thread.sleep(1000);
		}

	}

}
