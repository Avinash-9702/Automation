package practice_FW;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FrontAccountingCalling {

	public static void main(String[] args) throws Exception {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setPlatform(Platform.WIN11);
		dc.setBrowserName("Microsoft");
		
		RemoteWebDriver w = new RemoteWebDriver(dc);
		
		
		FrontAccountingRepo far = new FrontAccountingRepo(w);
		w.get("https://demo.frontaccounting.eu/");
		FileInputStream fis = new FileInputStream("C:\\Users\\avina\\Desktop\\FrontAccountData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = workbook.getSheet("Sheet1");
		XSSFSheet sheet2 = workbook.getSheet("Sheet2");
		for(int i =1; i<=sheet1.getLastRowNum();i++) {
			XSSFRow row = sheet1.getRow(i);
			XSSFCell username = row.getCell(0);
			XSSFCell password = row.getCell(1);
			for(int j =1; j<=sheet2.getLastRowNum();j++) {
				XSSFRow row2 = sheet2.getRow(j);
				XSSFCell teststep = row2.getCell(0);
				try {
					switch (teststep.toString()) {
					case "login":
						far.login(username.toString(), password.toString());		
						break;
					case "logout":
						far.logout();
						break;
					default:
						System.out.println("invalid");
						break;
					}
				}catch (Exception e) {
					TakesScreenshot tss = (TakesScreenshot)w;
					FileHandler.copy(tss.getScreenshotAs(OutputType.FILE), 
							new File("C:\\Users\\avina\\Desktop"+username.toString()+".png"));
				}
			}
			
			
		}
		w.close();
	}
	

}
