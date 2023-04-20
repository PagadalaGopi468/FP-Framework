package GenericUtility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListnersClass implements ITestListener{
	ExtentReports report;
	ExtentTest test;
	WebDriverUtility util=new WebDriverUtility();
	
	public void onTestStart(ITestResult result) {
		String methodname=result.getMethod().getMethodName();
		test=report.createTest(methodname);
		test.log(Status.INFO, "Test Script is Started..!!!"+" "+methodname);
	}

	public void onTestSuccess(ITestResult result) {
		String methodname=result.getMethod().getMethodName();
		test.log(Status.PASS,"Test Script is Passed..!!!"+" "+methodname);
	}

	public void onTestFailure(ITestResult result) {
		String methodname=result.getMethod().getMethodName();
		test.log(Status.FAIL, "Test Script is failed..!!!"+" "+methodname);
		test.log(Status.FAIL, result.getThrowable());
		String ScreenShotName = methodname+" "+util.getsystemDateFormat();
		
		try {
			String path = util.screenshot(Base_Class.driver, ScreenShotName);	
			test.addScreenCaptureFromPath(path);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

	public void onTestSkipped(ITestResult result) {
		String methodname=result.getMethod().getMethodName();
		test.log(Status.SKIP, "Test Script is Skipped..!!!"+" "+methodname);
		test.log(Status.SKIP, result.getThrowable());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		Reporter.log("Suite Execution is Started..!!!");
		ExtentSparkReporter htmlreport=new ExtentSparkReporter(".\\ExtentReport\\report- "+new WebDriverUtility().getsystemDateFormat()+" .html");
		htmlreport.config().setDocumentTitle("ExtentReports for Demo");
		htmlreport.config().setReportName("Focal point report");
		htmlreport.config().setTheme(Theme.DARK);
		htmlreport.config().setTimeStampFormat("yyyy-MM-dd HH:mm:ss.SSS.SSS.SSS");
		htmlreport.config().setTimelineEnabled(true);
		
		report=new ExtentReports();
		report.attachReporter(htmlreport);
		report.setSystemInfo("Browser", "chrome");
		report.setSystemInfo("OS", "windows");
		report.setSystemInfo("Author", "Gopi");
		report.setSystemInfo("Environment", "QA");
	}

	public void onFinish(ITestContext context) {
		Reporter.log("Suite Execution is Finish..!!!");
		report.flush();
		
	}

}
