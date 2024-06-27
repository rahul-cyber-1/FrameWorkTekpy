package com.comcast.crm.vtiger.webdriverutility;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	public void waitForPageToLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}
	public void maximizePage(WebDriver driver) {
		driver.manage().window().maximize();
	}

	public void waitforElementPresent(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void switchToTabOnURL(WebDriver driver, String partialURL) {
		Set<String> set = driver.getWindowHandles();
		java.util.Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			String windowid = itr.next();
			driver.switchTo().window(windowid);
			String acturl = driver.getCurrentUrl();
			if (acturl.contains(partialURL)) {
				break;
			}

		}

	}

	public void switchToTabOnTitle(WebDriver driver, String partialTitle) {
		Set<String> set = driver.getWindowHandles();
		java.util.Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			String windowid = itr.next();
			driver.switchTo().window(windowid);
			String acturl = driver.getTitle();
			if (acturl.contains(partialTitle)) {
				break;
			}

		}

	}

	public void switchtoFrame(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}

	public void switchtoFrame(WebDriver driver, String nameid) {
		driver.switchTo().frame(nameid);
	}

	public void switchtoFrame(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}

	public void switchToAlertAndAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

	public void switchToAlertAndDismiss(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}

	public void select(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	
	public void select(WebElement element, String text) {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}

	public void mouseMoveOnElement(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}

	public void doubleclick(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.doubleClick(element).perform();
	}

}
