package practise;

import org.testng.annotations.Test;



public class InvocationCountTest {
	@Test(invocationCount = 10)
	public void createOrderTest() {
		System.out.println("Execute createOrderTest");
	}
	
@Test(enabled = false)
public void billingOrderTest() {
	System.out.println("Execute billingOrderTest");
}
}
