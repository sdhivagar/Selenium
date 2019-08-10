import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Devarajan Jadeja\\Documents\\Eclipse workspace\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://jqueryui.com");
driver.manage().window().maximize();
driver.findElement(By.linkText("Droppable")).click();
Actions a = new Actions(driver);
driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
a.dragAndDrop(source, target).build().perform();

	}

}
