package Bank;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day1 {

	@Test
	public void Test() {
	//Setup Firefox driver    	
	WebDriver driver = new ChromeDriver();
	String baseUrl = "http://www.demo.guru99.com/V4/";
	
	// launch Firefox and direct it to the Base URL
	driver.get(baseUrl);


    // Enter username
    driver.findElement(By.name("uid")).sendKeys("mngr1336");

    // Enter Password
    driver.findElement(By.name("password")).sendKeys("dAnavUq");

    // Click Login
    driver.findElement(By.name("btnLogin")).click();


    }


}

