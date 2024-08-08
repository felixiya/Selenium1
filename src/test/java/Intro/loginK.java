package Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class loginK {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\2RIN\\eclipse-workspace\\Selenium\\target\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("8695352365");
		driver.findElement(By.id("pass")).sendKeys("Karthick");
	    driver.findElement(By.tagName("button")).click();
	    
	  System.setProperty("webdriver.chrome.driver",
			  "C:\\Users\\2RIN\\eclipse-workspace\\Selenium\\target\\driver\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  driver.findElement(By.name("q")).sendKeys("dress");
	  
	} 

}
