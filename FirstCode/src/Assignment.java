import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Devarajan Jadeja\\Documents\\Eclipse workspace\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.cleartrip.com/");
driver.findElement(By.id("RoundTrip")).click();
driver.findElement(By.id("OneWay")).click();
Select adults = new Select(driver.findElement(By.id("Adults")));
adults.selectByValue("4");
Select children = new Select(driver.findElement(By.id("Childrens")));
children.selectByValue("1");
Select infant = new Select(driver.findElement(By.id("Infants")));
infant.selectByValue("1");
driver.switchTo().alert().dismiss();
driver.findElement(By.xpath("//i[@class='icon.ir.datePicker']")).click();
driver.findElement(By.cssSelector("a[class='ui-state-default.ui-state-highlight.ui-state-active ']")).click();
driver.findElement(By.id("SearchBtn")).click();
	}

}
