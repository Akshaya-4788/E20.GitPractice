package FirstProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com");
		String ActTitle = driver.getTitle();
		if (ActTitle.equals("nopCommerce demo store. Home page title"))
		{
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("Test case failed");
		}
		driver.close();
		
		
	}
	}




