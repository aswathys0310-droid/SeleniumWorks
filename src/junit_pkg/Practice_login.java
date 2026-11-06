package junit_pkg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_login {
	ChromeDriver driver ;
	
	@BeforeEach
	public void Brows_setup()
	{
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize(); // to maximize the window
	}
	
	@Test
	public void login()
	{
		WebElement username = driver.findElement(By.id("username")); // locate username with locator id 
		username.sendKeys("Aeris"); // only string values are accepted
		WebElement password = driver.findElement(By.name("password")); // locate password with locator name
		password.sendKeys("0310");
		WebElement submitbutton = driver.findElement(By.id("submit"));
		submitbutton.click();
	}
	
	// @AfterEach
//	public void closingmethod()
//	{
//		driver.quit();
//	}
}



