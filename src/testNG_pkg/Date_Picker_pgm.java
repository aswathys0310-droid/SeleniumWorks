package testNG_pkg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Date_Picker_pgm {
	
	ChromeDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void date_picker() throws Exception 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement Calender = driver.findElement(By.xpath("//*[@id=\"datepicker1\"]"));
		Calender.click();
		
		while (true) //to find month
		{
			String Month = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div")).getText();
			System.out.println("Month = " + Month);
			
			if (Month.equalsIgnoreCase("November 2026"))
			{
				break;
			}
			else
			{
				WebElement next_arrow = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span"));
				next_arrow.click();
			}
		} // month selected
		
		// WebElement Date = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[6]/a"));
		 //Date.click();
		
		List<WebElement> date = driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td/a"));
		
		for (WebElement d : date)
		{
			String datetext = d.getText();
			if (datetext.equals("6"))
			{
				d.click();
				System.out.println("Date Selected");
				break;
			}
		}
	}
}
