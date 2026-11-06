package junit_pkg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath_pgm2 
{
ChromeDriver driver;
	
	@BeforeEach
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	
		@Test
		public void Dropdown() {
			WebElement day=driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[1]"));
			Select obj=new Select(day);//Creating for select for select class
			obj.selectByIndex(3);
			
			WebElement month=driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[2]"));
			obj=new Select(month);//Creating for select for select class
			obj.selectByVisibleText("OCT");
			
			WebElement year=driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[8]/select[3]"));
			obj=new Select(year);//Creating for select for select class
			obj.selectByValue("2013");
		}
		
	}
