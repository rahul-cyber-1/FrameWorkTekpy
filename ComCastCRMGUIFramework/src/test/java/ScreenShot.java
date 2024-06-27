import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

import com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File;

public class ScreenShot {
	@Test
	public void amazonTest() throws IOException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		EventFiringWebDriver edriver = new EventFiringWebDriver(driver);
		java.io.File srcFile = edriver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile,new java.io.File("./screenshot/test.png"));
	}
}
