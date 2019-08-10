import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QAclickacademy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Devarajan Jadeja\\Documents\\Eclipse workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("http://www.qaclickacademy.com/");
        driver.findElement(By.xpath("//*[@id=\"homepage\"]/header/div[2]/div/nav/ul/li[4]/a")).click();
        driver.findElement(By.xpath("//ul[@id='tablist1-tab1']")).click();
        driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[2]")).click();
        driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[3]")).click();
        driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[4]")).click();     
	}

}
