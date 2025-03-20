package cyclos_Extent_Report;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Cyclos_Report implements ITestListener {
	
	public ExtentSparkReporter rp;
	public ExtentReports er;
	public ExtentTest et;
	
	public void onStart(ITestContext tr) {

		rp = new ExtentSparkReporter("C:\\Users\\dhana\\git\\repository1\\Cyclos\\Reports\\Cyclos01.html");
		/*String Timestamp = new SimpleDateFormat("yyyy.MM.DD.HH.mm.ss").format(new Date());
		String reportname = "Cyclos_Test_Report "+Timestamp+".html";*/
		//rp = new ExtentSparkReporter("D:\\Java\\Cyclos\\Reports"+reportname);
		rp.config().setDocumentTitle("Cyclos-Report");
		rp.config().setReportName("Registeration test");
		rp.config().setTheme(Theme.STANDARD);
		
		er = new ExtentReports();
		er.attachReporter(rp);
		
		er.setSystemInfo("username", "Dhanashekar");
		er.setSystemInfo("Hostname", "LocalHost");
		er.setSystemInfo("OS", "Window11");
		er.setSystemInfo("Browser", "chrome,Edge,Firefox");
		er.setSystemInfo("Environment", "QA");
		
	}
	public void onTestSuccess(ITestResult tr) {
		et = er.createTest(tr.getName());
		et.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));
		
	}
	
	public void onTestFailure(ITestResult tr) {
		et = er.createTest(tr.getName());
		et.log(Status.FAIL, MarkupHelper.createLabel(tr.getName(), ExtentColor.RED));
		
	}
	
	public void onTestSkipped(ITestResult tr) {
		et = er.createTest(tr.getName());
		et.log(Status.SKIP, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREY));
		
	}
	
	public void onFinish(ITestContext context) {
		er.flush();
	}

}
