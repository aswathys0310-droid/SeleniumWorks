package testNG_pkg;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class File_upload_robort {
	ChromeDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.manage().window().maximize();
	}
	
	@Test
	public void File_upload() throws Exception
	{
		WebElement upload_btn = driver.findElement(By.xpath("//*[@id=\"pickfiles\"]"));
		upload_btn.click();
		fileUpload("C:\\Users\\PC\\Documents\\SQL TASKS.pdf\\");
	}

	private void fileUpload(String p) throws Exception {
		StringSelection strobj = new StringSelection(p);
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strobj, null);
	    
	    Robot rob = new Robot();
	    rob.delay(3000);
	    
	    rob.keyPress(KeyEvent.VK_CONTROL); // VK - Virtual Key
	    rob.keyPress(KeyEvent.VK_V);
	    
	    rob.keyRelease(KeyEvent.VK_V);
	    rob.keyRelease(KeyEvent.VK_CONTROL);
	    
	    rob.keyPress(KeyEvent.VK_ENTER);
	    rob.keyRelease(KeyEvent.VK_ENTER);
	    
	    rob.delay(2000);
	    System.out.println("File Upload Successfully");
		
	}

}
