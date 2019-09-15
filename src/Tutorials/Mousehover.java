package Tutorials;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver dr=new ChromeDriver();
			dr.manage().window().maximize();
			dr.manage().deleteAllCookies();
			dr.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//dr.get("https://www.spicejet.com/InsuranceProductDescription.aspx");
			dr.get("http://spicejet.com");
			   Actions act=new Actions(dr);
	        act.moveToElement(dr.findElement(By.xpath("//*[@id='highlight-addons']"))).build().perform();
	        
	       Thread.sleep(3000);
	       dr.findElement(By.xpath("//a[contains(text(),'Visa Services')]")).click();
	
	}

}
