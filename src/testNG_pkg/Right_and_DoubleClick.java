package testNG_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Right_and_DoubleClick {
	
ChromeDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void click() throws Exception
	{
		WebElement right_click = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		Actions act = new Actions(driver);
		act.contextClick(right_click).perform();
		Thread.sleep(2000);
		
		WebElement edit = driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]"));
		edit.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		WebElement double_click = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.doubleClick(double_click).perform();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
			
	}
	
	@AfterClass
	public void closing_method()
	{
		driver.quit();
	}

}
