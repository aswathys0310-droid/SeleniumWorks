package junit_pkg;

import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Response_code2 {
	
	ChromeDriver driver;
	
	@BeforeEach
	public void Kerala()
	{
		driver = new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void linkcount() throws Exception
	{
		List<WebElement> links =  driver.findElements(By.tagName("a"));
		System.out.println("Number of Links = " + links.size());
		
		for(WebElement li:links)
		{
			String url = li.getAttribute("href");
			verify(url);
		}
		
	}

	private void verify(String url) throws Exception {
		
		try
		{
			
		
		URI obj = new URI(url);
		URL value = obj.toURL();
		HttpURLConnection con = (HttpURLConnection) value.openConnection();
		int Responsecode = con.getResponseCode();
		
		if(Responsecode == 200)
		{
			System.out.println("Valind Link : " +url);
		}
		else if(Responsecode==404)
		{
			System.out.println("Broken Link :" +url);
		}
		else
		{
			System.out.println("Other Response Code " + url);
		}
		}
		catch(Exception e)
		{
			System.out.println("e.getMessage");
		}
		
	}
	@AfterEach
	public void close_method()
	{
		driver.quit();
	}
	
	
}
