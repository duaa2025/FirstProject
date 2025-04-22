import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HTML {
	
	WebDriver driver=new ChromeDriver();
	String WebSite="http://127.0.0.1:5500/index.html";

	
	
@BeforeTest
public void MySteup() {
	
	driver.get(WebSite);
	driver.manage().window().maximize();
}
@Test
public void View() {
	System.out.println(driver.getTitle());
}
@AfterTest
public void Quit() {}
}
