package flipkart.flipkart;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "../flipkart/chromedriver1.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		//driver.findElement(By.xpath("//span[text()='Alerts']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.id("alertButton")).click();
//		Thread.sleep(2000);
//		Alert alert = driver.switchTo().alert();
//		 
//		 String msg = alert.getText();
//		 System.out.println(msg);
//		 alert.accept();
		 
		 
		 driver.findElement(By.id("timerAlertButton")).click();
         
         driver.manage().wait(5000);
         
         AlertDemo.alertHandle();
	}
	
	public static void alertHandle()
	{
		 Alert alter = driver.switchTo().alert();
	        String mesaage =  alter.getText();
	        System.out.println(mesaage);
	        //alter.accept();
	}

}
