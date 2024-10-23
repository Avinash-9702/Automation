package practice_FW;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FrontAccountingRepo {
	
	public FrontAccountingRepo(WebDriver wd) {
		
		PageFactory.initElements(wd,this);
	}

	@FindBy(name ="user_name_entry_field" ) private WebElement username;
	@FindBy(name ="password")private WebElement password;
	@FindBy(name ="SubmitUser")private WebElement loginBtn;
	@FindBy(linkText = "Logout")private WebElement logoutBtn;
	@FindBy(linkText = "Click here to Login Again.")private WebElement completeLogout;
	
	public void login(String user,String pass) throws Exception {
		username.clear();
		username.sendKeys(user);
		password.clear();
		password.sendKeys(pass);
		loginBtn.click();
		Thread.sleep(2000);
	}
	
	public void logout() {
		logoutBtn.click();
		completeLogout.click();
	}
	
	
}
