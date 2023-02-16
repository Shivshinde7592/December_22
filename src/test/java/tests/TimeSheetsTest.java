package tests;

import testbase.TestBase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Attendence;
import pages.HomePage;
import pages.LoginPage;
import pages.TimeTimeSheetsPage;
public class TimeSheetsTest extends TestBase {
	
	
	
	@Test
	public void timesheetsTest1() throws InterruptedException
	{
		LoginPage login = new LoginPage(driver);
		HomePage homePage = login.doLogin("Admin", "admin123");
		Assert.assertEquals(homePage.isUserNamePresent(), true);
		TimeTimeSheetsPage timesheetspage = homePage.clickTimeLink();
		String actual=timesheetspage.getTitle();
		Assert.assertEquals(actual,"Time / Timesheets") ;
		
		 Attendence attpage=timesheetspage.clickMyReports();
		 
		 boolean actualflag=attpage.isHeaderCorrect("Attendance","Attendance");
		 Assert.assertEquals(actualflag,true) ;
	}

}
