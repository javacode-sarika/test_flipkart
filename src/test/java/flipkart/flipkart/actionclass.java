package flipkart.flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "../flipkart/chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/");
		
		WebElement element = driver.findElement(By.xpath("//a[text()='Insurance Project']"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(element).build().perform();
		
		actions.click(element).build().perform();
		
	}

}
