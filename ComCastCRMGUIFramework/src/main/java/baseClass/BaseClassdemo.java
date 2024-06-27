package baseClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClassdemo {
	@BeforeSuite(groups = {"SmokeTest","RegressionTest"})
	public void dataBaseConn() {
		System.out.println("Execute DataBaseConnection");
	}
	
	@AfterSuite(groups = {"SmokeTest","RegressionTest"})
	public void closeDataBaseConn() {
		System.out.println("Execute CloseDataBaseConn");
	}
	
	@BeforeClass(groups = {"SmokeTest","RegressionTest"})
	public void lunchBrowser() {
		System.out.println("Execute lunchingBrowser");
	}
	
	@org.testng.annotations.AfterClass(groups = {"SmokeTest","RegressionTest"})
	public void quit() {
		System.out.println("Execute quit");
	}
	
	@BeforeMethod(groups = {"SmokeTest","RegressionTest"})
	public void loginPage() {
		System.out.println("Execute loginPage");
	}
	
	@AfterMethod(groups = {"SmokeTest","RegressionTest"})
	public void logoutPage() {
		System.out.println("Execute logoutPage");
	}
	

}
