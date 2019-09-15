package Tutorials;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_link {

	@Ignore
	public void Test() throws IOException
	{
		
		WebDriver dr=new  ChromeDriver();
		String base="http://demo.guru99.com";
		dr.get(base+"/test/newtours/");
			
			dr.manage().window().maximize();
			List<WebElement> links = dr.findElements(By.tagName("a"));
			int brokenCount=0;
			int workignLinkCount=0;
			for (WebElement e: links) {
				String href=e.getAttribute("href");
				System.out.println("Href:"+href);
				if(!href.startsWith(base)) {
					System.out.println("Website base URL is different");
					continue;
				} else if (href.isBlank() || href.isEmpty()|href==null)
				{
					System.out.println("Website  URL is either Empty or null");
					continue;
				}
				else
				{
					HttpURLConnection huc=(HttpURLConnection) (new URL(href).openConnection());
					huc.setRequestMethod("HEAD");
					huc.connect();
					if(huc.getResponseCode() >400)
					{
						System.out.println("Website  URL "+href+" is Broken");
						brokenCount++;
					} else
					{
						System.out.println("Website  URL "+href+" is Working fine");
						workignLinkCount++;
					}
				}
				
			}
			System.out.println("brokenCount:"+brokenCount);
			System.out.println("workignLinkCount:"+workignLinkCount);
			
		dr.quit();
	}
	
	@Test
	public void TestUnderConstructedPages()
	{
		String baseUrl = "http://demo.guru99.com/test/newtours/";					
      //  System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");					
        WebDriver driver = new ChromeDriver();					
        		
        String underConsTitle = "Under Construction: Mercury Tours";					
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);					

			driver.get(baseUrl);	
			driver.manage().window().maximize();
        List<WebElement> linkElements = driver.findElements(By.tagName("a"));							
        String[] linkTexts = new String[linkElements.size()];							
			int					i = 0;					

			//extract the link texts of each link element		
			for (WebElement e : linkElements) {							
			linkTexts[i] = e.getText();							
			i++;			
        }		

			//test each link		
			for (String t : linkTexts) {							
			driver.findElement(By.linkText(t)).click();					
			if (driver.getTitle().equals(underConsTitle)) {							
                System.out.println("\"" + t + "\""								
                        + " is under construction.");			
            } else {			
                System.out.println("\"" + t + "\""								
                        + " is working.");			
            }		
			driver.navigate().back();			
        }		
			driver.quit();			
    }		

	
}
