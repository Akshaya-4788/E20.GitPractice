package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectors {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com");
		driver.manage().window().maximize();
		// tag#id
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
		
		//tag.classname (tag optional)
		//driver.findElement(By.cssSelector(".ico-login")).click();
		
		//tag[attribute]
		//driver.findElement(By.cssSelector("[alt='nopCommerce demo store']")).click();
		
		//tag.classname[attribute]
		//driver.findElement(By.cssSelector("button.button-1[type='submit']")).click();

	}

}
