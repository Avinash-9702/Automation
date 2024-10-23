package practice_FW;



import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class VariabledDemo {

	public static void main(String[] args) throws Exception {
		WebDriver w = new ChromeDriver();
		w.get("https://www.facebook.com/login/");
		Thread.sleep(1000);
		String fb2 = w.getTitle();
	String fb = "Log in to Facebook";
		if(fb2.equals(fb) ) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
	}

}
