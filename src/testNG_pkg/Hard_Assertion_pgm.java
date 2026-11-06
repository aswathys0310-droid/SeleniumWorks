package testNG_pkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Hard_Assertion_pgm {
	ChromeDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	
	@Test(priority = 1)
	public void title_verification()
	{
		String actual_title = driver.getTitle();
		// System.out.println(actual_title);
		
		String expected_title = "Rediffmail Free Unlimited Storage";
		Assert.assertEquals(expected_title, actual_title);
		System.out.println("Success"); // this line will exicute only after the assertion is passed
	}
	
	@Test(priority = 2)
	public void url_verification()
	{
		String actual_url = driver.getCurrentUrl();
		System.out.println("Actual_URL = " + actual_url);
		
		String expected_url = "https://register.rediff.com/register/register.php?FormName=user_details";
		Assert.assertEquals(expected_url, actual_url);
		System.out.println("URL Verfication Successfully");
	}
}
