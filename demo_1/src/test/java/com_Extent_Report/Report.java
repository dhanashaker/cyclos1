package com_Extent_Report;

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

public class Report implements ITestListener{
	public ExtentSparkReporter rp;
	public ExtentReports er;
	public ExtentTest et;
	
	public void onStart(ITestContext tr) {
		rp = new ExtentSparkReporter("D:\\Java\\demo_1\\Report_of_TestNG\\dhana.html");
		
		rp.config().setDocumentTitle("Adactin_Report");
		rp.config().setReportName("Login and search hotel");
		rp.config().setTheme(Theme.DARK);
		
		er=new ExtentReports();
		er.attachReporter(rp);
		
		er.setSystemInfo("username", "anwesh");
		er.setSystemInfo("Hostname", "LocalHost");
		er.setSystemInfo("OS", "Window10");
		er.setSystemInfo("Browser", "chrome,Edge,Firefox");
		er.setSystemInfo("Environment", "QA");
	}
	public void onTestSuccess(ITestResult tr) {
		et =er.createTest(tr.getName());
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
