package cpc;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class beforeAndAfterClass {

	ChromeDriver driver;

	@Before
	public void launchBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shekhar.sachdeva\\git\\LocalRepo\\Test\\chrome\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://qa.cpc.devfwh.lan/en-us");
		driver.manage().window().maximize();
		
		
	}

	@After
	public void closeBrowser() {

		driver.close();
		
	}
}