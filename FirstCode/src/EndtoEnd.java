import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndtoEnd {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Devarajan Jadeja\\Documents\\Eclipse workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.cssSelector("input[value='RoundTrip']")).click();
		driver.findElement(By.cssSelector("input[value='OneWay']")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//a[@value='COK']")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		for(int i=1;i<3;i++) 
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_IndArm']")).click();
		//driver.findElement(By.linkText("Special Assistance")).click();
		driver.findElement(By.xpath("//a[@id='popup-close2']")).click();
		driver.findElement(By.xpath("//input[@name='ctl00$mainContent$btn_FindFlights']")).click();
	}

}
