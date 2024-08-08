package Intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class1 {

	public static void main(String[] args) {
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\2RIN\\eclipse-workspace\\Selenium\\target\\driver" );
	WebDriverManager.chromedriver().setup();//when driver not support we can use WebDriverManager
	WebDriver driver=new ChromeDriver();
	//String url="https://www.facebook.com/";// open url -using this method also
	//driver.get(url);
    driver.get("https://www.facebook.com/");//its wait for page load
	driver.navigate().to("https://www.facebook.com/");// its also open url
	//and its does not wait for page load 
	driver.manage().window().maximize();
	driver.manage().window().minimize();
	String source= driver.getPageSource();// give current pagesource
	System.out.println(source);
	String curren= driver.getTitle();// give cuurent title
	System.out.println(curren);
	//driver.quit();// its close the webapp
	//driver.close();//its close the current webpage or url
	
	}
}
