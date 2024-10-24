package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomizationReport {
	
	public void TestDemo() {
		WebDriver w = new ChromeDriver();
		Reporter.log("Chrome has been Launched");
		w.get("https://demo.frontaccounting.eu/");
		
		w.findElement(By.name("user_name_entry_field")).clear();
		w.findElement(By.name("user_name_entry_field")).sendKeys("demouser");
		
		w.findElement(By.name("password")).clear();
		w.findElement(By.name("password")).sendKeys("password");
		
		w.findElement(By.name("SubmitUser")).click();
		
		
	}
	

}
