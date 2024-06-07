package seleniumassignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {

     ChromeDriver driver= new ChromeDriver();
     
     driver.get("http://leaftaps.com/opentaps/");
     
     driver.manage().window().maximize();
     
     driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
     
     driver.findElement(By.id("password")).sendKeys("crmsfa");
     
     driver.findElement(By.className("decorativeSubmit")).click();
     
     driver.findElement(By.xpath("//a[contains(text(),'M/S')]")).click();
     
     driver.findElement(By.xpath("//a[text()='Leads']")).click();
     
     driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
     
     driver.findElement(By.xpath("//span[text()='Phone']")).click();
     
     driver.findElement(By.name("phoneAreaCode")).sendKeys("+91");
     
     driver.findElement(By.name("phoneNumber")).sendKeys("1234567890");
     
     driver.findElement(By.className("x-btn-text")).click();
     
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     
     WebElement firstLead = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
     String leadID = firstLead.getText();
     System.out.println("Captured Lead ID: " + leadID);
     
     // Click the first resulting lead
     firstLead.click();
     
     driver.findElement(By.xpath("//a[text()='Delete']")).click();
     
     driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
     
     driver.findElement(By.name("id")).sendKeys(leadID);
     
     driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
     
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     
     String noRecordsMessage = driver.findElement(By.className("x-paging-info")).getText();
     System.out.println(noRecordsMessage);
     
     
     if (noRecordsMessage.contains("No records to display")) 
     {
         System.out.println("Lead deletion successful. Message displayed: " + noRecordsMessage);
     } 
     else
     {
         System.out.println("Lead deletion unsuccessful.");
     }
     }

}
