package junit_pkg;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit_pgm {
	
	ChromeDriver driver;
	
	@BeforeEach
	public void browse_setup()
	{
		driver = new ChromeDriver();
		
		System.out.println("Before each method");
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void titleverification()
	{
		System.out.println("Test method 1");
		
		String actualtitle = driver.getTitle();
		String expectedtitle = "Google";
		if (expectedtitle.equals(actualtitle))
		{
			System.out.println("Titles Matched");
		}
		else
		{
			System.out.println("Titles not Matched");
		}
	}
	
	@Test
	public void method2()
	{
		System.out.println("Method2");
	}
	
	@AfterEach
	public void closeingmethod()
	{
		System.out.println("After each method");
		
		// driver.close(); // to close the browser tab
		driver.quit();
	}

}
