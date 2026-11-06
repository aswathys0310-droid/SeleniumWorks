package junit_pkg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo_alert_pgm {
	
	ChromeDriver driver;
	
	@BeforeEach
	public void Browser_setup()
	{
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void Demo_site() throws Exception 
	{
		WebElement alert_with_ok = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")) ;
		alert_with_ok.click();
		
		WebElement alert_button = driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")) ;
		alert_button.click();
		Alert alrt = driver.switchTo().alert(); // switch to control to the alert box 
		String alert_text = alrt.getText(); // to retrive the text from the alert box
		System.out.println("Alert is  : " + alert_text);
		
		Thread.sleep(2000);
		alrt.accept();
		
		WebElement alert_with_ok_and_cancel = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		alert_with_ok_and_cancel.click();
		
		WebElement confirmbox_button = driver.findElement(By.xpath("//*[@id=\\\"CancelTab\\\"]/button"));
		confirmbox_button.click();
		
		Alert alrt_confirm = driver.switchTo().alert(); // switch to control to the alert box 
		String alert_confirm = alrt.getText(); // to retrive the text from the alert box
		System.out.println("Alert is  : " + alert_confirm);
		
		Thread.sleep(2000);
		alrt.accept();
		
		WebElement alert_with_textbox = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		alert_with_textbox.click();
		
		WebElement demonstrate_promptbox = driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
		demonstrate_promptbox.click();
		
		Alert alrt_promptbox = driver.switchTo().alert(); // switch to control to the alert box 
		String alert_promptbox = alrt.getText(); // to retrive the text from the alert box
		System.out.println("Alert is  : " + alert_promptbox);
		alrt_promptbox.sendKeys("Aswathy");
		Thread.sleep(2000);
		alrt.accept();
		
		
		
	}

}
