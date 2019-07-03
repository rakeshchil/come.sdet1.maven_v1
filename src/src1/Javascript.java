package src1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://ITSTURN//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("qwqw");
		driver.findElement(By.name("pass")).sendKeys("wqwq");
		//driver.findElement(By.id("u_0_3")).click();
		WebElement button = driver.findElement(By.xpath("//*[@id=\'u_0_a\']"));
		js.executeScript("arguments[0].click();", button);
		js.executeScript("alert('incorrect passwod');");
		js.e
		//driver.close();

	}

}
