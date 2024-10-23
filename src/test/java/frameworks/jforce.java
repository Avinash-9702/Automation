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

public class jforce {

	public static void main(String[] args) throws Exception {
			WebDriver w = new ChromeDriver();
			w.manage().window().maximize();
			FileInputStream fis = new FileInputStream("C:\\Users\\avina\\Desktop\\jforce.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheet("create");
			w.get("https://magento.softwaretestingboard.com/");
			Thread.sleep(2000);
			w.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[3]/a")).click();
			for(int i=0;i<=sheet.getLastRowNum();i++)
			{
				XSSFRow row = sheet.getRow(i);
				XSSFCell fname = row.getCell(0);
				XSSFCell lname = row.getCell(1);
				XSSFCell email = row.getCell(2);
				XSSFCell pass1 = row.getCell(3);
				XSSFCell pass2 = row.getCell(4);	
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
			Thread.sleep(3000);
			w.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a")).click();
			Thread.sleep(1000);
			w.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a")).click();
			Thread.sleep(1000);
			w.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a")).click();
			Thread.sleep(1000);
			w.findElement(By.id("email")).sendKeys("jwick7410@gmail.com");
			Thread.sleep(1000);
			w.findElement(By.id("pass")).sendKeys("Jwick@1998");
			Thread.sleep(1000);
			w.findElement(By.id("search")).sendKeys("shirt");
			Thread.sleep(1000);
			w.findElement(By.id("search")).click();
			Thread.sleep(1000);
			w.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[2]/div[2]/ol/li[3]/div/div/strong/a")).click();
			w.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]/span")).click();
			Thread.sleep(1000);
			w.findElement(By.xpath("//*[@id=\"option-label-size-143-item-168\"]")).click();
			Thread.sleep(1000);
			w.findElement(By.xpath("//*[@id=\"option-label-color-93-item-53\"]")).click();
			Thread.sleep(1000);
			w.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]/span")).click();
			Thread.sleep(1000);
			w.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[1]/a")).click();
			Thread.sleep(1000);
			w.findElement(By.id("top-cart-btn-checkout")).click();
			Thread.sleep(1000);
			w.findElement(By.xpath("//*[@id=\"RFEN43S\"]")).sendKeys("Santa monica california");
			Thread.sleep(1000);
			w.findElement(By.xpath("//*[@id=\"W62XW3M\"]")).sendKeys("California");
			Thread.sleep(1000);
			w.findElement(By.xpath("//*[@id=\"IB71QMB\"]")).click();
			Thread.sleep(5000);
			w.findElement(By.xpath("//*[@id=\"TG4RX4L\"]")).sendKeys("94203");
			Thread.sleep(1000);
			w.findElement(By.xpath("//*[@id=\"V9JGEBN\"]")).sendKeys("8107541254");
			Thread.sleep(1000);
			w.findElement(By.xpath("//*[@id=\"checkout-shipping-method-load\"]/table/tbody/tr[1]/td[1]/input")).click();
			Thread.sleep(1000);
			w.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button/span")).click();
			Thread.sleep(1000);
	}

}
