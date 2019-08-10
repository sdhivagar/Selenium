import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkboxassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Devarajan Jadeja\\Documents\\Eclipse workspace\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://qaclickacademy.com/practice.php");
Assert.assertFalse(driver.findElement(By.cssSelector("input[name='checkBoxOption1']")).isSelected());
driver.findElement(By.cssSelector("input[name='checkBoxOption1']")).click();
Assert.assertTrue(driver.findElement(By.cssSelector("input[name='checkBoxOption1']")).isSelected());
driver.findElement(By.cssSelector("input[name='checkBoxOption1']")).click();
Assert.assertFalse(driver.findElement(By.cssSelector("input[name='checkBoxOption1']")).isSelected());
System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
}
}