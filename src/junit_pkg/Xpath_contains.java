package junit_pkg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_contains {
	
ChromeDriver driver;
	
	@BeforeEach
	public void browser_setup()
	{
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	
	@Test
	public void email() throws Exception
	{
		WebElement Rediffmail = driver.findElement(By.xpath("//input[contains(@id,'login')]"));
		Rediffmail.sendKeys("admin");
		
		Thread.sleep(2000);
		WebElement fullname = driver.findElement(By.xpath("//input[contains(@name,'name')and @placeholder=\"Enter your full name\"]"));
		fullname.sendKeys("Aswathy");
	}
}
