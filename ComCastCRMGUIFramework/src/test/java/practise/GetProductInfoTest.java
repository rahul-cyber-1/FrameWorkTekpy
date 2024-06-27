package practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GetProductInfoTest {
	@Test
	public void getProductInfoTest(String brandName,String productName)throws InterruptedException{
		WebDriver driver = new  ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.get("https://www.amazon.in/ref=nav_logo")
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone",Keys.ENTER);
		
		//CAPTURE DATA
		//String x = ""
		//String price = driver.findElement(By.xpath(x));
		//System.out.println(price);
	}
	@DataProvider
	public Object[][] getData(){
		Object[][] obj = new Object[3][2];
		obj[0][0]="iphone";
		obj[0][1]="Apple iPhone 15 (128 GB) - Black";
		
		obj[1][0]="iphone";
		obj[1][1]="Apple iPhone 13 (128GB) - Midnight\\r\\n";
		
		obj[2][0]="iphone";

		obj[2][1]="Apple iPhone 15 (128 GB) - Black\r\n";
	    
	    return obj;

}
}