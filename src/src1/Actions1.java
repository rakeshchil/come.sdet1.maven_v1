package src1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/ITSTURN/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		WebElement ele = driver.findElement(By.xpath("//*[@id=\'menu_admin_viewAdminModule\']/b"));
		WebElement ele1 = driver.findElement(By.xpath("//*[@id=\'menu_admin_UserManagement\']"));
		WebElement ele2 = driver.findElement(By.xpath("//*[@id=\'menu_admin_viewSystemUsers\']"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).moveToElement(ele1).moveToElement(ele2).click().build().perform();*/
		/*driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		WebElement ele =driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		Actions act = new Actions(driver);
		act.contextClick(ele).build().perform();
		driver.findElement(By.xpath("/html/body/ul/li[1]")).click();
		driver.switchTo().alert().accept();
		*/
		/*driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		WebElement ele =driver.findElement(By.xpath("//*[@id=\'box5\']"));
		WebElement ele1 = driver.findElement(By.xpath("//*[@id=\'box107\']"));
		Actions act = new Actions(driver);
		//act.clickAndHold(ele).moveToElement(ele1).release().build().perform();
		act.dragAndDrop(ele, ele1).build().perform();
		//driver.close();
*/
		
		/*driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		//WebElement ele =driver.findElement(By.xpath("//*[@id=\'slider\']/span"));
		Actions act = new Actions(driver);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\'content\']/iframe")));
		WebElement ele =driver.findElement(By.xpath("//*[@id=\'slider\']/span"));
		act.moveToElement(ele).dragAndDropBy(ele, 10,700).build().perform();*/
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\'content\']/iframe")));
		WebElement ele = driver.findElement(By.xpath("//*[@id=\'resizable\']/div[3]"));
		Actions act = new Actions(driver);
		//act.moveToElement(ele).clickAndHold().release().build().perform();
		act.moveToElement(ele).dragAndDropBy(ele, 50, 300).build().perform();
		
	}

}
