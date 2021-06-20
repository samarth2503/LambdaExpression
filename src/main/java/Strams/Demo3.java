package Strams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo3 {
	
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com");
		
		driver.findElement(By.linkText("Books")).click();
		
		Select s = new Select(driver.findElement(By.id("products-viewmode")));
		
		s.selectByVisibleText("Name : A to Z");
		
		List<WebElement> al = driver.findElements(By.xpath("//div[@class='product-grid']//h2//a"));
		
		//al.forEach(headers-> System.out.println(headers.getText()));
		
		List<Object> beforesort = al.stream().map(item->item.getText()).collect(Collectors.toList()); // before sorting
		
		List<String> aftersort = al.stream().map(item->item.getText()).sorted().collect(Collectors.toList());
		
		if(beforesort.equals(aftersort))
		{
			System.out.println("Products are sorted");
		}
		else
		{
			System.out.println("Products are not sorted");
		}
		
		
	}

}
