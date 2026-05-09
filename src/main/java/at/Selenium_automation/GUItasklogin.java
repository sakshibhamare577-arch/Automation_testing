package at.Selenium_automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GUItasklogin {

	public static void main(String[] args) throws InterruptedException {

        // Launch Chrome Browser
        WebDriver driver = new ChromeDriver();

        // Open Website
        driver.get("https://testautomationpractice.blogspot.com/");

        // Maximize Browser
        driver.manage().window().maximize();

        // Wait
        Thread.sleep(2000);

        
        // TEXTBOX HANDLING

        driver.findElement(By.id("name")).sendKeys("Sakshi");

        driver.findElement(By.id("email"))
                .sendKeys("sakshi@gmail.com");

        driver.findElement(By.id("phone"))
                .sendKeys("9876543210");

        driver.findElement(By.id("textarea"))
                .sendKeys("Pune Maharashtra");

        // =========================
        // RADIO BUTTON
        // =========================

        driver.findElement(By.id("female")).click();

        // =========================
        // CHECKBOX
        // =========================

        driver.findElement(By.id("monday")).click();
        driver.findElement(By.id("friday")).click();

        // =========================
        // DROPDOWN
        // =========================

        driver.findElement(By.id("country")).click();

        
        // WEB TABLE
        
        String bookname = driver.findElement(
                By.xpath("//table[@name='BookTable']//tr[2]/td[1]"))
                .getText();

        System.out.println("Book Name : " + bookname);


        // FILE UPLOAD
      
        driver.findElement(By.id("singleFileInput"))
                .sendKeys("C:\\Users\\Admin\\Desktop\\testfile.txt");

        
        // BUTTON CLICK
       
        driver.findElement(By.xpath("//button[text()='Submit']"))
                .click();

        System.out.println("Automation Test Passed");

        // Wait
        Thread.sleep(3000);

        // Close Browser
        driver.quit();
    }
}

