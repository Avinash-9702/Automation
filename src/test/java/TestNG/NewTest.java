package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  WebDriver w = new ChromeDriver();
	  w.get("https://demo.frontaccounting.eu/");
		
		w.findElement(By.name("user_name_entry_field")).clear();
		w.findElement(By.name("user_name_entry_field")).sendKeys("demouser");
		
		w.findElement(By.name("password")).clear();
		w.findElement(By.name("password")).sendKeys("password");
		
		w.findElement(By.name("SubmitUser")).click();
	  
  }
}
