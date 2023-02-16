package util;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtils {
	
	static Logger Log = Logger.getLogger(ElementUtils.class.getName());
	
	WebDriver driver;
	
	 public ElementUtils(WebDriver driver)
	{
		this.driver = driver;
	}

	public void doclick(By locator)
	{
		Log.info("Inside doclick Method");
		Log.info("Locator :" + locator);
		//System.out.println("Inside doclick Method");
		//System.out.println("Locator :" + locator);
		try {
		driver.findElement(locator).click();
		//System.out.println("click successful");
		Log.info("click successful");
		}
		catch(Exception e)
		{
			//System.out.println("Click not successful");
			Log.error("Click not successful");
			Log.error(e.toString());
			//e.printStackTrace();
		}
	}
	public void doclick(String xpath)
	{
		Log.info("Inside doclick Method");
		Log.info("Xpath :" + xpath);
		//System.out.println("Inside doclick Method");
		//System.out.println("Xpath :" + xpath);
		try {
		driver.findElement(By.xpath(xpath)).click();
		//System.out.println("click successful");
		Log.info("click successful");
		}
		catch(Exception e)
		{
			//System.out.println("Click not successful");
			Log.error("Click not successful");
			Log.error(e.toString());
			//e.printStackTrace();
		}
	}
	public void doclick(WebElement ele)
	{
		Log.info("Inside doclick Method with WebElement");
		//System.out.println("Inside doclick Method with WebElement");
		
		try {
		ele.click();
		//System.out.println("click successful");
		Log.info("click successful");
		}
		catch(Exception e)
		{
			Log.info("Click not successful");
			//System.out.println("Click not successful");
			Log.error(e.toString());
			//e.printStackTrace();
		}
	}
	
	
	public void enterText(By locator, String text)
	{
		Log.info("Inside doclick Method");
		Log.info("Locator :" + locator);
		//System.out.println("Inside doclick Method");
		//System.out.println("Locator :" + locator);
		try {
			driver.findElement(locator).sendKeys(text);
			//System.out.println("Text Entered successfully");
			Log.info("Text Entered successfully");
			}
			catch(Exception e)
			{
				Log.error("Text not Entered successfully");
				//System.out.println("Text not Entered successfully");
				Log.error(e.toString());
				//e.printStackTrace();
			}
	}
	
	 public boolean isElementPresent(By locator, int time)
	 {
		 
		 System.out.println("Inside isElementPresent Method");
		 System.out.println("Locator :"+ locator);
		 try 
			{
				WebDriverWait wait = new WebDriverWait(driver,time);
				WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
				//System.out.println("Element is Present within " + time);
				Log.info("Element is Present within " + time);
				 return true;
					
			}
			catch(TimeoutException e)
			{
				Log.error("Element is not Present");
				//System.out.println("Element is not Present");
				Log.error(e.toString());
				//e.printStackTrace();
				return false;
			}
	 }
	     
	 public String getTitle(By locator,By locator1,int time)
	 {
		 System.out.println("Inside get title");
		 System.out.println("Locator :" + locator);
		 
		 WebDriverWait wait = new WebDriverWait(driver,time);
		 String str1= driver.findElement(locator).getText();
			String str2=driver.findElement(locator1).getText();
			
			return str1+" / "+str2;
		}
	 }

		
	
	
	

