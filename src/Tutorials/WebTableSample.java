package Tutorials;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableSample {
	WebDriver driver=new ChromeDriver();
	@Ignore
	
	public void test() {
		
		
		
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		WebElement cell=driver.findElement(By.xpath("//table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/table[1]/tbody/tr[3]/td/table/tbody/tr[4]/td[1]/font"));
		System.out.println(cell.getText());
		driver.close();
		
		
	}
	
	@Test
	public void DynamicWebTablle()
	{
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		
      		WebElement tableBody=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody"));
      		
      		List<WebElement> rows = tableBody.findElements(By.tagName("tr"));
      		System.out.println("Rows Count:"+rows.size());
      		double max=0.00;
      		for (int i=0;i<rows.size();i++)
      		{
      			List<WebElement> col=rows.get(i).findElements(By.tagName("td"));
      			//System.out.println("Column Count:"+col.size());
      			
      			String price=col.get(3).getText();
      			double item=Double.valueOf(price);
      			
      			//find max value from price column (4 th column)
      			if(item>max)
      				max=item;
      			
      			//to print all cell values
			/*
			 * for (int j=0;j<col.size();j++) { System.out.println("Cell Value["+i +"]["+j
			 * +"]:"+col.get(j).getText()); }
			 */
      			
      		}
      		
      		System.out.println("Max Pricea:"+max);
      		
	}

}
