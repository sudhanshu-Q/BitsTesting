package com.bits4Testing.test;

import org.testng.annotations.Test;

public class APITesting extends Baseclass
{
	@Test
	public void apiTesting()
	{
		driver.get("https://bitstesting.blogspot.com/2020/07/APITesting.html");
	}

}
