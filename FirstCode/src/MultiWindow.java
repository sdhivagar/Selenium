import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Devarajan Jadeja\\Documents\\Eclipse workspace\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://the-internet.herokuapp.com");
driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
System.out.println(driver.getTitle());
//System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText());
Set<String>ids=driver.getWindowHandles();
Iterator<String>it=ids.iterator();
String parentid = it.next();
String childid = it.next();
driver.switchTo().window(childid);
System.out.println(driver.getTitle());
//System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]")).getText());
driver.switchTo().window(parentid);
	}

}
