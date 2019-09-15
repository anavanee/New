package Tutorials;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.awt.event.KeyEvent;

import org.junit.AfterClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsSample {

	static WebDriver dr=new ChromeDriver();
	 @Ignore
	public void test() throws InterruptedException {
		
		dr.get("http://demo.guru99.com/test/newtours/");
	Actions act=new Actions(dr);
	WebElement homeLink=dr.findElement(By.linkText("Home"));
	WebElement area=dr.findElement(By.xpath("//html/body/div"
            + "/table/tbody/tr/td"
            + "/table/tbody/tr/td"
            + "/table/tbody/tr/td"
            + "/table/tbody/tr"));  
	Action mouseOver=act.moveToElement(homeLink).build();
	System.out.println("Before MouseOver:"+area.getCssValue("background-color"));
	mouseOver.perform();
	System.out.println("Before MouseOver:"+area.getCssValue("background-color"));
		Thread.sleep(5000);
		dr.close();
	}
	
	@Test
	public void MultipleActions() throws InterruptedException {
		
		dr.get("http://www.facebook.com/");
		dr.manage().window().maximize();
	Actions act=new Actions(dr);
	WebElement email=dr.findElement(By.id("email"));
	WebElement Login=dr.findElement(By.id("u_0_2"));
	Action clickEmail=act.moveToElement(email).click().keyDown(Keys.SHIFT).sendKeys("Hello").keyUp(Keys.SHIFT).doubleClick().contextClick().build();
	clickEmail.perform();
	String BeforeTitle=dr.getTitle();
	Thread.sleep(3000);
	Action doubleclick=act.moveToElement(Login).click().doubleClick().build();	
	doubleclick.perform();
	String AfterTitle=dr.getTitle();
	System.out.println("BeforeTitle"+BeforeTitle);
	System.out.println("AfterTitle"+AfterTitle);
	assertEquals("Title Not Matched",BeforeTitle,AfterTitle);
	Thread.sleep(3000);
	
	}
	@AfterClass
	public static void  Cleanup()
	{
		dr.quit();
	}
}