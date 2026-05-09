package at.Selenium_automation;

import  org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class fblogintask {
	{
}
	public static void main(String args[]) {
		
		//Launch browser
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open URL
        driver.get("https://www.facebook.com/");

        // Enter First Name
        driver.findElement(By.name("firstname")).sendKeys("Sakshi");	
        
        // Enter Last Name
        driver.findElement(By.name("lastname")).sendKeys("Bhamare");

        // Select Gender (Female)
        driver.findElement(By.xpath("//input[@value='1']")).click();
	}

			
}
