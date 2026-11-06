package pom_page_pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	
	WebDriver driver;
	
	//locating web elements using page package 
	@FindBy(xpath = "//*[@id=\"ulogin\"]")WebElement username;
	@FindBy(id = "upass")WebElement password;
	@FindBy(xpath = "//*[@id=\"sub_logbtn\"]")WebElement login_button;
	
	//constructor
	public Login_page(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Methods
	public void setvalues()
	{
		username.sendKeys("abcd@gmail.com");
		password.sendKeys("1234");
	}
	
	public void login_method()
	{
		login_button.click();
	}
	
	public String title_method()
	{
		String title = driver.getTitle();
		return title;
	}

}
