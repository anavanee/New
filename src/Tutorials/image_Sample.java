package Tutorials;

import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class image_Sample {

	static WebDriver dr=new ChromeDriver();
	@Test
	public void test() throws InterruptedException {
		
		dr.get("http://facebook.com");
		String expectedTitle=dr.getTitle();
		System.out.println("Title:"+expectedTitle);
		dr.findElement(By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div/div/div[1]/h1/a")).click();
		
		if(!dr.getTitle().equalsIgnoreCase(expectedTitle))
			assertTrue("Title not matched",false);
		
		
	}
	
	@AfterClass
	public static void  Cleanup()
	{
		dr.quit();
	}
}