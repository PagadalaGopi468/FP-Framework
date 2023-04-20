package ExecutionUtility;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtility.Base_Class;
@Listeners(GenericUtility.ListnersClass.class)
public class LoginLogout extends Base_Class{
@Test(groups = "smoke")
	public void Demo()
	{
		System.out.println("passed");
	}
}
