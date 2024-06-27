package practise;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import baseClass.BaseClassUpdated;

public class SampleReporterTest extends BaseClassUpdated {
	ExtentReports report;
	ExtentTest test;

	
	@Test
	public void createContact() {
		// sparkreport config

		test = report.createTest("createContactTest");

		test.log(Status.INFO, "login to app");
		test.log(Status.INFO, "navigate to contact page");
		test.log(Status.INFO, "create contact");
		if ("HDFC".equals("HFDC")) {
			test.log(Status.PASS, "contact is created PASS");
		} else {
			test.log(Status.FAIL, "contact is not created");
		}

	}

	@Test
	public void createwithPhn() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/");
		
		TakesScreenshot eDriver = (TakesScreenshot)driver;
		String FilePath = eDriver.getScreenshotAs(OutputType.BASE64);
		
		test = report.createTest("createwithPhn");
		test.log(Status.INFO, "login to app");
		test.log(Status.INFO, "navigate to contact page");
		test.log(Status.INFO, "create contact");
		if ("HDFC".equals("HFDC")) {
			test.log(Status.PASS, "contact is created PASS");
		} else {
			test.addScreenCaptureFromBase64String(FilePath,"ErrorFile");
		}
		driver.close();
	}

	@Test
	public void createwithORG() {
		test = report.createTest("createwithORG");
		test.log(Status.INFO, "login to app");
		test.log(Status.INFO, "navigate to contact page");
		test.log(Status.INFO, "create contact");
		if ("HDFC".equals("HDFC")) {
			test.log(Status.PASS, "contact is created PASS");
		} else {
			test.log(Status.FAIL, "contact is not created");
		}

	}
}
