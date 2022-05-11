package com.crm.comcast.contactTest;

import org.testng.annotations.Test;

public class CreateModDelConTest 
{
	@Test(groups = "smokeTest")
	public void createconTest()
	{
		System.out.println("-----contact created---------");
	}
	
	@Test(groups = "regressionTest")
	public void modconTest()
	{
		System.out.println("-----contact modified---------");
	}
	
	@Test(groups = "regressionTest")
	public void delconTest()
	{
		System.out.println("-----contact deleted---------");
	}


}
