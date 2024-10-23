package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomizationReport {
	
	public void TestDemo() {
		WebDriver w = new ChromeDriver();
		Reporter.log("Chrome has been Launched");
		w.get("");
		
		
	}
	

}
