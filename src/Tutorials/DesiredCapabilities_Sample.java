package Tutorials;

import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
public class DesiredCapabilities_Sample {
	
	@Test 
	public void Test()
	{
		
		//WebDriver dr=new ChromeDriver();
		/*
		 * DesiredCapabilities capabilities =DesiredCapabilities.chrome();
		 * 
		 * System.out.println("Platform:"+capabilities.getPlatform());
		 * System.out.println("getBrowserName:"+capabilities.getBrowserName());
		 * System.out.println("getVersion:"+capabilities.getVersion());
		 * capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
		 * capabilities.setBrowserName("chrome");
		 * capabilities.setPlatform(Platform.WIN10);
		 * //capabilities.setCapability(ChromeDriver., value);
		 * System.out.println("Paltform:"+capabilities.getPlatform()); 
		 * WebDriver dr=new ChromeDriver(capabilities);
		 */
		
		
		//explore more on options for Chrome since DesiredCapabilities deprecated for chrome
		ChromeOptions options = new ChromeOptions();
		
		
	}

}
