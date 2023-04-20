package GenericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AddNewStudentPage {

	@FindBy(xpath = "//span[text()='Administration']")
	private WebElement adm;
	
	@FindBy(linkText = "SIS Provisioning")
	private WebElement pro;
	
	@FindBy(xpath = "//span[text()=' Add New Student ']")
	private WebElement addStu;
	
	@FindBy(xpath = "(//input[@type='text'])[1]")
	private WebElement email;
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement FName;
	
	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement LName;
	
	@FindBy(xpath = "//span[text()=' Save ']")
	private WebElement Save;
	
	@FindBy(xpath = "//mat-icon[text()='close']")
	private WebElement close;
	
	public AddNewStudentPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAdm() {
		return adm;
	}

	public WebElement getPro() {
		return pro;
	}

	public WebElement getAddStu() {
		return addStu;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getFName() {
		return FName;
	}

	public WebElement getLName() {
		return LName;
	}

	public WebElement getSave() {
		return Save;
	}
	
	public WebElement getclose() {
		return close;
	}
	public void Student(String Email, String FirstName, String LastName)
	{
		adm.click();
		pro.click();
		addStu.click();
		email.sendKeys(Email);
		FName.sendKeys(FirstName);
		LName.sendKeys(LastName);
		Save.click();
		close.click();
	}
}

