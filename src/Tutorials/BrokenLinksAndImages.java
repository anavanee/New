package Tutorials;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class BrokenLinksAndImages {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver dr=new  ChromeDriver();
		String base="http://demo.guru99.com";
		dr.get(base+"/test/newtours/");
		//get all elements with tag a(Links)
		List<WebElement> list=dr.findElements(By.tagName("a"));
		//get all elements with tag img(Images) and add to list
		list.addAll(dr.findElements(By.tagName("img")));
		System.out.println("Total Links and Images:"+list.size());
	 List<WebElement> activeLinks = new ArrayList<WebElement>();
		//check if href has some valid value (Start with http and https and not null)
		for (WebElement ele: list)
		{
			if(ele !=null)
			{
			if(ele.getAttribute("href") !=null && (!ele.getAttribute("href").contains("javascript:")))
					{
				activeLinks.add(ele);
					}
			}
		}
		System.out.println("Total Active Links and Images:"+activeLinks.size());
		
		
		//parse links one by one
		
		for (WebElement ele1:activeLinks )
		{	
			URL url=new URL(ele1.getAttribute("href"));
			
			HttpURLConnection connect=(HttpURLConnection) (url.openConnection());
			connect.connect();
			int code=connect.getResponseCode();
			if(code>=400)
			  System.out.println("Link "+ele1.getAttribute("href") +"is Broken , Response Code is ----" +code);
			else 
				 System.out.println("Link "+ele1.getAttribute("href") +"is OK , Response Code is ----" +code);
		}
		dr.quit();	
	}
	


}
