package Tutorials;

import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkSample {

	static WebDriver dr=new ChromeDriver();
	@Test
	public void test() throws InterruptedException {
		
		try {
			
		
		
		//dr.navigate().to("http://demo.guru99.com/test/link.html");
		dr.get("http://demo.guru99.com/test/link.html");
		dr.manage().window().maximize();
		
		//Locate by LinkText will identity first match link text if more than one available
		dr.findElement(By.linkText("click here")).click();
		
		Thread.sleep(2000);
		dr.navigate().back();
		//Locate by PartialLinkText will identity first match link text if more than one available
		dr.findElement(By.partialLinkText("here")).click();
		
		Thread.sleep(2000);
		
		dr.navigate().back();
		
		//locate by xpath which will identify unique link
		
		dr.findElement(By.xpath("/html/body/a[1]")).click();
		dr.navigate().back();
		dr.findElement(By.xpath("/html/body/a[2]")).click();
		
		dr.close();
		Thread.sleep(2000);
		
		} catch( NoSuchElementException e)
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void CaseSensitiveLink() throws InterruptedException {
		dr.get("http://newtours.demoaut.com/");
		dr.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(3000);
		dr.navigate().back();
		dr.findElement(By.partialLinkText("Register")).click();
		Thread.sleep(3000);
	}
	@AfterClass
	public static void  Cleanup()
	{
		dr.quit();
	}
	
}
