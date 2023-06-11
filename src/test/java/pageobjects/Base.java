package pageobjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

public static WebDriver driver;

	
	public void invokeChrome() {
		
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		// to maximize browser
		driver.manage().window().maximize();
		driver.get("https://www.safeway.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		ChromeOptions c=new ChromeOptions();
		c.addArguments("---disable-notifications---");
	}
	
	public WebDriverWait Explicitwait() {
		
		return new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	public void implicitwait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

}
