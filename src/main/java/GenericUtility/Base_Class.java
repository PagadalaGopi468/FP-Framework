package GenericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Base_Class {

	PropertyFile p=new PropertyFile();
	WebDriverUtility w=new WebDriverUtility();

	
	public static WebDriver driver;
	
	@BeforeSuite(groups = {"smoke","Regression"})
	public void Launch_Database()
	{
		System.out.println("Database launch Successfully..!!!");
		
	}
	//@Parameters("browser")
	//@BeforeTest
	@BeforeClass(groups = {"smoke","Regression"})
	public void Launch_Browser(/*String Browser*/) throws Exception
	{
	    String Browser=p.ReaddataFromProperty("Browser")/*e.ReadDataFromExcel("Sheet1",0,1)*/;
		if(Browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\chromedriver.exe");
			driver=new ChromeDriver();
			System.out.println("Chromedriver launch Successfully..!!!");
		}
		else if(Browser.equalsIgnoreCase("Edge"))
			
		{
			System.setProperty("webdriver.edge.driver", "D:\\Eclipse\\msedgedriver.exe");
		    driver=new EdgeDriver();
			System.out.println("Edgedriver launch Successfully..!!!");
		}
		driver.get(p.ReaddataFromProperty("URL"));
		w.waitForLoadPage(driver);
		w.maximize(driver);
	}
	
	@BeforeMethod(groups = {"smoke","Regression"})
	public void Login() throws Exception
	{
		FPLoginPage f=new FPLoginPage(driver);
		f.Login(p.ReaddataFromProperty("Username"), p.ReaddataFromProperty("Password"));
	}
	
	@AfterMethod(groups = {"smoke","Regression"})
	public void Logout()
	{
		FPlogoutPage fp=new FPlogoutPage(driver);
		fp.logout();
	}
	//@AfterTest
	@AfterClass(groups = {"smoke","Regression"})
	public void Close_Browser()
	{
		driver.close();
	}
	
    @AfterSuite(groups = {"smoke","Regression"})
	public void Close_Database()
	{
		System.out.println("Database close Successfully....!!!");
	}
    
	
}
