package at.Selenium_automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	public static void main(String [] args)
	{
       //launch browser , initialize the chromedriver object
		ChromeDriver driver=new ChromeDriver();
		 
         //	used to maximize the window
		driver.manage().window().maximize();
		
		//	used to open the current webpage
		driver.get("https://secure.facebook.com/");
		
        //used to navigation of website
		driver.navigate().to("https://www.fortunecloudindia.com/");
		System.out.println("tittle of fct:"+driver.getTitle());
       
       //used to navigate back
		driver.navigate().back();
		System.out.println("url of fb:"+driver.getCurrentUrl());
		
		// use forward, refresh
		//use to close the browser
		driver.close();
	
	}
}

