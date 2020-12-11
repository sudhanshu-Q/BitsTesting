package com.bits4Testing.test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import util.TestUtil;

public class DistributedVersionControlSystem extends Baseclass
{
	@Test
	public void apiBasicTerminologies()
	{
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		driver.get("https://bitstesting.blogspot.com/2020/07/distributed-version-control-system.html");
	}
}
