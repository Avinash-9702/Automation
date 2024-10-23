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

public class jForceFinal {

	public static void main(String[] args) throws Exception {
		WebDriver w = new ChromeDriver();
		w.manage().window().maximize();
		FileInputStream fis = new FileInputStream("C:\\Users\\avina\\Downloads\\jForceFinal.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		Thread.sleep(3000);


		for(int i=1;i<=4;i++) { // column
			w.get("https://magento.softwaretestingboard.com/");
			Thread.sleep(2000);
			w.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[3]/a")).click();
			Thread.sleep(1000);
			for (int j = 0; j <= sheet.getLastRowNum(); j++) {  // row
				XSSFRow row = sheet.getRow(j);	

				{
					switch (j) {
					case 0:
						XSSFCell fname = row.getCell(i);
						w.findElement(By.id("firstname")).sendKeys(fname.toString());
						Thread.sleep(1000);
						break;
					case 1 :	
						XSSFCell lname = row.getCell(i);
						w.findElement(By.id("lastname")).sendKeys(lname.toString());
						Thread.sleep(1000);
						break;
					case 2 : 
						XSSFCell email = row.getCell(i);
						w.findElement(By.id("email_address")).sendKeys(email.toString());
						Thread.sleep(1000);
						break;
					case 3 : 
						XSSFCell pass1 = row.getCell(i);
						w.findElement(By.id("password")).sendKeys(pass1.toString());
						Thread.sleep(1000);
						break;
					case 4 : 
						XSSFCell pass2 = row.getCell(i);
						w.findElement(By.id("password-confirmation")).sendKeys(pass2.toString());
						Thread.sleep(1000);
						break;						
					default:
						break;
					}
				}
			}
			w.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button/span")).click();
			Thread.sleep(1000);

			w.findElement(By.cssSelector("button[data-action=\"customer-menu-toggle\"]")).click();
			Thread.sleep(1000);
			w.findElement(By.partialLinkText("Sign Out")).click();
			Thread.sleep(1000);
		}
		w.close();
	}

}
