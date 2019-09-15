package Tutorials;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		
		Set<String> s=driver.getWindowHandles();
		
		Iterator<String> it=s.iterator();
		String parent= it.next();
		String child1= it.next();
		String child2= it.next();
		driver.switchTo().window(child2);
		driver.findElement(By.name("emailid")).sendKeys("test@test.com");
		Thread.sleep(3000);
		driver.findElement(By.name("btnLogin")).click();
		driver.close();
		driver.switchTo().window(child1);
		driver.close();
		driver.switchTo().window(parent);
	}

}
