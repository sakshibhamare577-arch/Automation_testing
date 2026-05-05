package at.Selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testloginpage {
	
	//used to launch the chrome driver
	ChromeDriver driver=new ChromeDriver();
	
	void positivetest()
	{
		//used to maximize the window
		driver.manage().window().maximize();
		
		//used to open the login test page
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		//used to locate user name
		driver.findElement(By.id("username")).sendKeys("student");
		
		//used to locate password
		driver.findElement(By.id("password")).sendKeys("Password123");
		
		//used to click on submit button
		driver.findElement(By.id("submit")).click();
		
		System.out.println("The URL Contains:"+driver.getCurrentUrl());

	}
	
	void negativetest()
	{
		//used to the open the login test page
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		//used to locate user name
		driver.findElement(By.id("username")).sendKeys("incorrectuser");
		
		//used to locate password
		driver.findElement(By.id("password")).sendKeys("Password123");
		
		//used to click on submit button
		driver.findElement(By.id("submit")).getText();
		}

	void negativepasswordtest()
	{
		//used to open the login test page
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		//used to locate user name
		driver.findElement(By.id("username")).sendKeys("student");
		
		//user to locate password
		driver.findElement(By.id("password")).sendKeys("incorrectPassword");
		
		//used to click on submit button
		driver.findElement(By.id("submit")).click();
		
	}
public static void main (String args[])
{
		Testloginpage t=new Testloginpage();
		t.positivetest();
		t.negativetest();
		t.negativepasswordtest();
}

}
