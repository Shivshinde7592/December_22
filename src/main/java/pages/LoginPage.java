package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.ElementUtils;


public class LoginPage {
	
	WebDriver driver;
	ElementUtils elementutils;
	//WebElements
	By username = By.name("username");
	By password = By.name("password");
	By loginButton = By.className("orangehrm-login-button");
	By invalidCredMsg = By.className("oxd-alert-content-text");
	
//	By forgetpassword=By.className("forgetpassword");
//	By loginText= By.className("orangehrm-login-title");
//	By cancelButton = By.xpath("//button[text()=' Cancel ']");
	String name = "pravash";
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	    elementutils = new ElementUtils(driver);
	}
	
	
	//PageActions
	public void enterUsername(String user)
	{
		elementutils.enterText(username, user);
//		try {
//		driver.findElement(username).sendKeys(user);
//		}
//		catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
	}
	
	public void enterPassword(String pass)
	{
		elementutils.enterText(password, pass);
//		try {
//			driver.findElement(password).sendKeys(pass);
//		}
//		catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
		
	}
	
	public HomePage clickLoginButton()
	{
		elementutils.doclick(loginButton);
//		driver.findElement(loginButton).click();
//		HomePage page = new HomePage(driver);
//		return page;
		return new HomePage(driver);
	}
	
	
	public HomePage doLogin(String user, String pass)
	{
		enterUsername(user);
		enterPassword(pass);
//		HomePage page =clickLoginButton();
//		return page;
		return clickLoginButton();
	}
	
	
	public boolean isInvalidCredMsgPresent()
	{
		return elementutils.isElementPresent(invalidCredMsg, 10);
	}
	
	public String getInvalidMsgText()
	{
		WebElement element = driver.findElement(invalidCredMsg);
		return element.getText();
	}
	

	
}






















	
//	public boolean redirectToResetPasswordPageLinkPresent()
//	{
//		boolean flag;
//		try {
//			driver.findElement(forgetpassword);
//			flag=true;
//		}
//		catch(NoSuchElementException e)
//		{
//			flag=false;
//		}
//		return flag;
//	}
//	
//	public ResetPasswordPage clickOnForgrtPassword()
//	{
//		driver.findElement(forgetpassword).click();
//		return new ResetPasswordPage(driver);
//	}
//
//	public boolean navigateToLoginPage()
//	{
//		boolean flag;
//		try {
//			WebDriverWait wait= new WebDriverWait(driver,10);
//			WebElement element=wait.until(ExpectedConditions.presenceOfElementLocated(loginText));
//			flag=true;
//		}
//		catch(TimeoutException e)
//		{
//			flag=false;
//		}
//		return flag;
//	}
//	
//	public String getLoginMsgText()
//	{
//		WebElement element= driver.findElement(loginText);
//		return element.getText();
//	}

	
	
	

