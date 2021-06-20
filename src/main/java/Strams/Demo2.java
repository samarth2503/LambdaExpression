package Strams;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo2 {
	
	public static void main(String[] args)
	{
		//System.setProperty("webdriver.chrome.driver", "D:\\Selenium WorkSpace\\JavaPractice\\chromedriver-1.exe");
		WebDriverManger.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.flipkart.com/");
		
		//sdriver.switchTo().newWindow(Window.TAB);
		
		driver.get("http://www.amazon.com");
		
		Set<String> windowid = driver.getWindowHandles();
		
		// With lambda Expression.
		windowid.forEach(windid->driver.switchTo().window(windid).getTitle());
		
		driver.quit();
		
		
	}
}
