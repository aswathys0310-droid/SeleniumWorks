package junit_pkg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_pgm {
	ChromeDriver driver;
	
	@BeforeEach
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void login()
	{
		WebElement username = driver.findElement(By.xpath("//input[@id=\"ulogin\"]"));
		username.sendKeys("abcd");
		
		WebElement password = driver.findElement(By.xpath("//input[@id=\"upass\"]"));
		password.sendKeys("1234");
		
		WebElement submitbutton = driver.findElement(By.xpath("//input[@id=\"sub_logbtn\"]"));
		submitbutton.click();
		
		
	}

}
