import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatedRadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Devarajan Jadeja\\Documents\\Eclipse workspace\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
driver.findElement(By.xpath("html[1]/body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/button[1]")).click();
System.out.println(driver.switchTo().alert().getText());
driver.switchTo().alert().accept();
	}

}
