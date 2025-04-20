import java.awt.event.ItemListener;
import java.util.List;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Training {
	
	//This is a taring project
	WebDriver driver=new EdgeDriver();
	
	String WebSite="https://www.saucedemo.com/";
	String UserName="standard_user";
	String PassWord="secret_sauce";
		
	
	@BeforeTest
	
	public void MySetup() {
		
		driver.manage().window().maximize();
		driver.get(WebSite);
		
		
	}
	
	@Test (priority=1, enabled=true )
	
	public void Login() {
		WebElement UserNameIn= driver.findElement(By.id("user-name"));
		WebElement PassWordIn= driver.findElement(By.id("password"));
		WebElement LogInButton= driver.findElement(By.id("login-button"));
		UserNameIn.sendKeys(UserName);
		PassWordIn.sendKeys(PassWord);
		LogInButton.click();
			}
	@Test (priority=2, enabled=false)
	public void AddOneItem () throws InterruptedException {
		WebElement AddButtonForFirstItem= driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		AddButtonForFirstItem.click();		
		Thread.sleep(2000);
		
	}
	@Test (priority=3, enabled=false)
	public void RemoveOneItem() {
		WebElement RemoveButtonForFirstItem= driver.findElement(By.id("remove-sauce-labs-backpack"));
		RemoveButtonForFirstItem.click();
	}
	
	@Test(priority=4, enabled=false)
	public void LogOut() throws InterruptedException {
		WebElement BurgerMenu=driver.findElement(By.id("react-burger-menu-btn"));
		WebElement LogOutButton=driver.findElement(By.id("logout_sidebar_link"));
		BurgerMenu.click();
		Thread.sleep(2000);
		LogOutButton.click();
	}
	@Test (priority=5, enabled=false)
	public void AddAllItems() throws InterruptedException {
		List<WebElement> AddToCartButtons=driver.findElements(By.className("btn_primary"));
		
		for (int i=0; i<AddToCartButtons.size();i++ ){
			AddToCartButtons.get(i).click();
			Thread.sleep(2000);
					}
	                 }
	@Test(priority=6, enabled=false)
	public void RemoveAllItems() throws InterruptedException {
		List<WebElement> RemoveButtons=driver.findElements(By.className("btn_secondary"));
		for(int i=0; i<RemoveButtons.size();i++) {
			RemoveButtons.get(i).click();
			Thread.sleep(2000);}
						}
	
	
	@Test(priority=7, enabled=false)
	public void PrintItemsLabled() throws InterruptedException {
		List<WebElement> ItemsLables=driver.findElements(By.className("inventory_item_name"));
		for(int i=0; i< ItemsLables.size(); i++) {
			System.out.println("The lable #"+ (i+1)+"=" + ItemsLables.get(i).getText()  );
			Thread.sleep(2000);
			System.out.println("The First letter for the lable #"+ (i+1)+"=" + ItemsLables.get(i).getText().charAt(0) );
		}
			}
	@Test (priority=8, enabled=false)
	public void printnamedontstartS() {
		List<WebElement> ItemName=driver.findElements(By.className("inventory_item_name"));
		for(int i=0; i<ItemName.size();i++) {
		String ItemsName=ItemName.get(i).getText();
			if(ItemsName.startsWith("S")) {
				continue;
			}	else {System.out.println(ItemsName);} 
		}
		
	}
	
	@Test (priority=9, enabled=false)
	public void PrintEvenItems() {
		List<WebElement> ItemName=driver.findElements(By.className("inventory_item_name"));
		for(int i=0; i<ItemName.size();i=i+2) {
		String ItemsName=ItemName.get(i).getText();
		System.out.println(ItemsName);} 
		}
	@Test (priority=10, enabled=false)
	public void CompareBtweenString() {
		List<WebElement> ItemName=driver.findElements(By.className("inventory_item_name"));
		for(int i=0; i<ItemName.size();i++) {
		String ItemsName=ItemName.get(i).getText();
		if(ItemsName.equals("Sauce Labs Fleece Jacket"))
		break;
		else {System.out.println(ItemsName);} 
		}}
	
	@Test (priority=11, enabled=true)
	public void PrintLableNotEndWithT() {
		List<WebElement> ItemName=driver.findElements(By.className("inventory_item_name"));
		for(int i=0; i<ItemName.size();i++) {
		String ItemsName=ItemName.get(i).getText();
		if(ItemsName.endsWith("t"))
			continue; 
		else {System.out.println(ItemsName);} 
		}}
	
	
	
	@AfterTest
	public void myAfterTest() {

//		driver.quit();
	}	

	
	

}
