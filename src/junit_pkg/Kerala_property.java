package junit_pkg;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kerala_property {
	ChromeDriver driver ; 
	
	@BeforeEach
	public void Browse_setup()
	{
		driver = new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize(); // to maximize the window
	}
	
	@Test
	public void titleverification()
	{
		String actualtitle = driver.getTitle();
		System.out.println("Title of the web page : "+ actualtitle);
	}
	
	@Test
	public void textverification()
	{
		String sourcecode = driver.getPageSource(); // to retrive the source code information
		if(sourcecode.contains("User Login"))
		{
			System.out.println("Test is present");
		}
		else
		{
			System.out.println("Test is not present");
		}
	}
	
	@Test
	public void login()
	{
		WebElement username = driver.findElement(By.id("ulogin")); // locate username with locator id 
		username.sendKeys("Aeris"); // only string values are accepted
		WebElement password = driver.findElement(By.name("upass")); // locate password with locator name
		password.sendKeys("0310");
		WebElement loginbutton = driver.findElement(By.id("sub_logbtn"));
		loginbutton.click();
	}
	
		
	@AfterEach
		public void closingmethod()
		{
			driver.quit();
		}
	}


