package com.cucumber.testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.cucumber.baseclass.BaseClass;
import com.cucumber.utils.CucumberJVMReport;
import com.cucumber.utils.LoadProp;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin= {"pretty",
				"json:src\\test\\resources\\com\\reports\\cucumber-report1.json",
			"junit:src\\test\\resources\\com\\reports\\cucumber-report1.xml",
			"html:src\\test\\resources\\com\\reports\\cucumber-report.html"
		},
		features = "src\\test\\java\\com\\cucumber\\features",
		glue = "com.cucumber.testscripts", dryRun=false, strict=true, monochrome=true
		
		)

public class TestRunner extends BaseClass{
	@AfterClass
	public static void driverQuit() {
		
		driver.quit();
		
		CucumberJVMReport.getReport();
		}
		
}
