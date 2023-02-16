package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminUserManagement {
	
    WebDriver driver;
    
	By header1 = By.className("oxd-topbar-header-breadcrumb-module");
	
	By header2 = By.className("oxd-topbar-header-breadcrumb-level");
	
	//By Admin = By.className("oxd-main-menu-item active"); 
    
	
	
   public AdminUserManagement(WebDriver driver)
   {
	   this.driver = driver;
   }
   
   public String getTitle()
   {
	   WebDriverWait wait=new WebDriverWait(driver,10);
	   wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(header1));
		String str1= driver.findElement(header1).getText();
		String str2=driver.findElement(header2).getText();
		
		return str1+str2;
   }
   
}
