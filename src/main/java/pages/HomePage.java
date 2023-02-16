package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.ElementUtils;

public class HomePage {
	
	ElementUtils elementutils;

	WebDriver driver;
	//Page Elements
	By userName = By.className("oxd-userdropdown-name");
	
	By allLinks = By.className("oxd-main-menu-item--name");
	
	By timelink = By.xpath("//span[text()='Time']");
	
	By Adminlink = By.xpath("//span[text()='Admin']");
	
	//Constructor
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	     elementutils= new ElementUtils(driver);
	}
	
	
	//Page Actions
	public boolean isUserNamePresent()
	{
		return elementutils.isElementPresent(userName, 15);
	}
	
	public String getUserName()
	{
		return driver.findElement(userName).getText();
	}
	
	public ArrayList<String> getLinks()
	{
		ArrayList<String> texts = new ArrayList<String>();
	    List<WebElement> list = driver.findElements(allLinks);
		
		for(WebElement e: list)
		{
			texts.add(e.getText());
		}
		return texts;
	}


	public TimeTimeSheetsPage clickTimeLink()
	{
		elementutils.doclick(timelink);
		//driver.findElement(timelink).click();
		return new TimeTimeSheetsPage(driver);
	}
}
	
	
	
	
	
	

//	public AdminUserManagement clickAdminLink() 
//	{	
//		WebDriverWait wait = new WebDriverWait(driver,10);
//		WebElement element= wait.until(ExpectedConditions.presenceOfElementLocated(Adminlink));
//		element.click();
////	
//		return new AdminUserManagement(driver);
//	}



	
	
