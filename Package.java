package org.openqa.selenium.googlechrome;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Package {


    public static void main(String[] args) {
        
    	WebDriver driver ;
    	System.setProperty("webdriver.gecko.driver","C://Selenium//geckodriver.exe");
    	driver = new FirefoxDriver();
        String baseUrl = "https://www.onetravel.com/";
        String expectedTitle = "OneTravel.com";
        String actualTitle = "";
        
        driver.get(baseUrl);

        actualTitle = driver.getTitle();
        
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
            
        driver.close();
        
        System.exit(0);
    }

}