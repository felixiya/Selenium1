package Intro;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotAndScreen {
	public static void main(String[]args) throws AWTException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\2RIN\\eclipse-workspace\\Selenium\\target\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.id("email")).sendKeys("felixiya");
		WebElement a=driver.findElement(By.id("email"));
		a.sendKeys("felixiya");
		Actions ac=new Actions(driver);
		ac.doubleClick(a).perform();
		ac.contextClick().build().perform();
		
		
	    Robot r = new Robot();//import robot & throws -AWTException
		
		    for(int i=0;i<2;i++) {
		    r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		    }
	        r.keyPress(KeyEvent.VK_ENTER);
		    r.keyRelease(KeyEvent.VK_ENTER);
		    
		    r.keyPress(KeyEvent.VK_TAB);
		    r.keyRelease(KeyEvent.VK_TAB);
		    
		    r.keyPress(KeyEvent.VK_CONTROL);
		    r.keyPress(KeyEvent.VK_V);
		    r.keyRelease(KeyEvent.VK_V);
		    r.keyRelease(KeyEvent.VK_CONTROL);
		    
		    TakesScreenshot  ts=(TakesScreenshot)driver;
		   File sh=ts.getScreenshotAs(OutputType.FILE);
		   File f= new File("C:\\Users\\2RIN\\eclipse-workspace\\Selenium\\takes\\Image.png");
		   FileUtils.copyFile(sh, f);// its throws exception - so import IOException
		    }

}
