package src1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://ITSTURN//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		/*//driver.findElement(By.linkText("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
		//driver.findElement(By.xpath("//*[@id=\'OKTab\']/button")).click();
		//driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\'OKTab\']/button")).click();
		driver.switchTo().alert().accept();
		//driver.close();
*/		
		/*driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id='CancelTab']/button")).click();
		driver.switchTo().alert().dismiss();
		String str =driver.findElement(By.xpath("//*[@id=\'demo\']")).getText();
		System.out.println(str);*/
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\'Textbox\']/button")).click();
		driver.switchTo().alert().sendKeys("qwqwqw");
		driver.switchTo().alert().accept();
		String str = driver.findElement(By.xpath("//*[@id=\'demo1\']")).getText();
		System.out.println(str);
		
	}

}
