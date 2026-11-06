package pom_test_pkg;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom_base_pkg.Base_class;
import pom_page_pkg.Login_page;

public class Login_test extends Base_class // to get driver information from the class
{
	
	Login_page obj;
	
	@BeforeMethod
	public void object_method()
	{
		obj = new Login_page(driver);
	}
	
	@Test
	public void login_testmthd()
	{
		obj.setvalues();
		obj.login_method();
	}
	
	@Test
	public void title_verification()
	{
		System.out.println(obj.title_method());
	}

}
