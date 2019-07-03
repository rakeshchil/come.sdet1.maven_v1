package src1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://ITSTURN//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
		driver.manage().window().maximize();
		//driver.switchTo().frame("packageListFrame");
		//driver.findElement(By.xpath("/html/body/div[2]/ul/li[4]/a")).click();
		//driver.switchTo().frame("packageFrame");
		//driver.findElement(By.xpath("/html/body/div/ul/li[8]/a")).click();
		driver.switchTo().frame("classFrame");
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody[2]/tr[1]/td[1]/a")).click();

	}

}
