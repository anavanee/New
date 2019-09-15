package Tutorials;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class flipcartSample {
	public static WebDriver driver;
	
	@Test
	public  void initialize() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pavit\\eclipse-workspace\\Sample\\chromedriver.exe");
		
		DesiredCapabilities cap=new DesiredCapabilities();
		//cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		//cap.setCapability(CapabilityType.PLATFORM_NAME, Platform.WIN10);
		ChromeOptions opt=new ChromeOptions();
		opt.merge(cap);
		driver=new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		
		System.out.println(driver.manage().window().getSize());
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Electronics']"))).build().perform();
		
		WebElement Mobiles=driver.findElement(By.xpath("//a[text()='Mobiles' and @href='/mobile-phones-store?otracker=nmenu_sub_Electronics_0_Mobiles']"));
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", Mobiles);
		//driver.findElement(By.cssSelector("a:contains('Mobiles')")).click();
		
		driver.findElement(By.name("q")).sendKeys("Gionee",Keys.ENTER);
		Thread.sleep(2000);
		WebElement networkType=driver.findElement(By.xpath("//div[text()='Network Type']"));
		js.executeScript("arguments[0].scrollIntoView(true);",networkType);
		js.executeScript("arguments[0].click();", networkType);
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		
		//wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[text()='4G' and @class='_1GEhLw']//preceding-sibling::div")));
		WebElement fourG=driver.findElement(By.xpath("//div[text()='4G' and @class='_1GEhLw']//preceding-sibling::div"));
		js.executeScript("arguments[0].scrollIntoView(true);",fourG);
		js.executeScript("arguments[0].click();", fourG);
		
		//WebElement networkType=driver.findElement(By.xpath("//div[text()='4G' and @class='_1GEhLw']//preceding-sibling::div")).click();
		
		Thread.sleep(2000);
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='_3wU53n']"));
		
		System.out.println("******Phone List Size******" + list.size());
		System.out.println("******Phone Names******");
		for (WebElement ele:list)
		{
			System.out.println(ele.getText());
		}
		
		 fourG=driver.findElement(By.xpath("//div[@class='_3UZZGt']//preceding-sibling::div"));
		js.executeScript("arguments[0].scrollIntoView(true);",fourG);
		js.executeScript("arguments[0].click();", fourG);
		WebElement fourGB=driver.findElement(By.xpath("//div[@class='_1GEhLw' and text()='4 GB']//preceding-sibling::div"));
		js.executeScript("arguments[0].scrollIntoView(true);",fourGB);
		js.executeScript("arguments[0].click();", fourGB);
		
		WebElement threeGB=driver.findElement(By.xpath("//div[@class='_1GEhLw' and text()='3 GB']//preceding-sibling::div"));
		js.executeScript("arguments[0].scrollIntoView(true);",threeGB);
		js.executeScript("arguments[0].click();", threeGB);
		
		Thread.sleep(2000);
		List<WebElement> list1=driver.findElements(By.xpath("//div[@class='_3wU53n']"));
		
		System.out.println("******Phone List Size******" + list1.size());
		System.out.println("******Phone Names******");
		for (WebElement ele:list1)
		{
			System.out.println(ele.getText());
		}
	}

}
