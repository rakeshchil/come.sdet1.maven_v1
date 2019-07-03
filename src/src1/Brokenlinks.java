package src1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://ITSTURN//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		driver.manage().window().maximize();
		List<WebElement> ele = driver.findElements(By.tagName("a"));
		//System.out.println(ele);
		System.out.println(ele.size());
		for(int i=0;i<ele.size();i++) {
			WebElement ele1 = ele.get(i);
			String url =ele1.getAttribute("href");
			System.out.println(url);
			URL li = new URL(url);
			HttpURLConnection httpconn =(HttpURLConnection)li.openConnection();
			httpconn.connect();
			int responsecode = httpconn.getResponseCode();
			if(responsecode >= 400) {
				System.out.println(li);
			}
				driver.close();
			}

	}

}
