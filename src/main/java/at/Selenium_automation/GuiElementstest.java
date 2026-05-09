package at.Selenium_automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuiElementstest {
	
	public static void main(String[] args) throws InterruptedException {

        // Launch Browser
        WebDriver driver = new ChromeDriver();

        // Open URL
        driver.get("https://testautomationpractice.blogspot.com/");

        // Maximize Window
        driver.manage().window().maximize();

        // Enter Name
        driver.findElement(By.id("name")).sendKeys("Sakshi");

        // Enter Email
        driver.findElement(By.id("email")).sendKeys("sakshi@gmail.com");

        // Enter Phone
        driver.findElement(By.id("phone")).sendKeys("9307369663");
        
        // Enter Address
        driver.findElement(By.id("textarea")).sendKeys("Pune Maharashtra");

        // Select Gender
        driver.findElement(By.id("female")).click();

        // Select Days
        driver.findElement(By.id("monday")).click();
        driver.findElement(By.id("wednesday")).click();

        // Submit Button
        driver.findElement(By.xpath("//button[text()='Submit']")).click();

        // Wait
        Thread.sleep(3000);
        
        // Close Browser
        driver.quit();

	}
	{
	}
	}
