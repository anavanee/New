package Tutorials;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	static WebDriver dr=new ChromeDriver();
	@Test
	public void test() throws InterruptedException {
		
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Actions act=new Actions(dr);
        act.moveToElement(dr.findElement(By.xpath("//*[@id='highlight-addons']"))).build().perform();
		dr.findElement(By.linkText("Seat + Meal Combo"));
		
		
	}
			
			

}
