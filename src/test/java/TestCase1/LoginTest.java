package TestCase1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Base.TestBase;

public class LoginTest extends TestBase {
	
	@Test
	public void login() {
		//username
		driver.findElement(By.xpath(Locator.getProperty("Username"))).sendKeys(Sendkeys.getProperty("UsernameInput"));
		//password
		driver.findElement(By.xpath(Locator.getProperty("Password"))).sendKeys(Sendkeys.getProperty("PasswordInput"));
		//submitbutton
		driver.findElement(By.xpath(Locator.getProperty("Submit"))).click();
	}

}
