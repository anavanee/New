package Tutorials;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;		

public class CalendarDatePickup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().deleteAllCookies();
		dr.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		dr.get("https://www.spicejet.com/");
		WebElement ele=dr.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1"));
		if(!(ele.isSelected())){
			ele.click();
			
		}
		/*
		 * WebDriverWait w=new WebDriverWait(dr,10); WebElement
		 * e1=w.until(ExpectedConditions.presenceOfElementLocated(By.id(
		 * "ctl00_mainContent_ddl_originStation1_CTXT"))); e1.sendKeys("DFW");
		 * e1.sendKeys(Keys.TAB);
		 * 
		 * 
		 * WebElement e2=w.until(ExpectedConditions.presenceOfElementLocated(By.id(
		 * "ctl00_mainContent_ddl_destinationStation1_CTXT"))); e2.sendKeys("MAA");
		 * e2.sendKeys(Keys.TAB);
		 */
		
		WebDriverWait w=new WebDriverWait(dr,10);
		WebElement e3=w.until(ExpectedConditions.presenceOfElementLocated(By.id("ctl00_mainContent_view_date1")));
		String datetoSet="Sun, Aug 25 2019";
		JavascriptExecutor js=((JavascriptExecutor) dr);
		js.executeScript("arguments[0].click();", e3);
	
	    dr.findElement(By.linkText("Next")).click();
	    
	    dr.findElement(By.xpath("//div[@id='ui-datepicker-div']//table//child::td//child::a[text()='18']")).click();
	    WebElement e5=dr.findElement(By.id("ctl00_mainContent_view_date2"));
		js.executeScript("arguments[0].click();", e5);
		 dr.findElement(By.xpath("//div[@id='ui-datepicker-div']//table//child::td//child::a[text()='25']")).click();
		 
		/*
		 * WebElement dateWidget =
		 * dr.findElement(By.xpath("/html/body/div[2]/div[2]/table/tbody"));
		 * 
		 * List<WebElement> rows=dateWidget.findElements(By.tagName("tr"));
		 * 
		 * List<WebElement> columns=dateWidget.findElements(By.tagName("td"));
		 * 
		 * for (WebElement cell: columns){
		 * 
		 * //Select 10th Date if (cell.getText().equals("10")){
		 * 
		 * cell.findElement(By.linkText("10")).click();
		 * 
		 * break;
		 * 
		 * }
		 * 
		 * }
		 * 
		 * WebElement e5=dr.findElement(By.id("ctl00_mainContent_view_date2"));
		 * js.executeScript("arguments[0].click();", e5);
		 * 
		 * dr.findElement(By.linkText("Next")).click(); WebElement dateWidget1 =
		 * dr.findElement(By.xpath("/html/body/div[2]/div[2]/table/tbody"));
		 * 
		 * // List<WebElement> rows11=dateWidget.findElements(By.tagName("tr"));
		 * 
		 * List<WebElement> columns1=dateWidget1.findElements(By.tagName("td"));
		 * 
		 * for (WebElement cell: columns1){
		 * 
		 * //Select 10th Date if (cell.getText().equals("20")){
		 * 
		 * cell.findElement(By.linkText("20")).click();
		 * 
		 * break;
		 * 
		 * }
		 * 
		 * }
		 */
	   
	   }
		
		//T7-departure_1
		

	

}
