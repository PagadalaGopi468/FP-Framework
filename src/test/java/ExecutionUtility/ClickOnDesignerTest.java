package ExecutionUtility;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtility.Base_Class;
@Listeners(GenericUtility.ListnerImplementationClass.class)
public class ClickOnDesignerTest extends Base_Class{
	@Test(groups = "Regression")
	public void Designer()
	{
		driver.findElement(By.linkText("Designer")).click();
		Reporter.log("Click on Designer Successfully..!!!");
	}
	@Test
	public void DemoTest()
	{
		System.out.println("passed");
	}
}
