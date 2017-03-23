import org.openqa.selenium.WebDriver;

public class ChromeDriver {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C://Selenium//geckodriver.exe");
		
		WebDriver driver= (WebDriver) new ChromeDriver();
		
		driver.get("https:www.gmail.com");

	}



}
