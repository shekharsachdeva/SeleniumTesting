package cpc;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUp extends beforeAndAfterClass {

	@Test
	public void clickSignUpButton() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement signupbutton = driver.findElement(By.cssSelector("a#createAccount"));
		signupbutton.click();
		Thread.sleep(5000);

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement firstname = driver.findElement(By.id("givenName"));
		firstname.sendKeys("Test");

		WebElement lastname = driver.findElement(By.cssSelector("input#surname"));
		lastname.sendKeys("Last");

		WebElement email = driver.findElement(By.cssSelector("input#email"));
		email.sendKeys("19marchus09@qasubway.com");

		WebElement password = driver.findElement(By.cssSelector("input#newPassword"));
		password.sendKeys("Subway123");

		WebElement confirmpassword = driver.findElement(By.cssSelector("input#reenterPassword"));
		confirmpassword.sendKeys("Subway123");

		WebElement country = driver.findElement(By.id("country"));
		Select s = new Select(country);
		s.selectByVisibleText("United States");

		WebElement telephone_no = driver.findElement(By.id("telephoneNumber"));
		telephone_no.sendKeys("4255556565");

		Thread.sleep(3000);

		WebElement checkbox = driver.findElement(By.cssSelector("input[type='checkbox']"));
		boolean t = checkbox.isSelected();
		if (t) {
			System.out.println("Pass - OK");
		} else {
			System.out.println("Fail");
			checkbox.click();
		}
		
		/*List<WebElement> lst = driver.findElements(By.xpath("//*[contains(text(),'JOIN NOW')]"));
		new WebDriverWait(driver,30).until(
                ExpectedConditions.elementToBeClickable(By.xpath(lst)));

		List<WebElement> lst = driver.findElements(By.xpath("//*[contains(text(),'JOIN NOW')]"));
		lst.get(0);*/
		
		WebElement join_now = driver.findElement(By.id("continue"));
	//	String text = join_now.getText();
		//System.out.println("Inner Text = " +text);
		join_now.click();
		Thread.sleep(3000);

		// driver.findElement(By.)
	}

}
