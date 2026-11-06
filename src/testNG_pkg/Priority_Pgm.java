package testNG_pkg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Priority_Pgm {
	
	@BeforeTest
	public void setup()
	{
		System.out.println("BeforeTest , Browser Open");
	}
	
	@BeforeMethod
	public void mthd()
	{
		System.out.println("URL Loadiing...");
	}
	
	@Test(priority = 1 , invocationCount = 3)
	public void mthd_X()
	{
		System.out.println("Method X...");
	}
	
	@Test(priority = 2 , enabled = false)
	public void mthd_A()
	{
		System.out.println("Method A...");
	}
	
	@Test(priority = 3)
	public void mthd_F()
	{
		System.out.println("Method F...");
	}
	
	@AfterClass
	public void After_Class_mthd()
	{
		System.out.println("AfterClass Method...");
	}

}
