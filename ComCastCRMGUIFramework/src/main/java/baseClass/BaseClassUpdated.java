package baseClass;

import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Writable;
import com.aventstack.extentreports.model.Report;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.comcast.crm.generic.DatabaseUtility.DatabaseUtility;
import com.comcast.crm.generic.FileUtility.ExcelUtility;
import com.comcast.crm.generic.FileUtility.FileUtility;
import com.comcast.crm.vtiger.objectrepository.HomePage;
import com.comcast.crm.vtiger.objectrepository.LoginPage;
import com.comcast.crm.vtiger.webdriverutility.JavaUtility;
import com.comcast.crm.vtiger.webdriverutility.WebDriverUtility;

public class BaseClassUpdated {
	
		public FileUtility flib = new FileUtility();
		public ExcelUtility elib = new ExcelUtility();
		public WebDriverUtility wlib = new WebDriverUtility();
		public JavaUtility jlib = new JavaUtility();
		public DatabaseUtility dlib = new DatabaseUtility();
	
		public WebDriver driver = null;
		public static WebDriver sdriver=null;
		
		@BeforeSuite(groups = { "SmokeTest", "RegressionTest" })
		public void configBS() throws SQLException {
			dlib.getDBConnection();
			
		}
		

		@BeforeClass(groups = { "SmokeTest", "RegressionTest" } )
		public void configBC() throws Throwable {

			//String BROWSER = browser;
		String BROWSER=flib.getDataFromPropertiesFile("browser");

			if (BROWSER.equalsIgnoreCase("CHROME")) {
				driver = new ChromeDriver();
			} else if (BROWSER.equalsIgnoreCase("FIREFOX")) {
				driver = new FirefoxDriver();
			} else if (BROWSER.equalsIgnoreCase("EDGE")) {
				driver = new EdgeDriver();
			} else if (BROWSER.equalsIgnoreCase("IE")) {
				driver = new InternetExplorerDriver();
			} else if (BROWSER.equalsIgnoreCase("SAFARI")) {
				driver = new SafariDriver();
			}
			sdriver=driver;
			
				
			}
		

		@BeforeMethod(groups = { "SmokeTest", "RegressionTest" })
		public void configBM() throws Throwable {
			String USERNAME = flib.getDataFromPropertiesFile("username");
			String PASSWORD = flib.getDataFromPropertiesFile("password");
			String URL = flib.getDataFromPropertiesFile("url");
			LoginPage lp = new LoginPage(driver);
			lp.loginToApp(URL, USERNAME, PASSWORD);

		}

		@AfterMethod(groups = { "SmokeTest", "RegressionTest" })
		public void configAM() throws InterruptedException {
			System.out.println("=logout=");
			HomePage hp = new HomePage(driver);
			hp.signOut();
		}

		@AfterClass(groups = { "SmokeTest", "RegressionTest" })
		public void configAC() {
			System.out.println("===close  the BROWSER==");
			driver.quit();
		
		}

		@AfterSuite(groups = { "SmokeTest", "RegressionTest" })
		public void configAS() throws SQLException {
			System.out.println("===close Db, Report backUP====");
			dlib.closeDbconnection();
			
			
		}

	}



