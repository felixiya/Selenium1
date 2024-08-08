package Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Acts {
	
	public static void main(String[] args) {
		
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\2RIN\\eclipse-workspace\\Selenium\\target\\driver\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.get("https://www.flipkart.com/account/login");
       //driver.get("https://www.leafground.com/drag.xhtml");
      WebElement move = driver.findElement(By.xpath("//span[text()='Electronics']"));
      WebElement w= driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']"));
     WebElement r=driver.findElement(By.xpath("//span[text()='Women']"));
   // WebElement drag1= driver.findElement(By.id("form:drag_content"));
   //  WebElement drag2= driver.findElement(By.id("form:drop"));
      
      
      Actions a=new Actions(driver);
       a.moveToElement(move).perform();
      a.sendKeys(w, "felixiya").perform();
      a.doubleClick().build().perform();
      a.contextClick(r).perform();
      // a.dragAndDrop(drag1, drag2).build().perform();
      
      
      
	}

}
