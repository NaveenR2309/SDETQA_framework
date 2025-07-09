package base;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
public WebDriver driver;
	
	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.opencart.com/index.php?route=common/home");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	public String randomString() 
	{
		String randomString = RandomStringUtils.randomAlphabetic(5);
		return randomString;
	}
	
	public String randomNumeric()
	{
	String randomNumeric =	RandomStringUtils.randomNumeric(5);
	return randomNumeric;
	}
	
	public String alphaNumeric() 
	{
		String rondomString = RandomStringUtils.randomAlphabetic(3);
		String randomNumeric =	RandomStringUtils.randomNumeric(3);
		return (rondomString+randomNumeric);
		
	}
}
