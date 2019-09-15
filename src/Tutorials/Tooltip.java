package Tutorials;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Tooltip {
	WebDriver dr=new ChromeDriver();
	@Ignore
	public void staticTooltip()
	{
		
		
		dr.get("http://demo.guru99.com/test/social-icon.html");
		dr.manage().window().maximize();
		WebElement ele = dr.findElement(By.xpath("//*[@id=\"top-bar\"]/div/div/div[2]/div/a[4]"));
		System.out.println(ele.getAttribute("Title"));
		dr.quit();
	}
	

	@Test
	public void dynamicTooltip()
	{
		dr.get(" http://demo.guru99.com/test/tooltip.html");
		dr.manage().window().maximize();
		WebElement download = dr.findElement(By.xpath("//*[@id='download_now']"));
		
		Actions act=new Actions(dr);
		act.moveToElement(download).clickAndHold().build().perform();
		System.out.println(dr.findElement(By.xpath("//*[@id='demo_content']/div/div/div")).getText());
		
		
		
		
	}
}
