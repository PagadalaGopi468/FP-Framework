package ExecutionUtility;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtility.AddNewStudentPage;
import GenericUtility.Base_Class;
@Listeners(GenericUtility.ListnerImplementationClass.class)
public class AddingStudent extends Base_Class{
@Test(groups = "smoke")
	public void Student() throws Exception
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
		AddNewStudentPage a=new AddNewStudentPage(driver);
		a.Student("npg@gmail.com", "sahasra", "ravali");
		System.out.println("Student added Successfully...!!!");
	}
}
