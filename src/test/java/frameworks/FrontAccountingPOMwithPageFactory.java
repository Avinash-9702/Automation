package frameworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//Call_Front_Accounting is child program
public class FrontAccountingPOMwithPageFactory {
	WebDriver w;
	
	public FrontAccountingPOMwithPageFactory(WebDriver wd)
	{ 
		w= wd;
		PageFactory.initElements(wd, this);
	}
	
	@FindBy(name ="user_name_entry_field") WebElement u_name;
	@FindBy(name ="password") WebElement pass;
	@FindBy(xpath = "//*[@id=\"_page_body\"]/form/center[2]/input") WebElement login;
	@FindBy(linkText = "Sales Quotation Entry") WebElement link1;
	@FindBy(id = "CancelOrder") WebElement cancel1;
	@FindBy(linkText = "Back") WebElement back1;
	@FindBy(linkText = "Sales Order Entry") WebElement link2;
	@FindBy(id ="CancelOrder") WebElement cancel2;
	@FindBy(linkText = "Logout") WebElement logout;
	public void clear() throws Exception
	{
		u_name.clear();
		Thread.sleep(1000);
		pass.clear();
		Thread.sleep(1000);
	}
	public void login() throws Exception
	{
		u_name.sendKeys("demouser");
		Thread.sleep(1000);
		pass.sendKeys("password");
		Thread.sleep(1000);
		login.click();
	}
	public void Sales_Quotation_Entry() throws Exception
	{
		link1.click();
		Thread.sleep(1000);
		cancel1.click();
		OkbuttonInalert();
		Thread.sleep(1000);
		back1.click();
		Thread.sleep(1000);
	}
	
	public void OkbuttonInalert() throws Exception
	{
		w.switchTo().alert().accept();
		Thread.sleep(1000);
	}
	
	public void Sales_Order_Entry() throws Exception
	{
		link2.click();
		Thread.sleep(1000);
		cancel2.click();
		Thread.sleep(1000);
		OkbuttonInalert();
		Thread.sleep(1000);
	}
	public void logout() throws Exception
	{
		logout.click();
		Thread.sleep(1000);
	}
	
}