package Tutorials;

import java.util.List;
import java.util.Set;

import org.junit.AfterClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert_Sample {
	
	public static WebDriver dr=new ChromeDriver();
	@Ignore
	public void Test() throws InterruptedException
	{
		//WebDriver dr=new ChromeDriver();
		dr.get("http://demo.guru99.com/test/delete_customer.php");
		dr.manage().window().maximize();
		dr.findElement(By.name("cusid")).sendKeys("53678");
		
		dr.findElement(By.name("submit")).click();
		WebDriverWait wait=new WebDriverWait(dr,10);
		wait.until(ExpectedConditions.alertIsPresent());

			System.out.println("Alert is prsent");
			dr.switchTo().alert().accept();
			
			Thread.sleep(2000);
			dr.close();
		
	}
	
	@Test
	public void Test2() throws InterruptedException
	{
		dr.get("http://demo.guru99.com/popup.php");
		 
		dr.manage().window().maximize();
		String parTitle=dr.getTitle();
		
		String handle=dr.getWindowHandle();
		System.out.println("handle:"+handle);
		dr.findElement(By.linkText("Click Here")).click();
		
		Thread.sleep(2000);
		
		//Not working since Chrome extra tab names Data is opened.
		Set<String> han = dr.getWindowHandles();
		for (String h:han) {
			dr.switchTo().window(h);
			System.out.println("h:"+h);
			System.out.println("Title:"+dr.getTitle());
			if(!handle.equals(h) & !dr.getTitle().contentEquals(""))
			{
				dr.findElement(By.id("emailid")).sendKeys("test@gmail.com");
				dr.findElement(By.name("btnLogin")).click();
				Thread.sleep(3000);
				dr.close();
			}
		}
		dr.switchTo().window(handle);
	}
	
	@AfterClass
	public static void clean()
	{
		dr.quit();
	}

}
