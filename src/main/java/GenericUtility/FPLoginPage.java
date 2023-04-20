package GenericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FPLoginPage {

	@FindBy(xpath = "//input[@placeholder='Username']")
	private WebElement username;
	
	@FindBy(id="Password")
	private WebElement password;
	
	@FindBy(xpath = "//button[text()='Login']")
	private WebElement login;
	
	public FPLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	
	public void Login(String UserName, String Password)
	{
		username.sendKeys(UserName);
		password.sendKeys(Password);
		login.click();
	}
}
