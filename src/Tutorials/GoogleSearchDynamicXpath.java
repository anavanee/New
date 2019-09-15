package Tutorials;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchDynamicXpath {
	

		public static void main(String[] args) throws InterruptedException {
			
			WebDriver dr=new ChromeDriver();
				dr.manage().window().maximize();
				dr.manage().deleteAllCookies();
				dr.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
				dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				//dr.get("https://www.spicejet.com/InsuranceProductDescription.aspx");
				dr.get("http://google.com");
				dr.findElement(By.name("q")).sendKeys("Java");
				
		       //// Actions act=new Actions(dr);
		      //  act.moveToElement(dr.findElement(By.xpath("//*[@id='highlight-addons']"))).build().perform();
		        
		      //  Thread.sleep(3000);
				//List<WebElement> list=dr.findElements(By.xpath("//td[contains(text(),'Purpose of travel')]/parent::tr//following-sibling::tr//td[1]"));
				
				List<WebElement> list=dr.findElements(By.xpath("//ul[@role='listbox']//li//descendant::div[@class='sbl1']"));
				System.out.println("List.size:"+list.size());
				for (WebElement ele : list)
				{
					System.out.println(ele.getText());
					
					if(ele.getText().contains("java jdk")) {
						ele.click();
						break;
					}
				}
				
				
				//dr.findElement(By.xpath("//a[contains(text(),'Seat + Meal Combo')]"));
				
				////preceding-sibling::td
		}

	}



