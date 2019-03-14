package testing;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shekhar.sachdeva\\Desktop\\chromedriver.exe");
			
		ChromeDriver obj = new ChromeDriver();
		obj.get("http://demo.guru99.com/V4/");
		
		obj.manage().window().maximize();
	
		
		WebElement un = obj.findElementByName("uid");
		un.sendKeys("bye");

		WebElement pass = obj.findElement(By.name("password"));
		pass.sendKeys("1234");
		
		WebElement lgnBtn = obj.findElement(By.cssSelector("input[value='LOGIN']"));
		
		lgnBtn.click();
		
		
	}

}
