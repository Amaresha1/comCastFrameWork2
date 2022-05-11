package com.crm.comcast.orgTest;

import org.testng.annotations.Test;

public class CreateModDelOrgTest 
{
	@Test(groups = "smokeTest")
	public void createOrgTest()
	{
		System.out.println("-----organization created---------");
		String dname = System.getProperty("browser");
		System.out.println(dname);
	}
	
	@Test(groups = "Integration")
	public void modOrgTest()
	{
		System.out.println("-----organization modified---------");
	}
	
	@Test(groups = "regressionTest")
	public void delOrgTest()
	{
		System.out.println("-----organization deleted---------");
	}


}
