package GenericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FPlogoutPage {

	@FindBy(xpath = "//span[@aria-describedby='cdk-describedby-message-3']")
	private WebElement logout;
	
	@FindBy(linkText = "here")
	private WebElement here;
	
	public FPlogoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogout() {
		return logout;
	}

	public WebElement getHere() {
		return here;
	}
	
	public void logout()
	{
		logout.click();
		here.click();
	}
}
