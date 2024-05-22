package com.Listeners;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Runner {
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before suite");
	}
	
	@AfterSuite
	
	public void afterSuite()
	{
		System.out.println("After suite");
	}
	
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before method");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After method");
	}
	
	@Test
	public void test1()
	{
		System.out.println("test1");
	}
	@Test
	public void test2()
	{
		System.out.println("test2");
	}
	@Test
	public void test3()
	{
		System.out.println("test3");
	}

}
