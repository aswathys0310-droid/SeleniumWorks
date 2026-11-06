package testNG_pkg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Grouping_pgm {
	@BeforeClass (alwaysRun = true)
	public void beforeclass_Mthd()
	{
		System.out.println("Before Class Method");
	}
	
	@Test(priority = 1 , groups = "Smokes")
	public void Is_mthd()
	{
		System.out.println("Is Method...");
	}
	
	@Test(priority = 2 , groups = "Sanity")
	public void Is_mthd_one()
	{
		System.out.println("Is Method One...");
	}
	
	@Test(priority = 3 , groups = {"Regression","Smoke"})
	public void Is_mthd_two()
	{
		System.out.println("Is Method Two...");
	}
	
	@AfterClass(alwaysRun = true)
	public void AfterClass_mthd()
	{
		System.out.println("After method...");
	}

}
