package Tutorials;

import java.util.Set;

import org.junit.AfterClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Xpath_Sample {
	
	static WebDriver dr=new ChromeDriver();
	@Test
	public void startsContainsTest() throws InterruptedException {
		
		dr.get("http://demo.guru99.com/test/guru99home/");
		//String Title=dr.getTitle();
		//String handle1=dr.getWindowHandle();
		//System.out.println("Title:"+dr.getTitle());
		System.out.println(dr.getPageSource());
		dr.manage().window().maximize();
		
		  //starts-with and @id locator 
		dr.findElement(By.xpath(
		  "//*[starts-with(@id,\"rt-\")]/div/div[1]/div/div/div/div[2]/div[1]/div/div/div/div/div[1]/div/div/a/i"
		  )).click(); dr.navigate().back(); WebDriverWait wait=new
		  WebDriverWait(dr,10);
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("rt-feature"))
		  );
		  
		  //contains and @id locator
		  dr.findElement(By.xpath(
		  "//*[contains(@id,\"rt-\")]/div/div[1]/div/div/div/div[2]/div[1]/div/div/div/div/div[1]/div/div/a/i"
		  )).click();
		  
		  dr.navigate().back();
		  //contains and @href Thread.sleep(1000); dr.navigate().back();
		  Thread.sleep(1000);
		  dr.findElement(By.xpath("//a[contains(@href,SELENIUM)]")).click();
		 

		//To scroll down 1000 pixels from top
		  JavascriptExecutor js = (JavascriptExecutor) dr;
		  js.executeScript("window.scrollBy(0, 1000)"); Thread.sleep(3000);
		 
		// js.executeScript("arguments[0].scrollIntoView();",  dr.findElement(By.xpath("//a[contains(@href,SELENIUM)]")));
	
		  
		  //to get all window handles and print getTitle
		 Set <String> handles=dr.getWindowHandles(); 
		 for(String handle:handles ) {
		 System.out.println("Title:"+dr.switchTo().window(handle).getTitle()); }
		 
		 
		  dr.close();
		 
		
	}
	
	@Ignore
	public void contains_following() throws InterruptedException {
		
		dr.get("http://demo.guru99.com/test/guru99home/");
		dr.manage().window().maximize();
		dr.findElement(By.xpath("//*[contains(@id,\"rt-\")]/div/div[1]/div/div/div/div[2]/div[1]/div/div/div/div/div[1]/div/div/a/i")).click();
	
	}
	
	
	@AfterClass
	public static void  Cleanup()
	{
		dr.quit();
	}
	 

}
