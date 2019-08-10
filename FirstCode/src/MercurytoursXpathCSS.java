import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercurytoursXpathCSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Devarajan Jadeja\\Documents\\Eclipse workspace\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://newtours.demoaut.com");
driver.findElement(By.linkText("REGISTER")).click();
driver.findElement(By.xpath("//*[@name='firstName']")).sendKeys("Devarajan");
driver.findElement(By.cssSelector("[name='lastName']")).sendKeys("Balaganapathy");
driver.findElement(By.xpath("//*[@name='phone']")).sendKeys("9840812560");
driver.findElement(By.cssSelector("input#userName")).sendKeys("devarajanjadeja28@gmail.com");
driver.findElement(By.xpath("//*[@name='address1']")).sendKeys("10, Annai Street, Anandha Nagar");
driver.findElement(By.cssSelector("[name='address2']")).sendKeys("Lawspet, Pondicherry");
driver.findElement(By.xpath("//*[@name='city']")).sendKeys("Puducherry");
driver.findElement(By.cssSelector("[name='state']")).sendKeys("Tamilnadu");
driver.findElement(By.xpath("//*[@name='postalCode']")).sendKeys("605008");
driver.findElement(By.cssSelector("#email")).sendKeys("devarajanjadeja28@gmail.com");
driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Deva@2810");
driver.findElement(By.cssSelector("input[name='confirmPassword']")).sendKeys("Deva@2810");
driver.findElement(By.xpath("//*[@name='register']")).click();
driver.findElement(By.linkText("sign-in")).click();
driver.findElement(By.cssSelector("[name='userName']")).sendKeys("devarajanjadeja28@gmail.com");
driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Deva@2810");
driver.findElement(By.cssSelector("[value='Login']")).click();
driver.close();
	}

}
