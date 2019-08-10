import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spicejetdropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Devarajan Jadeja\\Documents\\Eclipse workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
driver.get("https://www.spicejet.com/");
driver.findElement(By.xpath("//input[@value='RoundTrip']")).click();
System.out.println(driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).size());
driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//a[@value='GAU']")).click();
Thread.sleep(2000L);
driver.findElement(By.xpath("(//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='IXM'])")).click();
driver.findElement(By.id("divpaxinfo")).click();
Thread.sleep(2000L);
int i=1;
for(i=1;i<5;i++)
{
	driver.findElement(By.id("hrefIncAdt")).click();
	
}
driver.findElement(By.id("btnclosepaxoption")).click();
driver.close();
	}

}
