package com.ExtentReport;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGeneration {
	
	@Test
	public void reportDemo() throws IOException {
		
		ExtentReports report = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("index.html");
		report.attachReporter(spark);
		spark.config().setTheme(Theme.STANDARD);
		spark.config().setDocumentTitle("TMB Training");
		spark.config().setReportName("Test Report");
		//Setup code
		
		//Create Test
		ExtentTest test= report.createTest("Test 1");
		test.pass("Test1 is passs");
		
		ExtentTest test1= report.createTest("Test 2");
		test1.fail("Test1 is Faillllll");	
		
		//Flush report
		report.flush();
		Desktop.getDesktop().browse(new File("index.html").toURI());
		
	}

}
