package junit_pkg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
	ChromeDriver driver;
	Select obj;
	
	@BeforeEach
	public void Browser_setup()
	{
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	
	@Test
	public void Dropdown_method()
	{
		WebElement Day = driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[1]"));
		obj = new Select(Day); // creating obj for Select class
		obj.selectByIndex(3); // used to locate the index position 
		
		WebElement Month = driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[2]"));
		obj = new Select(Month);
		obj.selectByValue("11");
		
		WebElement Year = driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[3]"));
		obj = new Select(Year);
		obj.selectByVisibleText("2005");
		
		
    }
	
	

}
