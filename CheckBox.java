package seleniumassignment2;

import java.time.Duration;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckBox {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://leafground.com/checkbox.xhtml");
		
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		
		WebElement message = driver.findElement(By.className("ui-growl-title"));
		
		if(message.isDisplayed()) {
			System.out.println("The message is displayed");
		}
			else
			{
			System.out.println("The message is not displayed");	
			}
		
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		
		driver.findElement(By.xpath("//div[@data-iconstates='[\"\",\"ui-icon ui-icon-check\",\"ui-icon ui-icon-closethick\"]']")).click();
		
		String  state = driver.findElement(By.xpath("//p[text()='State = 1']")).getText();
		
		System.out.println(state);
		
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		
        String  check = driver.findElement(By.xpath("//span[text()='Checked']")).getText();
		
		System.out.println(check);
		
		if(check.contains("Checked"))
		{
			System.out.println("The message is displayed");
		}
		else {
			System.out.println("The message is not displayed");
		}
		
        String  checkbox = driver.findElement(By.xpath("//span[text()='Disabled']")).getText();
		
		System.out.println(checkbox);
		if(checkbox.contains("Disabled"))
		{
			System.out.println("checkbox disabled");
		}
		else {
			System.out.println("Checkbox is not disabled");
		}
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		
		driver.findElement(By.xpath("//div[@id='j_idt87:multiple_panel']/div[2]/ul[1]/li[1]/div[1]/div[2]")).click();
		
		driver.findElement(By.xpath("//div[@id='j_idt87:multiple_panel']/div[2]/ul[1]/li[2]/div[1]/div[2]")).click();
		
		
		
		
	
		
		
		
	} 

}
