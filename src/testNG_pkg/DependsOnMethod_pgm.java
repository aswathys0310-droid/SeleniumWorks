package testNG_pkg;

import org.testng.annotations.Test;

public class DependsOnMethod_pgm {
	
	@Test 
	public void Reg()
	{
		System.out.println("Regression Method");
	}
	
	@Test (dependsOnMethods = "Reg") // login method is depends on the reg() so it will works only after excecute
	public void login()
	{
		System.out.println("Login Method");
	}
	
	@Test (dependsOnMethods = {"Reg" , "login"})
	public void home()
	{
		System.out.println("Home Method");
	}
	

}
