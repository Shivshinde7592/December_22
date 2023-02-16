package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResetPasswordPage {
	
	WebDriver driver;
	By cancelButton=By.xpath("//button[text()=' Cancel ']");
   By Resetpassword=By.className(" orangehrm-forgot-password-button--reset");
	
	
	
	public ResetPasswordPage(WebDriver driver)
	{
		this.driver=driver;
	}

	public boolean navigateResetPasswordPage () 
	{
        boolean flag;
        
        try {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(Resetpassword));
			flag=true;
		}
		catch(Exception e) {
        flag=false;
		
		}
			return flag;
		}
	
		public String gettext()
		{
			return driver.findElement(Resetpassword).getText();
		}
	

	public boolean iscancelButtonpresent()
	{
		boolean flag;
		try {
			WebDriverWait wait= new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.presenceOfElementLocated(cancelButton));
			flag= true;
		}
		catch(NoSuchElementException e)
		{
			flag=false;
		}
		return flag;
	}
	
	public LoginPage clickOnCancelButton()
	{
		driver.findElement(cancelButton).click();
		return new LoginPage(driver);
	}
		
		
	}	
	
	

