import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewClass {

	String TheWebsite = "http://127.0.0.1:5500/index123.html";
	WebDriver driver = new EdgeDriver();

	@BeforeTest
	public void Setup() {
		driver.get(TheWebsite);
		driver.manage().window().maximize();

	}

	@Test
	public void Login() {
	WebElement Username=driver.findElement(By.name("username"));
	WebElement Password=driver.findElement(By.xpath("//input[@name='password']"));
	WebElement LoginButton=driver.findElement(By.cssSelector(".login-btn"));
	Username.sendKeys("Anas Jarrar");
	Password.sendKeys("12345");
	LoginButton.click();
	}

}
