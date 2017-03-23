import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C://Selenium//geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.gmail.com");
		
		// TODO Auto-generated method stub

	}

}
