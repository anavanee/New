package Retail;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Retail_Day1 {
	static WebDriver driver=new ChromeDriver();
	
	@BeforeClass
	public static void setUp()
	{
		driver.get(" http://live.guru99.com/index.php/");
	}
	@Test
	public void Test() throws InterruptedException {
		try
		{
			
			
			
			System.out.println(driver.getTitle());
			
			String title=driver.getTitle();
			
			Assert.assertEquals("Title Mismatched", "Home page", title);
			
			driver.findElement(By.xpath("//*[@id=\"nav\"]/ol/li[1]/a")).click();
			
			String title1=driver.getTitle();
			System.out.println(driver.getTitle());
			Assert.assertEquals("Title Mismatched", "Mobile", title1);
			
			Select s=new Select(driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select")));
			s.selectByVisibleText("Name");
			Thread.sleep(5000);
			
			
			/*
			 * if(isAlertPresent(driver)) { System.out.println("Alert Window Found");
			 * //driver.switchTo().alert().accept(); } else {
			 * 
			 * if(driver.getTitle().contentEquals("Guru99 Bank Manager HomePage")) {
			 * System.out.println("getTitle() Matched");
			 * 
			 * } String text=driver.findElement(By.xpath(
			 * "/html/body/table/tbody/tr/td/table/tbody/tr[3]/td")).getText();
			 * System.out.println("text:"+text); }
			 */
			
			
		} catch (NoAlertPresentException e)
		{
			e.printStackTrace();
		}
		
		
		
	}
	@AfterClass
	
	public static void cleanup()
	{
		driver.quit();
	}
	public static boolean isAlertPresent(WebDriver driver) 
	{ 
	    try 
	    { 
	        driver.switchTo().alert(); 
	        return true; 
	    }   // try 
	    catch (NoAlertPresentException Ex) 
	    { 
	        return false; 
	    }   // catch 
	}
	

}
