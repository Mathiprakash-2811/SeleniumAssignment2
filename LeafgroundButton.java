package seleniumassignment2;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundButton {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://leafground.com/button.xhtml");
		
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		
		String Title = driver.getTitle();
		System.out.println(Title);
		
		 driver.navigate().back();
		 
		 WebElement ButtonDisabled = driver.findElement(By.xpath("(//div[@class='col-12 md:col-6']//div)[2]"));
		 System.out.println(ButtonDisabled .isDisplayed());
		
			
	     WebElement Location = driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']"));
	     System.out.println(" The position of the Submit Button is  " + Location.getLocation());
	     
		String Color = driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).getCssValue("color");
			
		System.out.println("The Color of the Button is "  + Color);
		
		Dimension Size = driver.findElement(By.xpath("//span[text()='Submit']")).getSize();
		
		System.out.println(" The Height and width of the Button is "+Size);
		
	}

}
