package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegPage extends BasePage {

	public RegPage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy (xpath="//*[@id='input-username']")
	WebElement userName;

	@FindBy (xpath="//*[@id='input-firstname']")
	WebElement firstName;

	@FindBy (xpath="//*[@id='input-lastname']")
	WebElement lastName;

	@FindBy (xpath="//*[@id='input-email']")
	WebElement email;

	@FindBy (xpath="//*[@id='input-country']")
	WebElement drp_dwn_Country;  

	@FindBy (xpath="//*[@id='input-password']")
	WebElement password;

	@FindBy (xpath="//*[@id='button-register']/button[1]")
	WebElement btn_Register;

	public void setUserName(String UName) 
	{
		userName.sendKeys(UName);
	}
	public void setFirstName(String FName) 
	{
		userName.sendKeys(FName);
	}
	
	public void setLastName(String LName) 
	{
		userName.sendKeys(LName);
	}
	public void setEmail(String emailId) 
	{
		userName.sendKeys(emailId);
	}
	
	public void setDropdown(String ddValue) 
	{
		Select sel = new Select(drp_dwn_Country);
		sel.selectByVisibleText(ddValue);
	}
	public void setPass(String pass) 
	{
		userName.sendKeys(pass);
	}
	
	public void clickReg() 
	{
		btn_Register.click();
	}
	
}	



