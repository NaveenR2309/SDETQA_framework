package testCase;

import java.time.Duration;

import javax.annotation.RegEx;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegPage;

public class TC_001_RegistrationTest extends BaseTest {

	
	
	@Test
	public void verify_account_register() 
	{
		HomePage hp = new HomePage(driver);
		hp.clickRegister();
		
		RegPage rp = new RegPage(driver);
		rp.setUserName(randomString().toUpperCase());
		rp.setFirstName(randomString().toUpperCase());
		rp.setLastName(randomString().toUpperCase());
		rp.setDropdown("asa");
		rp.setEmail(randomString()+"@gmail.com");
		
		String password = alphaNumeric();
		rp.setPass(password);
		
		rp.clickReg();
		
	}
	
	
}
