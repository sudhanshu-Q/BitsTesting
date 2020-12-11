package com.bits4Testing.test;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;



import io.github.bonigarcia.wdm.WebDriverManager;
import util.TestUtil;

public class Baseclass 
{

	static WebDriver driver;
		

	//ReadDataConfiguration readconfig=new ReadDataConfiguration();
	//public WebDriver;
	//@Parameters("browser")
	@BeforeClass
	//Accessing different browser
	//public void setUp(String br)
	public void setUp()
	{
		//		if (br.equals("Chrome"))
		//		{
		// ChromeDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		System.out.println("get url");
		//		System.out.println(readconfig.getUrl());
		//		driver.get(readconfig.getUrl());
		//		System.out.println(readconfig.getUrl());
		//		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		//		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		//		}
		//		else if(br.equals("Firefox"))
		//		{
		//		WebDriverManager.firefoxdriver().setup();
		//		WebDriver driver=new FirefoxDriver();
		//		System.out.println("get url");
		//		System.out.println(readconfig.getUrl());
		//		driver.get(readconfig.getUrl());
		//		System.out.println(readconfig.getUrl());
				driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		//		}
	}
	public void takeScreebshot(String testName)
	{
		try
		{
			TakesScreenshot screenshots=(TakesScreenshot)Baseclass.driver;
			System.out.println("Driver taking screenshot");
			File source=screenshots.getScreenshotAs(OutputType.FILE);
			System.out.println(source);
			System.out.println("Taking screenshot for failed Test case");
			//	String filePath="D:\\GitLocalRepo\\ActiTime_Automation\\Screenshots\\";
			String filePath="./Screenshots/";
			System.out.println("Screenhots taken");
			new File(filePath);
			System.out.println("Test case faile in: "+testName);
			FileUtils.copyFile(source,new File("./Screenshots/"+testName+".png"));
			System.out.println("Screenshots moved to screenshot folder");


		} 
		catch (Exception e) 
		{
			System.out.println("error while taking screenshots");
			System.out.println(e.getMessage());
		}

	}
	@AfterClass
	public void shutDown()
	{
		driver.quit();
//		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
	}
	public void visitSite() throws InterruptedException
	{
		driver.manage().window().maximize();
		Thread.sleep(6000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("//*[@id=\"post-body-4667509845185510558\"]/div")).click();
		
	}
	

}
