package at.Selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class fblogintest 
{
	public static void main(String args[])
	{
		//to launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		//to maximize the window
		driver.manage().window().maximize();
		
		//used to open fb page
		driver.get("https://www.facebook.com/");
		
		//fb login page=email text box
		driver.findElement(By.id("_R_oiqjbj9pb6amH1_")).sendKeys("admin@gmail.com");
		
		//password textbox
		driver.findElement(By.id("_R_oiqjbj9pb6amH1_")).sendKeys("admin");
		
	}
}
