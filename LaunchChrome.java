package ChromeDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.projecttopics.info/Dotnet/Alumni_Manager.php");
		System.out.println(driver.getTitle());
		
	}

}
