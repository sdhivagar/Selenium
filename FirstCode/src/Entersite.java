import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Entersite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Devarajan Jadeja\\Documents\\Eclipse workspace\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.netflix.com");
driver.findElement(By.linkText("Sign In")).click();       
driver.findElement(By.id("id_userLoginId")).sendKeys("netflix@netflix.com");
driver.findElement(By.id("id_password")).sendKeys("netflix");
driver.findElement(By.linkText("Need help?")).click();
driver.findElement(By.xpath("//*[@id='appMountPoint']/div/div[2]/a[1]/svg"));
//driver.close();
	}

}
