package GenericUtility;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddTestPage {

	@FindBy(xpath = "//span[text()='QTI Resources']")
	private WebElement button;
	
	@FindBy(linkText  = "Tests")
	private WebElement btn;
	
	@FindBy(xpath = "(//button[@type='button'])[1]")
	private WebElement Add;
	
	@FindBy(xpath = "//input[@type='text']")
	private WebElement title;
	
	@FindBy(xpath = "(//input[@type='number'])[1]")
	private WebElement timeLimit;
	
	@FindBy(name="Description")
	private WebElement Desc;
	
	@FindBy(id="developing-slider")
    private WebElement bar;
	
	@FindBy(xpath = "//span[@class='mat-content ng-tns-c169-77']")
	private WebElement clk;
	
	@FindBy(xpath = "//span[text()=' ES2 ']")
	private WebElement sle;
	
	@FindBy(xpath = "(//button[@type='button'])[7]")
	private WebElement Questions;
	
	@FindBy(xpath = "//span[@class='mat-content ng-tns-c169-96']")
	private WebElement standard;
	
	@FindBy(xpath = "//span[text()=' 1-PS4-2 - (2) ']")
	private WebElement select;
	
	@FindBy(xpath = "(//button[@class='addicon'])[2]")
	private WebElement addQ;
	
	@FindBy(xpath = "//mat-icon[normalize-space()='arrow_forward']")
	private WebElement cont;
	
//	@FindBy(xpath = "(//button[@type='button'])[9]")
//	private WebElement close;
	
	@FindBy(xpath = "(//span[@class='mat-button-wrapper'])[23]")
	private WebElement save;
	
	public AddTestPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getButton() {
		return button;
	}

	public WebElement getBtn() {
		return btn;
	}

	public WebElement getAdd() {
		return Add;
	}

	public WebElement getTitle() {
		return title;
	}

	public WebElement getTimeLimit() {
		return timeLimit;
	}

	public WebElement getDesc() {
		return Desc;
	}

	public WebElement getbar() {
		return bar;
	}
	
	public WebElement getClk() {
		return clk;
	}

	public WebElement getSle() {
		return sle;
	}

	public WebElement getQuestions() {
		return Questions;
	}

	public WebElement getTopic() {
		return standard;
	}

	public WebElement getSelect() {
		return select;
	}

	public WebElement getAddQ() {
		return addQ;
	}

	public WebElement getCont() {
		return cont;
	}

//	public WebElement getClose() {
//		return close;
//	}

	public WebElement getSave() {
		return save;
	}
	
	public void test(String Title,String Description) throws Exception
	{
		button.click();
		btn.click();
		Add.click();
		title.sendKeys(Title);
		timeLimit.click();
		Desc.sendKeys(Description);
		bar.click();
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		clk.click();
		sle.click();
		Questions.click();
		
		
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		standard.click();
		select.click();
		addQ.click();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_PAGE_UP);
		r.keyRelease(KeyEvent.VK_PAGE_UP);
		cont.click();
		//close.click();
		save.click();
	}
}
