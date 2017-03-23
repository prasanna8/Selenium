

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import java.util.concurrent.*;


public class MyClass {

	public static void main(String[] args) 
	{
	        //initializing firefox driver
		    System.setProperty("webdriver.gecko.driver","C://Selenium//geckodriver.exe");
			WebDriver driver= new FirefoxDriver();
			
			//open gmail
			driver.get("http://www.gmail.com");
			
			WebElement element = driver.findElement(By.id("Email"));
			element.sendKeys("prasanna.v689@gmail.com");
			
			//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			WebElement element0 = driver.findElement(By.id("Passwd"));
			element0.sendKeys("Prasanna12");
						
			element.submit();
			
			//WebElement myDynamicElement = (new WebDriverWait(driver,15)).until(ExpectedConditions.presenceOfElementLocated(By.id("gbg4")));
			
			driver.findElement(By.id("gbg4")).click();
			
			driver.findElement(By.id("gb_71")).click();

	}

}
