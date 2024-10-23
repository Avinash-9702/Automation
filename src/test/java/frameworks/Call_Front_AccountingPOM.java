package frameworks;

import java.awt.Window;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Call_Front_AccountingPOM {

	public static void main(String[] args) throws Exception {
		
		WebDriver d = new ChromeDriver();
		
		FrontAccountingPOMwithPageFactory r = new FrontAccountingPOMwithPageFactory(d);
		d.manage().window().maximize();
		d.get("http://demo.frontaccounting.eu/index.php");
		r.clear();
		r.login();
		r.Sales_Quotation_Entry();
		r.Sales_Order_Entry();
		r.logout();
		d.manage().window().minimize();

	}

}