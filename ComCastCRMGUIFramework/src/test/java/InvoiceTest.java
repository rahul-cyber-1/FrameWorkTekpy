

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import baseClass.BaseClassUpdated;
@Listeners
public class InvoiceTest extends BaseClassUpdated {
	@Test
	public void createInvoiceTest() {
		
		   
		String actTitle = driver.getTitle();
		System.out.println("execute createInvoiceTest");
	     Assert.assertEquals(actTitle,"ashdh");
		String var = driver.getTitle();
		System.out.println(var);
		System.out.println("step-1");
		System.out.println("step-2");
		System.out.println("step-3");
		System.out.println("step-4");
		
	}
@Test
public void createInvoicewithcontactTest() {
	System.out.println("execute createInvoicewithContactTest");
	System.out.println("step-1");
	System.out.println("step-2");
	System.out.println("step-3");
	System.out.println("step-4");
}
}
