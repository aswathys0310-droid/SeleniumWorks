package testNG_pkg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Anotations {
	@BeforeTest
	public void method()
	{
		System.out.println("Before Test method...");
	}
	
	@BeforeClass
	public void BeforeClass_method()
	{
		System.out.println("BeforeClass_method...");
	}
	
	@BeforeMethod
	public void mthd()
	{
		System.out.println("BeforeMthd...");
	}
	
	@Test
	public void testmthd_A()
	{
		System.out.println("Test Method A...");
	}
	
	@Test
	public void testmthd_X()
	{
		System.out.println("Test Method X...");
	}
	
	@Test
	public void testmthd_C()
	{
		System.out.println("Test Method C...");
	}
	
	@AfterMethod
	public void Af_mthd()
	{
		System.out.println("After Method...");
	}
	
	@AfterClass
	public void After_class()
	{
		System.out.println("After Class...");
	}
	
	@AfterTest
	public void After_test()
	{
		System.out.println("After Test...");
	}

}
