package seleniumassignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
	
	     ChromeDriver driver= new ChromeDriver();
	     
	     driver.get("http://leaftaps.com/opentaps/");
	     
	     driver.manage().window().maximize();
	     
	     driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	     
	     driver.findElement(By.id("password")).sendKeys("crmsfa");
	     
	     driver.findElement(By.className("decorativeSubmit")).click();
	     
	     driver.findElement(By.xpath("//a[contains(text(),'M/S')]")).click();
	     
	     driver.findElement(By.xpath("//a[text()='Leads']")).click();
	     
	     driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
	     
	     driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
	     
	     driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Mathi");
	     
	     driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("prakash");
	     
	     driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("mathi");
	     
	     driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Testing");
	     
	     driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("New to Testing");
	     
	    driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("mathi@gmail.com");
	     
	     WebElement db = driver.findElement(By.name("generalStateProvinceGeoId"));
	     Select options = new Select(db);
		 options.selectByVisibleText("New York");
		 
		 driver.findElement(By.name("submitButton")).click();
		 
		 driver.findElement(By.xpath("//a[text()='Edit']")).click();
		 
		 WebElement cleardescription = driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']"));
		 cleardescription.clear();
	     
		 driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("This is new topic in testing");
		 
		 driver.findElement(By.className("smallSubmit")).click();
		 
		 String Title = driver.getTitle();
		 System.out.println(Title);
		 
		 driver.close();
	}

}
