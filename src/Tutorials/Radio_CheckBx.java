package Tutorials;

import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_CheckBx {
	
	static WebDriver dr=new ChromeDriver();
	@Test
	public void test() throws InterruptedException {
		
		dr.get("http://demo.guru99.com/test/radio.html");
		dr.findElement(By.id("vfb-7-1")).click();
		Thread.sleep(2000);
		dr.findElement(By.id("vfb-7-2")).click();
		Thread.sleep(2000);
		dr.findElement(By.id("vfb-7-3")).click();
		
		
	}
	
	@AfterClass
	public static void  Cleanup()
	{
		dr.quit();
	}
	 

}
