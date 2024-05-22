package flipkart.flipkart;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.reactivex.rxjava3.functions.Action;


public class LounchBrowser {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "../flipkart/chromedriver1.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
	
		 
//		 List<WebElement> ele = driver.findElements(By.xpath("//input[@type='radio']"));
//		 
//		 System.out.println(ele.size());
//		 
//		// driver.findElement(By.xpath("//input[@value='checkbox1']")).click();
//		 
//		 for(int i=0;i<ele.size();i++)
//		 {
//			 if(ele.get(i).getAttribute("value").equalsIgnoreCase("Option 2"))
//			 {
//				 ele.get(i).click();
//			 }
//		 }
		 driver.findElement(By.name("submit")).click();
		 Thread.sleep(2000);
		 
		 LounchBrowser.handleAlert();
		 
		
		 
	}
	
	public static void handleAlert()
	{
		Alert alert = driver.switchTo().alert();
		 
		 String msg = alert.getText();
		 System.out.println(msg);
		 alert.accept();
		 
	}

}
