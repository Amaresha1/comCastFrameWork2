package com.crm.comcast.contactTest;

import org.testng.annotations.Test;

public class CreateModDelConTest 
{
	@Test(groups = "smokeTest")//hello master
	public void createconTest()//create contact
	{
		System.out.println("-----contact created---------");
	}
	
	@Test(groups = "regressionTest")
	public void modconTest()
	{
		System.out.println("-----contact modified---------");
	}
	
	//updated engg2
	@Test(groups = "regressionTest")
	public void delconTest()
	{
		System.out.println("-----contact deleted---------");
	}


}
