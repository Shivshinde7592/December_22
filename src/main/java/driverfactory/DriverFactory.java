package driverfactory;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import listener.WebDriverListenerClass;


public class DriverFactory {
	
	static Logger Log = Logger.getLogger(DriverFactory.class.getName());
	
	  WebDriver driver;
	
	public  WebDriver init_driver(String browser)
	{
		Log.info("inside init_driver, browser :" + browser);
		if(browser.equals("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 Log.info("Chrome browser initialized");
		}
		else if(browser.equals("FF"))
		{
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
		}
		else if(browser.equals("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Enter correct browser name[chrome,FF]");
			System.exit(0);
		}
		    driver.manage().window().maximize();
		    
		    EventFiringWebDriver eDriver = new EventFiringWebDriver(driver);
		    WebDriverListenerClass driverListener = new WebDriverListenerClass();
		    eDriver.register(driverListener);
		    driver=(WebDriver)eDriver;
		    return driver;
	}
	
	public   WebDriver getDriver()
	{
		return driver;
	}

	}


