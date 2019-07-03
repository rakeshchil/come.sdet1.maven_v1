package src1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Webpush1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://ITSTURN//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disabled-notification");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.redbus.in");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("@id=['container']))
		

	}

}
