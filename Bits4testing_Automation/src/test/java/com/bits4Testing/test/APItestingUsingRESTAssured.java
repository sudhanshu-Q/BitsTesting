package com.bits4Testing.test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import util.TestUtil;

public class APItestingUsingRESTAssured extends Baseclass 
{
	@Test
	public void apitestingUsingRESTAssured() throws InterruptedException
	{
		driver.get("https://bitstesting.blogspot.com/2020/07/api-testing-using-rest-assured.html");
//		Baseclass nw=new Baseclass();
//		nw.visitSite();
	}

}
