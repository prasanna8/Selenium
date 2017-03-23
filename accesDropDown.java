package org.openqa.selenium.googlechrome;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class accesDropDown {
 public static void main(String[] args) { 
		System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
	    String baseUrl = "http://newtours.demoaut.com/mercuryregister.php";
	    WebDriver driver = new FirefoxDriver();
		driver.get(baseUrl);

		Select drpCountry = new Select(driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("ANTARCTICA");

		 }
}