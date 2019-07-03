package src1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import src1.Pagefactory;

public class Pagefactory1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://ITSTURN//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Pagefactory obj = new Pagefactory(driver);
		obj.setusername("wqwqw");
		obj.setuserpassword("qwqw");
		obj.clickbutton();
		

	}

}
