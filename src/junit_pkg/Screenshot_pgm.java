package junit_pkg;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_pgm {
	ChromeDriver driver;
	
	@BeforeEach
	public void Browser_setup()
	{
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	
	@Test
	public void Screenshot_method() throws Exception  
	{
		File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(s,new File("C:\\Users\\PC\\Desktop\\Selenium Works\\Screenshot\\Rediff.png"));
	    
		
		WebElement logo = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/a/img"));
		File logo_Screenshot = logo.getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(logo_Screenshot,new File("C:\\Users\\PC\\Desktop\\Selenium Works\\Screenshot\\logo.png"));
	}

}
