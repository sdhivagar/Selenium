//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImpicitandExplcitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Devarajan Jadeja\\Documents\\Eclipse workspace\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
driver.findElement(By.xpath("//a[contains(text(),'Click to load get data via Ajax!')]")).click();
WebDriverWait d = new WebDriverWait(driver, 20);
d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='results']")));
System.out.println(driver.findElement(By.xpath("//div[@id='results']")).getText());
	}

}