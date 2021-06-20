/*
 * Find number of links on page
 * Print link text from links
 * Broken links(doesnt have href attribute)
 * 
 * Using Java Collection,Lambda Expression and Streams in Selenium
 * 
 */
package Strams;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir").concat("\\chromedriver-1.exe"));
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("Number of links present in webpage = "+links.size());
		
		// Without Lambda Expression
		for(WebElement link : links)
		{
			System.out.println("Link text is = "+link.getText());
		}
		
		//Lambda Expression
		
		links.forEach(link->System.out.println(link.getText()));
		
		// To print Broken link using lmbda Expression
		
		long workinglinks = links.stream().filter(link->link.getAttribute("href")!=null).count();
		System.out.println("Working link count is = "+workinglinks);
		
	}

}
