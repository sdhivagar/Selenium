import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicradio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Devarajan Jadeja\\Documents\\Eclipse workspace\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.spicejet.com/");
int count = driver.findElements(By.xpath("//input[@type='radio']")).size();
for(int i=0;i<count;i++)
{
	//driver.findElements(By.xpath("//input[@type='radio']")).get(i).click();
	driver.findElements(By.xpath("//input[@type='radio']")).get(i).getAttribute("value");
}
	}

}
