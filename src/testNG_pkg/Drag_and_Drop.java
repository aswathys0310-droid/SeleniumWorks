package testNG_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Drag_and_Drop {
	ChromeDriver driver;
	
	@BeforeClass
	public void click_Buttons()
	{
		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Actions/index.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void DragandDrop_method() throws Exception
	{
		WebElement src = driver.findElement(By.xpath("//*[@id=\"draggable\"]/p/b"));
		WebElement target = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(src , target).perform();
		
		Thread.sleep(3000);
		WebElement hover_btn = driver.findElement(By.xpath("///*[@id=\"div-hover\"]/div[1]/button"));
		
		act.moveToElement(hover_btn).perform();
		Thread.sleep(3000);
		
		WebElement link1=driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[1]/div/a"));
		link1.click();
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		WebElement clickandHold_btn=driver.findElement(By.xpath("//*[@id=\"click-box\"]"));
		act.clickAndHold(clickandHold_btn).perform();
		Thread.sleep(2000);	
		
		WebElement double_btn=driver.findElement(By.xpath("//*[@id=\"double-click\"]/h2"));
		act.doubleClick(double_btn).perform();
		
		
	}

}
