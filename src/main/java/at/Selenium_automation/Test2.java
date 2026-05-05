package at.Selenium_automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
	
	public static void main(String args[])
	{
		
		//to launch browser	
		ChromeDriver driver=new ChromeDriver();
		
		//to maximize the window
		driver.manage().window().maximize();
		
		//to open university web site
		driver.get("https://beta.unipune.ac.in/");
		
		//to navigate form current page
		driver.navigate().to("https://www.myntra.com/");
		
		//to navigate form current page
		driver.navigate().to("https://onlinesbi.sbi.bank.in/");
		
		//to open university web site
		driver.get("https://beta.unipune.ac.in/");
		
		//to refresh the page
		driver.navigate().refresh();
		
		//to show URL of current web page
		System.out.println("URL of University Website is :"+driver.getCurrentUrl());
		
		driver.close();
	}
	

}
