package UtilsLayer;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import HelperLayer.ResentPlayedSongs;

public class ExtentReportSetUp extends ResentPlayedSongs {
	public static WebDriver driver;
	public ExtentReportSetUp(int capacity) {
		super(capacity);
		
	}
	
	public static String currentDateAndTime() {
		return new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());
	}

	public static ExtentReports extentSetUp(String name) {
		ExtentSparkReporter extentReporter = new ExtentSparkReporter(
				System.getProperty("user.dir") + "\\Reports\\" + name + currentDateAndTime() + ".html");
		ExtentReports extentReports = new ExtentReports();
		extentReports.attachReporter(extentReporter);
		return extentReports;
	}

	public static String passScreenshot(String name) {
		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		String dist = System.getProperty("user.dir") + "\\PassScreenshot\\" + name + currentDateAndTime() + ".png";

		try {
			FileUtils.copyFile(f, new File(dist));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return dist;
	}

	public static String failScreenshot(String name) {
		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		String dist = System.getProperty("user.dir") + "\\FailScreenshot\\" + name + currentDateAndTime() + ".png";

		try {
			FileUtils.copyFile(f, new File(dist));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return dist;
	}

}
