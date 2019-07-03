package src1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import src1.Pagefactory4;
public class Pagefactory5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://ITSTURN//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Pagefactory4 obj = new Pagefactory4(driver);
		obj.setup("qwqw");
		obj.setpass("wqwqwq");
		obj.clickbutton();

	}

}
