package selenium_package;

import org.openqa.selenium.chrome.ChromeDriver;

public class First_pgm {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver(); 
		// EdgeDriver driver = new EdgeDriver(); - for opening edge browser
		// FirefoxDriver driver = new FirefoxDriver();  - for opening Firefox browser
		driver.get("https://www.google.com/");
		String actualtitle = driver.getTitle(); // to retrive the title of the web application 
		System.out.println("The title of the web aplication is " + actualtitle);
		
		String expectedtitle = "Google";
		if(actualtitle.equals(expectedtitle))
		{
			System.out.println("The title is Matched");
		}
		else
		{
			System.out.println("The title is not matched");
		}
	}

}
