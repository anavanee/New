package Tutorials;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_operations {
	
	static WebDriver dr=new ChromeDriver();
	@Ignore
	public void test() throws InterruptedException {
		
		dr.get("http://demo.guru99.com/test/upload/");
		dr.manage().window().maximize();
		dr.findElement(By.id("uploadfile_0")).sendKeys("C:\\temp\\text.txt");
		
		
		dr.findElement(By.id("terms")).click();
		dr.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
		
		Thread.sleep(5000);
		dr.close();
	}

	@Test
	public void File_Download() throws InterruptedException {
		
	
		        
		      
		                String baseUrl = "http://demo.guru99.com/test/yahoo.html";
		        
		        dr.get(baseUrl);
		        WebElement downloadButton = dr.findElement(By
		        .id("messenger-download"));
		        String sourceLocation = downloadButton.getAttribute("href");
		        System.out.println("sourceLocation:"+sourceLocation);
		        String wget_command = "cmd /c C:\\temp\\Wget\\wget.exe -P C:\\temp --no-check-certificate http://demo.guru99.com/test/msgr11us.exe";

		        try {
		        Process exec = Runtime.getRuntime().exec(wget_command);
		        int exitVal = exec.waitFor();
		        System.out.println("Exit value: " + exitVal);
		        } catch (IOException ex) {
		        System.out.println(ex.toString());
		        }
		        dr.close();
		        }
		        
		
	
	@AfterClass
	public static void  Cleanup()
	{
		dr.quit();
	}
	
	
	

}
