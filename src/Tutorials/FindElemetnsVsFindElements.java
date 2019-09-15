package Tutorials;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElemetnsVsFindElements {
	
	static WebDriver dr=new ChromeDriver();
	@Test
	public void test() throws InterruptedException {
		
		dr.get("http://demo.guru99.com/test/ajax.html");
		dr.manage().window().maximize();
		List<WebElement> elements = dr.findElements(By.name("name"));
		for (int i=0;i<elements.size();i++)
		{
			System.out.println(elements.get(i).getAttribute("id"));
		}
		dr.findElement(By.id("yes")).click();
		Thread.sleep(5000);
	}
	
	@AfterClass
	public static void  Cleanup()
	{
		dr.quit();
	}
	

}
