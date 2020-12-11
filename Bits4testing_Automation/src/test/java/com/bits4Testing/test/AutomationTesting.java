package com.bits4Testing.test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import util.TestUtil;

public class AutomationTesting extends Baseclass
{
	@Test
	public void apiBasicTerminologies()
	{
		
		driver.get("https://bitstesting.blogspot.com/2020/07/automation-testing.html");
	}

}
