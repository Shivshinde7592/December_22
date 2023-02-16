package util;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {
	
	
	public static void takeScreenshot(WebDriver driver, String screenshotName)
	{
		String path = System.getProperty("user.dir");
		String filepath = path + "\\screenshots\\" + screenshotName +".jpg";
		System.out.println(filepath);
		
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
		FileUtils.copyFile(file,new File(filepath));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
