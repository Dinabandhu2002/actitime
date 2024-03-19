package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
public class Screenshot implements ITestListener
{
	 public  void onTestFailure(ITestResult result) 
	 {
		    TakesScreenshot ts=(TakesScreenshot)Basetest.driver;
		    File srcfile = ts.getScreenshotAs(OutputType.FILE);
		    File  descfile=new File("./failedscreenshot/failed.png");
		   
		   try
		   {
			   	FileHandler.copy(srcfile, descfile);
		   	} 
		   catch (IOException e) 
		   {
		
			
		   	}
		   
	 }
	 public void onTestSkipped(ITestResult result)
	 {
		 TakesScreenshot ts=(TakesScreenshot)Basetest.driver;
		    File srcfile=ts.getScreenshotAs(OutputType.FILE);
		    File  descfile=new File("./skipscreenshort/skip.png");
		   
		   try
		   {
			   
			   FileHandler.copy(srcfile, descfile);
		   } 
		   catch (IOException e) 
		   {
		
			
		   	}
	  }
	
}
