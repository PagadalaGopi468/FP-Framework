package ExecutionUtility;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.testng.annotations.Listeners;

import GenericUtility.Base_Class;
@Listeners(GenericUtility.ListnerImplementationClass.class)
public class ConductTest extends Base_Class{
@org.testng.annotations.Test
	public void Test() throws Exception
	{

    Robot r=new Robot();
    r.keyPress(KeyEvent.VK_CONTROL);
    r.keyPress(KeyEvent.VK_MINUS);
    r.keyRelease(KeyEvent.VK_CONTROL);
    r.keyRelease(KeyEvent.VK_MINUS);
    
    r.keyPress(KeyEvent.VK_CONTROL);
    r.keyPress(KeyEvent.VK_MINUS);
    r.keyRelease(KeyEvent.VK_CONTROL);
    r.keyRelease(KeyEvent.VK_MINUS);
    
    r.keyPress(KeyEvent.VK_CONTROL);
    r.keyPress(KeyEvent.VK_MINUS);
    r.keyRelease(KeyEvent.VK_CONTROL);
    r.keyRelease(KeyEvent.VK_MINUS);
		GenericUtility.AddTestPage a=new GenericUtility.AddTestPage(driver);
		a.test("Testing","I Want to Become QA");
		
		 
	}
}
