import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Devarajan Jadeja\\Documents\\Eclipse workspace\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.spicejet.com");
System.out.println(driver.findElement(By.xpath("//input[@name='ctl00$mainContent$chk_StudentDiscount']")).isSelected());
driver.findElement(By.xpath("//input[@name='ctl00$mainContent$chk_StudentDiscount']")).click();
System.out.println(driver.findElement(By.xpath("//input[@name='ctl00$mainContent$chk_StudentDiscount']")).isSelected());
	}
}
