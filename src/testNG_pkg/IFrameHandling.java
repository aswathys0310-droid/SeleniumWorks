package testNG_pkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IFrameHandling {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() 
	{
		driver = new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();
	}
	
	@Test(priority = 1)
	public void login_mthd()
	{
		WebElement user = driver.findElement(By.xpath("//*[@id=\"ulogin\"]"));
		user.sendKeys("aswa@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//*[@id=\"upass\"]"));
		password.sendKeys("aswa123");
		
		WebElement login_btn = driver.findElement(By.xpath("//*[@id=\"sub_logbtn\"]"));
		login_btn.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlContains("myhome"));
		
	}
	
	@Test(priority = 2)
	public void addproprty_mthd()
	{
		WebElement Addproperty_btn = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/div/ul/li[3]/a"));
		Addproperty_btn.click();
		
		WebElement Frametag = driver.findElement(By.xpath("//*[@id=\"frm_property\"]/div[9]/div/div/iframe"));
		driver.switchTo().frame(Frametag);
				
		WebElement Summarybox = driver.findElement(By.xpath("/html/body"));
		Summarybox.click();
		Summarybox.sendKeys("abcdf");
		
		driver.switchTo().defaultContent();
	}

}
