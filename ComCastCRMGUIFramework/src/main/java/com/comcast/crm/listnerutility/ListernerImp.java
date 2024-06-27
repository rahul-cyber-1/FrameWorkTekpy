package com.comcast.crm.listnerutility;

import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import baseClass.BaseClassUpdated;



public class ListernerImp implements ITestListener,ISuiteListener {
	
	public ExtentReports report;
	public ExtentTest test ;

	public void onStart(ISuite suite) {
		System.out.println("Report configuration");
		// sparkreport config
		String time=new Date().toString().replace(" ", "_").replace(":", "_");
					ExtentSparkReporter spark = new ExtentSparkReporter("./AdvanceReport/report.html"+time);
					spark.config().setDocumentTitle("CRM Test Suite Results");
					spark.config().setReportName("CRM Report");
					spark.config().setTheme(Theme.DARK);
					//add envi info and create test
					 report = new ExtentReports();
					report.attachReporter(spark);
					report.setSystemInfo("OS", "Windows-10");
					report.setSystemInfo("BROWSER", "CHROME-100");
			
	}

	
	public void onFinish(ISuite suite) {
		System.out.println("Report backup");
		report.flush();
		
	}

	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
	System.out.println("======= ====>"+result.getMethod().getMethodName()+">======START=======");
	
	test = report.createTest(result.getMethod().getMethodName());
	test.log(Status.INFO,result.getMethod().getMethodName()+"===>  STARTED  <==== ");
	
     test = report.createTest(result.getMethod().getMethodName());
	}

	
	public void onTestSuccess(ITestResult result) {
		System.out.println("====>"+result.getMethod().getMethodName()+">======END========");
		test.log(Status.PASS,result.getMethod().getMethodName()+"===>  COMPLETED <==== ");
		
	}

	
	public void onTestFailure(ITestResult result) {

		String testName = result.getMethod().getMethodName();
		TakesScreenshot ts= (TakesScreenshot)BaseClassUpdated.sdriver;
		String FilePath =ts.getScreenshotAs(OutputType.BASE64);
		String time=new Date().toString().replace(" ", "_").replace(":", "_");
		test.addScreenCaptureFromBase64String(FilePath,testName+"_"+time);
		test.log(Status.FAIL,result.getMethod().getMethodName()+"===>  FAILED  <==== ");
		
		
	}

	
	public void onTestSkipped(ITestResult result) {
		
		
	}

	

}
