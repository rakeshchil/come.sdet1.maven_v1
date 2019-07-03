package src1;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowpopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://ITSTURN//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
		String str = driver.getWindowHandle();
		Set<String> str1 = driver.getWindowHandles();
		int i = str1.size();
		System.out.println(i);
		for(int q=1;q<=i;q++) {
			driver.switchTo().defaultContent();
			if(driver.getTitle().equalsIgnoreCase("amazon-google chrome")) {
				driver.close();
				
			}
		}
		
		

	}

}
