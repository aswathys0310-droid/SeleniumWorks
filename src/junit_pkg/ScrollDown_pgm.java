package junit_pkg;

import java.io.File;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScrollDown_pgm {
	ChromeDriver driver;
	
	@BeforeEach
	public void Browser_setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().window().maximize();
	}
	
	@Test
	public void ScrollDown_method() throws Exception
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,500)");
		Thread.sleep(2000);
		
	    // Screenshot
		File s = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(s,new File("./Screenshot/Amazon.png"));
		
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("scrollBy(0,1000)");
		Thread.sleep(2000);
		
	    // Screenshot
		File scrn = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(scrn,new File("./Screenshot/cart.png"));
	}

}
