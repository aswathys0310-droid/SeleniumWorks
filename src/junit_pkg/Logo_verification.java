package junit_pkg;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logo_verification {
	// //img[@title="Rediffmail"]
	ChromeDriver driver;
	
	@BeforeEach
	public void Browser_setup()
	{
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	
	@Test
	public void logo() throws Exception
	{
		WebElement logo = driver.findElement(By.xpath("//img[@title=\"Rediffmail\"]"));
		boolean result = logo.isDisplayed();
		if(result == true)
		{
			System.out.println("Logo is displayed");
		}
		else
		{
			System.out.println("Logo is not displayed");
		}
		
		WebElement RadioButtonfemale = driver.findElement(By.xpath("//input[@value=\"f\"]"));
		boolean buttonenable = RadioButtonfemale.isEnabled();
		System.out.println("Female button is Enabled : " + buttonenable); // to verify wether the ensured button is enabled 
		RadioButtonfemale.click();
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@type=\"checkbox\"]"));
		checkbox.click();
		
		Thread.sleep(2000);
		
		boolean checkboxbutton = checkbox.isSelected();
		if(checkboxbutton == true)
		{
			System.out.println("Checkbox is Selected");
		}
		else
		{
			System.out.println("Checkbox is not Selected");
			
		}
	}
	@AfterEach
	public void closing_method()
	{
		driver.quit();
	}
	

}
