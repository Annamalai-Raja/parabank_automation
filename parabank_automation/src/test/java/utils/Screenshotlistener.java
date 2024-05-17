package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import commonfunctions.CommonFunctions;
public class Screenshotlistener extends CommonFunctions  implements ITestListener{
	

	
	public void captureScreenshot(String methodname) {
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;
	    File file =	screenshot.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("E:\\Portfolio\\org-parabank\\Screenshots\\" + methodname + ".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		ITestListener.super.onTestFailure(result);
		captureScreenshot(result.getName());
	}

}
