package com.crm.comcast.campaignTest;

import org.testng.annotations.Test;

public class CreateModDelCampTest 
{
	@Test(groups = "smokeTest")
	public void createCampTest()
	{
		System.out.println("-----campaign created---------");
	}
	
	@Test(groups = "regressionTest")
	public void modCampTest()
	{
		System.out.println("-----campaign modified---------");
	}
	
	@Test(groups = "regressionTest")
	public void delCampTest()
	{
		System.out.println("-----campaign deleted---------");
	}

}
