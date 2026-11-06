package junit_pkg;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Response_code {
	
	ChromeDriver driver;
	
	@BeforeEach
	public void Kerala()
	{
		driver = new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void login() throws Exception
	{
		String url = driver.getCurrentUrl();
		URI obj = new URI(url); // to verify the text is in the link format
		URL link = obj.toURL();
		HttpURLConnection con= (HttpURLConnection) link.openConnection();
		int responsecode = con.getResponseCode();
		System.out.println("Response code is " + responsecode);
		
		if(responsecode==200)
		{
			System.out.println("Valid Link");
		}
		else if (responsecode == 404)
		{
			System.out.println("Broken Link");
		}
		else
		{
			System.out.println("Other Response Code");
		}
	}

}
