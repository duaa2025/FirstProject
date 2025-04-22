import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginHTML {
	
	WebDriver driver= new ChromeDriver();
	
	String WebSite="http://127.0.0.1:5500/Login.html";
	
@BeforeTest
public void MySetup() {
	driver.get(WebSite);
	driver.manage().window().maximize();}


@Test
public void FillTheLoginPage() throws InterruptedException {
	WebElement Username= driver.findElement(By.name("username"));
	Username.sendKeys("duaa2020");
	Thread.sleep(2000);
	WebElement Password= driver.findElement(By.xpath("//input[@id='password']"));
	Password.sendKeys("1465765");
	Thread.sleep(2000);
	//WebElement Button= driver.findElement(By.xpath("//button[@class='login-btn']"));
	WebElement Button= driver.findElement(By.cssSelector("login-btn"));
	Button.click();
			
	
}



@AfterTest
public void quit() {}
}
