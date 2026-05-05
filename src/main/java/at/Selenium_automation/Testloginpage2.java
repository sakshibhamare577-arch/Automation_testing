package at.Selenium_automation;

import  org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testloginpage2 
{
	public static void main(String args[]) {
		
			//user to launch the chrome driver
			ChromeDriver driver=new ChromeDriver();

			//used to maximize the window
			driver.manage().window().maximize();
			
			//used to open the login test page
			driver.get("https://practicetestautomation.com/practice-test-login/");
			
			//id locator=done
			//driver.findelement(By.id("username")).sendkeys("student");
			
			//name locators=done
			//driver.findelement(By.name("username")).sendkeys("student");
			
			//driver.findElement(By.className("btn")).click();
			
			//tagname=done
			//driver.findElement(By.tagName("input")).sendKeys("student");
			
			//linktext=not done
			//driver.findElement(By.linkText("COURSES")).sendKeys("student");
			
			//partiallinktext=done
			//driver.findElement(By.partialLinkText("BL")).click();
			
			//xpath(//tagname[@attribute='value'])=done
			//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("student");
			
			//cssSelector(tagname[attribute]='value')=done
			//driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Password");
			
			
	}
}


