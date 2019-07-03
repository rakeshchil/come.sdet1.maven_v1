package src1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardevents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://ITSTURN//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//*[@id=\'u_0_l\']"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).keyDown(ele, Keys.SHIFT).sendKeys(ele, "hello").keyUp(ele, Keys.SHIFT).build().perform();
	}

}
