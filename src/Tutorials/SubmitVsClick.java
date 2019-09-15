package Tutorials;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitVsClick {

	static WebDriver dr=new ChromeDriver();
	@Test
	public void test() throws InterruptedException {
		
		dr.get(" http://demo.guru99.com/test/login.html");
		dr.manage().window().maximize();
		WebElement email = dr.findElement(By.name("email"));
		email.sendKeys("abcd@gmail.com");
		WebElement pwd = dr.findElement(By.name("passwd"));
		pwd.sendKeys("abcdefghlkjl");
		pwd.submit(); // submit can be called from any text or button on the form , it will submit the form
		WebElement signon = dr.findElement(By.name("SubmitLogin"));
		signon.click();// click can be called only on button to submit the form
		
		Thread.sleep(5000);
	}
	
	@AfterClass
	public static void  Cleanup()
	{
		dr.quit();
	}
	
	 
}
