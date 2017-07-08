package com.test.Configuration;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ReportGenerator {
	public ReportGenerator() {
		// TODO Auto-generated constructor stub
	}
	
	public static ExtentTest initializeParentTest(String testName,String description) {
		return BaseClass.REPORT.startTest(testName,description);
	}
	
	public static void logStatusPass(ExtentTest testCaseExtent,String message,Boolean attachSnapshot) {
		if(!attachSnapshot){
			testCaseExtent.log(LogStatus.PASS, message);
		}else {
			if(BaseClass.driver!=null){
				File srcFile = ((TakesScreenshot)BaseClass.driver).getScreenshotAs(OutputType.FILE);
				File destFile = new File(BaseClass.EXECUTION_REPORT_FILE_PATH+"\\PassedTestStepScreenShots\\"+message.replace(".", "")+".jpg");
				try {
					FileUtils.copyFile(srcFile, destFile);
					
				} catch (Exception e) {
					System.out.println("Not able to take the screenshot for:"+e.getStackTrace());
				}
				try {
					testCaseExtent.log(LogStatus.PASS, 
										message+testCaseExtent.addScreenCapture("PassedTestStepsScreenshots\\"+message.replace(".", "")+".jpg"));
				} catch (Exception e) {
					e.printStackTrace();
				}finally {
					System.out.println("Screenshot added for the passed test step");
				}
			}else {
				testCaseExtent.log(LogStatus.PASS, message);
			}
		}
	}
	
	
	public static void logStatusInfo(ExtentTest testCaseExtent,String message,Boolean attachSnapshot) {
		if(!attachSnapshot){
			testCaseExtent.log(LogStatus.PASS, message);
		}else {
			if(BaseClass.driver!=null){
				File srcFile = ((TakesScreenshot)BaseClass.driver).getScreenshotAs(OutputType.FILE);
				File destFile = new File(BaseClass.EXECUTION_REPORT_FILE_PATH+"\\InfoTestStepScreenShots\\"+message.replace(".", "")+".jpg");
				try {
					FileUtils.copyFile(srcFile, destFile);
					
				} catch (Exception e) {
					System.out.println("Not able to take the screenshot for:"+e.getStackTrace());
				}
				try {
					testCaseExtent.log(LogStatus.INFO, 
										message+testCaseExtent.addScreenCapture("InfoTestStepsScreenshots\\"+message.replace(".", "")+".jpg"));
				} catch (Exception e) {
					e.printStackTrace();
				}finally {
					System.out.println("Screenshot added for the passed test step");
				}
			}else {
				testCaseExtent.log(LogStatus.INFO, message);
			}
		}
	}
	
	public static void logStatusFail(ExtentTest testCaseExtent,String message) {
		if(BaseClass.driver!=null){
			File srcFile = ((TakesScreenshot)BaseClass.driver).getScreenshotAs(OutputType.FILE);
			File destFile = new File(BaseClass.EXECUTION_REPORT_FILE_PATH+"\\FailedTestStepsScreenshots\\"+message.replace(".", "")+".jpg");
			try {
				FileUtils.copyFile(srcFile, destFile);
			} catch (Exception e) {
					System.out.println("Not able to take the screenshot for:"+e.getStackTrace());
					}
			try {
				testCaseExtent.log(LogStatus.FAIL, 
									message+testCaseExtent.addScreenCapture("FailedTestStepsScreenshots\\"+message.replace(".", "")+".jpg"));
			} catch (Exception e) {
					e.printStackTrace();
				}finally {
					System.out.println("Screenshot added for the failed test step");
				}
			}else {
				testCaseExtent.log(LogStatus.FAIL, message);
			}
		}
	
	public static void logStatusSkip(ExtentTest testCaseExtent,String message,Boolean attachSnapshot) {
		if(BaseClass.driver!=null){
			File srcFile = ((TakesScreenshot)BaseClass.driver).getScreenshotAs(OutputType.FILE);
			File destFile = new File(BaseClass.EXECUTION_REPORT_FILE_PATH+"\\SkippedTestStepsScreenshots\\"+message.replace(".", "")+".jpg");
			try {
				FileUtils.copyFile(srcFile, destFile);
			} catch (Exception e) {
					System.out.println("Not able to take the screenshot for:"+e.getStackTrace());
					}
			try {
				testCaseExtent.log(LogStatus.SKIP, 
									message+testCaseExtent.addScreenCapture("SkippedTestStepsScreenshots\\"+message.replace(".", "")+".jpg"));
			} catch (Exception e) {
					e.printStackTrace();
				}finally {
					System.out.println("Screenshot added for the failed test step");
				}
			}else {
				testCaseExtent.log(LogStatus.SKIP, message);
			}
		}
}
