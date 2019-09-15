package Tutorials;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectors {
	public static void main(String[] args) throws IOException {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://ebay.com");
		driver.findElement(By.cssSelector("input[name='_nkw']")).sendKeys("Samsung Galaxy S10");
		
		driver.findElement(By.cssSelector("input[type*='submit']")).click();
		
		
	}
}
