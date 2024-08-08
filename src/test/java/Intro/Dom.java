package Intro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dom {
	public static void main(String []args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\2RIN\\eclipse-workspace\\Selenium\\target\\driver\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement findElement=driver.findElement(By.id("email"));
		findElement.sendKeys("felixiya");
		Thread.sleep(4000);
		//findElement.clear();
	    // driver.findElement(By.id("email")).sendKeys("felixiya");
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("felixiya");//or this way also we write the element
	   WebElement findElement1=driver.findElement(By.xpath("//input[@id='pass']"));
	    findElement1.sendKeys("feli@231");
	    //driver.findElement(By.xpath("//input[@type='password']")).sendKeys("feli");
	   // driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("felix@134");//or this  way also we write the element
	   WebElement findElemet2=driver.findElement(By.linkText("Log in"));
	   findElemet2.click();
	   // driver.findElement(By.name("login")).click();
	   WebElement findElement3=driver.findElement(By.partialLinkText("Forgot"));
	   findElement3.click();
	   //driver.findElement(By.partialLinkText("Forgotten")).click();
	   String a=findElement.getAttribute("value");
	  System.out.println(a);
	   List<WebElement> findElemts=driver.findElements(By.tagName("a"));
	
	  for(int i=0;i<findElemts.size();i++) {
		  WebElement webelement= findElemts.get(i);
		  String text= webelement.getText();
		 String text1="Privacy Policy";
		System.out.println(text);
		 if(text.equals(text1)) {
			 webelement.click();
			 break;
		 }
			 
	   }
	}

}
