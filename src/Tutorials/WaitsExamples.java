package Tutorials;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr=new  ChromeDriver();
		String base="http://demo.guru99.com";
		dr.get("http://ebay.com");
		
		
		//Implicit wait is dynamic and if element loads before given timeout, it will go to next statement. It's global to all steps in this test
		dr.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		dr.findElement(By.cssSelector("input[name='_nkw']")).sendKeys("Samsung Galaxy S10");
		
		//explicit wait is local to one element only
		WebDriverWait wait=new WebDriverWait(dr,40);
		
		WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[type*='submit']")));

		
		ele.click();
		dr.quit();
			
	}

}
