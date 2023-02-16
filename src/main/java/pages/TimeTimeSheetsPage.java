package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.ElementUtils;

public class TimeTimeSheetsPage {
	
	WebDriver driver;
	ElementUtils elementutils;
	
    By header1 = By.className("oxd-topbar-header-breadcrumb-module");
	
	By header2 = By.className("oxd-topbar-header-breadcrumb-level");
	
	By attendance = By.xpath("//span[text()='Attendance ']");
	
	By myReports  = By.xpath(" //a[text()='My Records']");
	
	
	public TimeTimeSheetsPage(WebDriver driver)
	{
		this.driver=driver;
		elementutils = new ElementUtils(driver);
	}
	
	public String getTitle()
	{
	  return elementutils.getTitle(header1,header2,10);
//		
//		WebDriverWait wait=new WebDriverWait(driver,10);
//		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(header1));
//		String str1= driver.findElement(header1).getText();
//		String str2=driver.findElement(header2).getText();
//		
//		return str1+" / "+str2;
	}
	
	public Attendence clickMyReports()
	{
		elementutils.doclick(attendance);
		elementutils.doclick(myReports);
//		driver.findElement(attendance).click();
//		driver.findElement(myReports).click();
		
		return new Attendence(driver);
	
		
	}

}
