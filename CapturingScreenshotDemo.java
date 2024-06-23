package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium. TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CapturingScreenshotDemo {
	public static void main(String[] args) throws IOException {
		
		Date currentdate new Date();
		System.out.println(currentdate);
		String screenshotFilename currentdate.toString().replace("", "").replace(":", "-");
		System.out.println(screenshotFilename);

			WebDriverManager.chromedriver().setup(); 
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.getcalley.com/");
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs (OutputType.FILE);
            FileUtils.copyFile(screenshortFile, new File(".//screenshort/screen.png"));"));"
            		
            WebDriverManager.chromedriver().setup(); 
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.getcalley.com/calley-call-from-browser/");
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs (OutputType.FILE);
            FileUtils.copyFile(screenshortFile, new File(".//screenshort/screen.png"));"));"
            		
            WebDriverManager.chromedriver().setup(); 
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.getcalley.com/calley-pro-features/");
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs (OutputType.FILE);
            FileUtils.copyFile(screenshortFile, new File(".//screenshort/screen.png"));"));"
            		
            WebDriverManager.chromedriver().setup(); 
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.getcalley.com/best-auto-dialer-app/");
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs (OutputType.FILE);
            FileUtils.copyFile(screenshortFile, new File(".//screenshort/screen.png"));"));"
            		
            WebDriverManager.chromedriver().setup(); 
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.getcalley.com/how-calley-auto-dialer-app-works/");
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs (OutputType.FILE);
            FileUtils.copyFile(screenshortFile, new File(".//screenshort/screen.png"));"));
	}
}
