package GenericUtility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListnerImplementationClass implements ITestListener{
	ExtentReports report;
	ExtentTest test;
	
	public void onTestStart(ITestResult result) {
		String MethodName=result.getMethod().getMethodName();
        test=report.createTest(MethodName);
        test.log(Status.INFO, "Test Execution Started..!!!"+" "+MethodName);
	}

	public void onTestSuccess(ITestResult result) {
		String MethodName=result.getMethod().getMethodName();
		 test.log(Status.PASS, "Test Script passed..!!!"+" "+MethodName);
	}

	public void onTestFailure(ITestResult result) {
		WebDriverUtility w=new WebDriverUtility();
		String MethodName=result.getMethod().getMethodName();
		 test.log(Status.PASS, "Test Script Failed..!!!"+" "+MethodName);
         test.log(Status.FAIL, result.getThrowable());
		String ScreenShotName =MethodName+" "+ w.getsystemDateFormat();
		System.out.println(ScreenShotName);
		try {
			String path=w.screenshot(Base_Class.driver, ScreenShotName);
			test.addScreenCaptureFromPath(path);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		String MethodName=result.getMethod().getMethodName();
		test.log(Status.SKIP, "Test Script is Skipped..!!!"+" "+MethodName);
		test.log(Status.SKIP, result.getThrowable());
	}

	public void onStart(ITestContext context) {
		System.out.println("----Suite Execution Started----");
		
		ExtentSparkReporter htmlReport=new ExtentSparkReporter(".\\ExtentReports\\Report-"+new WebDriverUtility().getsystemDateFormat()+" .html");
		htmlReport.config().setDocumentTitle("ExtentReports");
		htmlReport.config().setReportName("FocalPoint Execution Report");
		htmlReport.config().setTheme(Theme.DARK);
		htmlReport.config().setTimelineEnabled(true);
		
	    report=new ExtentReports();
		report.attachReporter(htmlReport);
		report.setSystemInfo("Browser", "Chrome");
		report.setSystemInfo("System OS", "Windows");
		report.setSystemInfo("Base URL","https://me3.backpack.education/");
		report.setSystemInfo("Author","Gopi");

	}

	public void onFinish(ITestContext context) {
		System.out.println("----Suite Execution Finished----");
		report.flush();
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	
}
