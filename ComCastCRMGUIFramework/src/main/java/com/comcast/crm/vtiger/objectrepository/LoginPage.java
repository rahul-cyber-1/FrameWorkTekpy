package com.comcast.crm.vtiger.objectrepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.vtiger.webdriverutility.WebDriverUtility;



public class LoginPage extends WebDriverUtility {
	WebDriver driver;
	// Rule 2 object identitification
	@FindBy(name = "user_name")
	private WebElement usernameEdt;

	@FindBy(name = "user_password")
	private WebElement passwordEdt;

	@FindBy(id = "submitButton")
	private WebElement loginBtn;

	// Rule 3 initialization this should be done in test script
	// FOR SIMPLIFICATION CONSTRUCTOR CREATION
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Rule 4:object encapsulation(getters methods)

	public WebElement getUsernameEdt() {
		return usernameEdt;
	}

	public WebElement getPasswordEdt() {
		return passwordEdt;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	// BUSINESS LIBRARY
	public void loginToApp(String url, String username, String password) {
		maximizePage(driver);
		driver.get(url);
		waitForPageToLoad(driver);
		usernameEdt.sendKeys(username);
		passwordEdt.sendKeys(password);
		loginBtn.click();
	}

}



