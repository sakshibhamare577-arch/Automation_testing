package at.Selenium_automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselectorssyntax {
 
		public static void main(String[] args) {
			
			ChromeDriver driver = new ChromeDriver();
	
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			driver.findElement(By.cssSelector("input[type='username']")).sendKeys("Admin");
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			driver.findElement(By.name("username")).sendKeys("Admin");
}
	
}