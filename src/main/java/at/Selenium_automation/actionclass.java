package at.Selenium_automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclass { 
	ChromeDriver driver;
	private Actions act;{
	}
	public static void main(String[] args) throws InterruptedException {
		
		actionclass ob=new actionclass();
		ob.mousehover();
		ob.searchbar();
		ob.dragndrop();
		
	}

	private void mousehover() throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver=new ChromeDriver();
		Actions act;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://demo.nopcommerce.com/");
		
		//Actionclass
		act = new Actions(driver);
		WebElement comp=driver.findElement(By.linkText("Computers"));
		act.moveToElement(comp).build().perform();
		Thread.sleep(2000);
		
	}
	void searchbar()
	{
	WebElement se=driver.findElement(By.id("small-searchterms"));
	WebElement button=driver.findElement(By.xpath("//button[text()='Search']"));
	act.sendKeys(se,"laptop").click(button).perform();
	
	}
	void dragndrop()
	
	{
		driver.navigate().to("https://demo.automationtesting.in/Static.html");
		WebElement drag=driver.findElement(By.id("angular"));
		WebElement drop=driver.findElement(By.id("droparea"));
		act.dragAndDrop(drag, drop).build().perform();
		
	}
}
