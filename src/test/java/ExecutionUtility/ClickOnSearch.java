package ExecutionUtility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtility.Base_Class;
import GenericUtility.WebDriverUtility;
@Listeners(GenericUtility.ListnerImplementationClass.class)
public class ClickOnSearch extends Base_Class{
     WebDriverUtility w=new WebDriverUtility();
     @Test
	public void Search() throws Exception
	{
		driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[4]")).click();
		driver.findElement(By.xpath("//div[@class='mat-menu-content ng-tns-c72-4']")).click();
		w.ScrollBy(driver, "window.scrollBy(0,-2000);");
//		Robot r=new Robot();
//		
//		r.keyPress(KeyEvent.VK_PAGE_UP);
//		r.keyRelease(KeyEvent.VK_PAGE_UP);
//		r.keyPress(KeyEvent.VK_PAGE_UP);
//		r.keyRelease(KeyEvent.VK_PAGE_UP);
//		r.keyPress(KeyEvent.VK_PAGE_UP);
//		r.keyRelease(KeyEvent.VK_PAGE_UP);
//		r.keyPress(KeyEvent.VK_PAGE_UP);
//		r.keyRelease(KeyEvent.VK_PAGE_UP);
//		r.keyPress(KeyEvent.VK_PAGE_UP);
//		r.keyRelease(KeyEvent.VK_PAGE_UP);
		driver.findElement(By.xpath("(//span[@class='mat-button-focus-overlay'])[17]")).click();
	}
}
