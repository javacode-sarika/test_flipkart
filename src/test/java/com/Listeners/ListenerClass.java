package com.Listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//My first change in this file 
public class ListenerClass implements ITestListener,ISuiteListener {

	@Override
	public void onStart(ISuite suite) {
		System.out.println("Before suite in listener");
	}

	@Override
	public void onFinish(ISuite suite) {
		System.out.println("After suite in listener");
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Before method in listener");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("After method in listener :: Pass");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("After method in listener:: Fail");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}
		

	

	
	

}
