import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mercurytours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Devarajan Jadeja\\Documents\\Eclipse workspace\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://newtours.demoaut.com/");
driver.findElement(By.linkText("REGISTER")).click();
driver.findElement(By.name("firstName")).sendKeys("Devarajan");
driver.findElement(By.name("lastName")).sendKeys("Balaganapathy");
driver.findElement(By.name("phone")).sendKeys("9840812560");
driver.findElement(By.id("userName")).sendKeys("devarajanjadeja28@gmail.com");
driver.findElement(By.name("address1")).sendKeys("10, Annai Street, Anandha Nagar");
driver.findElement(By.name("address2")).sendKeys("Lawspet, Pondicherry");
driver.findElement(By.name("city")).sendKeys("Puducherry");
driver.findElement(By.name("state")).sendKeys("Tamilnadu");
driver.findElement(By.name("postalCode")).sendKeys("605008");
driver.findElement(By.id("email")).sendKeys("devarajanjadeja28@gmail.com");
driver.findElement(By.name("password")).sendKeys("Deva@2810");
driver.findElement(By.name("confirmPassword")).sendKeys("Deva@2810");
driver.findElement(By.name("register")).click();
driver.findElement(By.linkText("sign-in")).click();
driver.findElement(By.name("userName")).sendKeys("devarajanjadeja28@gmail.com");
driver.findElement(By.name("password")).sendKeys("Deva@2810");
driver.findElement(By.name("login")).click();
driver.close();
	}

}
