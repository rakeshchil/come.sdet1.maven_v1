package src1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://ITSTURN//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/");
		driver.manage().window().maximize();
		driver.findElement(By.name("checkin")).click();
		for(int i=4;i>=1;i--)
		{
			driver.findElement(By.xpath("//html/body/div[10]/div[1]/table/thead/tr[1]/th[1]")).click();
			String m = driver.findElement(By.xpath("/html/body/div[10]/div[1]/table/thead/tr[1]/th[2]")).getText();
			//if(m.equals("October")) {
				//driver.findElement(By.linkText("5")).click();
				//break;
			//}
		}

	}

}
