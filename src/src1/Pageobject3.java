package src1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import src1.Pageobject2;

public class Pageobject3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://ITSTURN//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Pageobject2 obj = new Pageobject2(driver);
		obj.setusrename("qwqw");
		obj.setupassword("qwqw");
		obj.clickbutton();
		

	}

}
