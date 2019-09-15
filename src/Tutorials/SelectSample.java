package Tutorials;

import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectSample {

	static WebDriver dr=new ChromeDriver();
	@Test
	public void SingleSelect() throws InterruptedException {
		
		dr.get("http://demo.guru99.com/test/newtours/register.php");
		String expectedTitle=dr.getTitle();
		System.out.println("Title:"+expectedTitle);
		Select sel=new Select(dr.findElement(By.name("country")));
		sel.selectByVisibleText("ANTARCTICA");
		if(sel.isMultiple())
		{
			sel.selectByValue("ARUBA");
		} else
		{
			System.out.println("Only Single Select allowed");
		}
	
	
		if(!dr.getTitle().equalsIgnoreCase(expectedTitle))
			assertTrue("Title not matched",false);
		
		
	}
	
	@Test
	public void MultipleSelect() throws InterruptedException {
		
		dr.get("http://jsbin.com/osebed/2");
		String expectedTitle=dr.getTitle();
		System.out.println("Title:"+expectedTitle);
		Select sel=new Select(dr.findElement(By.id("fruits")));
		if(sel.isMultiple())
		{
			
		
			sel.selectByValue("banana");
			sel.selectByVisibleText("Orange");
			sel.selectByIndex(1);
			Thread.sleep(2000);
			
			sel.deselectAll();
			sel.
			Thread.sleep(2000);
			
		} else
		{
			System.out.println("Only Single Select allowed");
		}
	
	
		if(!dr.getTitle().equalsIgnoreCase(expectedTitle))
			assertTrue("Title not matched",false);
		
		
	}
	
	
	@AfterClass
	public static void  Cleanup()
	{
		dr.quit();
	}
}