package practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TheardPoolSize {
	@Test(invocationCount = 10,threadPoolSize = 2)
	public void createContactTest() {
		WebDriver driver=new EdgeDriver();	}

}
