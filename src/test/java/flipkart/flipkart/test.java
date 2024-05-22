package flipkart.flipkart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium_Projects\\flipkart\\chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		try {
//			driver.get("https://demo.guru99.com/test/newtours/register.php");
//		} catch (Exception e) {
//			e.printStackTrace();
//			// TODO: handle exception
//		}
//		
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		List<WebElement> ele = driver.findElements(By.xpath("//div[@id='nav-main']//a"));
		for(int i=0;i<=ele.size();i++)
		{
			String myval = ele.get(i).getText();
			System.out.println(myval);
			if(myval.equalsIgnoreCase("Sell"))
			{
				ele.get(i).click();
			}
		}
		
		
        
		
	}
}


