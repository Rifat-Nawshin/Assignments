package Base;


import java.io.FileInputStream;

import java.io.IOException;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class TestBase {

	
	public static WebDriver driver;
	public Properties Locator = new Properties();
	public FileInputStream fis;
	public Properties Sendkeys = new Properties();
	public FileInputStream fis2;
	
	
	@BeforeSuite
	public void driverinitialize() throws IOException {
		
		if(driver==null) {
			
			fis = new FileInputStream("D:/Eclipse/JAVA PROJECTS/NewTestClass/src/test/resources/Properties/Locator.properties");
			fis2 = new FileInputStream("D:\\Eclipse\\JAVA PROJECTS\\NewTestClass\\src\\test\\resources\\Properties\\Sendkeys.properties");
			//fis = new FileInputStream(""); 
			//fis = new FileInput
			 
			 Locator.load(fis);
			 Sendkeys.load(fis2);
		}
		
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");

	}
	
	
	
}
