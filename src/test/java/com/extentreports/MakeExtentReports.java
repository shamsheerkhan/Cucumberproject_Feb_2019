package com.extentreports;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.genericmethods.GenericMethods;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class MakeExtentReports {
	public static ExtentReports reports;
	public static ExtentTest test;
//********************************************CREATE RESULT FOLDER*******************************************************************
	/*
	 * Method Name := check_createResultFolder()
	 * 
	 * Input Parameter := NA
	 * 
	 * OutPut Parameter := String
	 * 
	 * Designer #:= shamsheer
	 * 
	 * Sprint #:=
	 * 
	 */
//***************************************************************************************************************

	public static String check_createResultFolder() {

		String ResultsFolderPath = System.getProperty("user.dir") +"\\Results\\";
		Date d=new Date();
		SimpleDateFormat sdf= new SimpleDateFormat("dd:MM:yy");
		String DateStamp=sdf.format(d);
		File dir = new File(ResultsFolderPath + DateStamp);
		if (!dir.exists()) {
			System.out.println("No folder exist------------creating a new folder");
		dir.mkdirs();}
		return ResultsFolderPath;
	}
//*************************************STEP:1 INITIALIZING REPORT********************************************************************	
	/*
	 * Method Name := initializereport()
	 * 
	 * Input Parameter := NA
	 * 
	 * OutPut Parameter := NA
	 * 
	 * Designer #:= shamsheer
	 * 
	 * Sprint #:=
	 * 
	 */
//***************************************************************************************************************

	public static void initializereport(String testcase) {

		reports = new ExtentReports(check_createResultFolder() + "\\" + testcase+".html");
		reports.addSystemInfo("Sprint#", "Sprint 1").addSystemInfo("Cycle", "01").addSystemInfo("Environment", "QA");
	}
//**********************************************STEP:02 START THE REPORT*****************************************************************
	/*
	 * Method Name := startreport()
	 * 
	 * Input Parameter := TestName
	 * 
	 * OutPut Parameter := NA
	 * 
	 * Designer #:= shamsheer
	 * 
	 * Sprint #:=
	 * 
	 */
//**************************************************************************************************************

	public static void startreport(String testname) {
		test = reports.startTest(testname);
	}
//******************************************LOG STATUS*********************************************************************
	/*
	 * Method Name := logstatus()
	 * 
	 * Input Parameter := Status,Discrition
	 * 
	 * OutPut Parameter := NA
	 * 
	 * Designer #:= shamsheer
	 * 
	 * Sprint #:=
	 * 
	 */
//**************************************************************************************************************

	public static void logstatus(String status,String discriptin) {
		switch(status.toLowerCase()) {
		case "pass":
			test.log(LogStatus.PASS, discriptin+test.addBase64ScreenShot(getscreenshot()));
			break;
			
		case "fail":
			test.log(LogStatus.FAIL, discriptin+test.addBase64ScreenShot(getscreenshot()));	
			break;
			
		case "warning":
			test.log(LogStatus.WARNING, discriptin+test.addBase64ScreenShot(getscreenshot()));	
			break;
		}
	}
	//******************************************SCREEN SHOT*********************************************************************
		/*
		 * Method Name := screenshot()
		 * 
		 * Input Parameter := NA
		 * 
		 * OutPut Parameter := NA
		 * 
		 * Designer #:= shamsheer
		 * 
		 * Sprint #:=
		 * 
		 */
	//**************************************************************************************************************

		public static String getscreenshot() {
			TakesScreenshot sht=(TakesScreenshot)GenericMethods.driver;
			String screenprint=sht.getScreenshotAs(OutputType.BASE64);
			return "data:image/png;base64,"+screenprint;
		}

	// ******************************************END AND PUBLISH REPORT*********************************************************************
	/*
	 * Method Name := endreport()
	 * 
	 * Input Parameter := NA
	 * 
	 * OutPut Parameter := NA
	 * 
	 * Designer #:= shamsheer
	 * 
	 * Sprint #:=
	 * 
	 */
	// **************************************************************************************************************

	public static void endreport() {
		reports.endTest(test);
		reports.flush();
	}

}
