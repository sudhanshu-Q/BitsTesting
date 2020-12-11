package com.bits4Testing.test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import util.TestUtil;

public class ApiBasicTerminologies extends Baseclass
{
	@Test
	public void apiBasicTerminologies() throws InterruptedException
	{
		
		driver.get("https://bitstesting.blogspot.com/2020/09/api-basic-terminologies.html");
		Thread.sleep(6000);
//		Baseclass nw=new Baseclass();
//		nw.visitSite();
	}
	

}
