package src1;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://ITSTURN//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Set<Cookie> cookies = driver.manage().getCookies();
		System.out.println(cookies.size());
		/*for(Cookie c1:cookies) {
			
			System.out.println(c1.getName()+"  "+c1.getValue());
		}*/
		//System.out.println(driver.manage().getCookieNamed("sbEf8NXaNjQwxhCd8O2Blq9G6y"));
		Cookie cname = new Cookie("mycookies","123");
		driver.manage().addCookie(cname);
		//set<C
		for(Cookie c1: cookies) {
			System.out.println(c1.getName()+"  "+c1.getValue());
			
		}
		
		driver.manage().deleteCookieNamed("sbCAEOXTpsLs6VTyRoWZMthN3y");
		System.out.println(cookies.);

	}

}
