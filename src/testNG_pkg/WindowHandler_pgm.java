package testNG_pkg;


import java.io.File;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WindowHandler_pgm {
	
	ChromeDriver driver;
	
	@BeforeClass
	public void browser_setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void Amazon() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String parentwindow = driver.getWindowHandle();
		
		WebElement searchbar = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		searchbar.sendKeys("Mobiles");
		
		WebElement icon = driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
		icon.click();
		
		WebElement phnlink = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/a"));
		phnlink.click();
		
		//ArrayList<String> windowdetails = new ArrayList<>(driver.getWindowHandles()); // to store all open browser window handles in a list
		//driver.switchTo().window(windowdetails.get(1)); // 1st tab located in the 0th index
		Set<String> tabdetails = driver.getWindowHandles();
		
		for(String handle : tabdetails)
		{
			if (handle.equalsIgnoreCase(parentwindow))
			{
				driver.switchTo().window(handle);
				File s = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				FileHandler.copy(s,new File("./Screenshot1/image.png"));
				System.out.println("Screeshot Saved Successfully");
			}
		}
	}

}
