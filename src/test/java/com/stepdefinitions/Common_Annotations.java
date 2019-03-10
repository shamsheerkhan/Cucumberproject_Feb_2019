package com.stepdefinitions;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import com.application.pages.Create_an_account;
import com.application.pages.Home;
import com.application.pages.Login;
import com.application.pages.My_account;

import com.genericmethods.GenericMethods;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utils.MakeExtentReport;


public class Common_Annotations extends GenericMethods{
	public static Home home;
	
	public static MakeExtentReport mkreports;

	
	@Given("^User has to launch the browser browsername \"(.*?)\" and Navigate to Home page url \"(.*?)\"$")
	public void user_has_to_launch_the_browser_browsername_and_Navigate_to_Home_page_url(String brsName, String url) {
	lanunchBowser(brsName, url);
	home=new Home();
	}
	
	
	
	@Then("^Quit the Browser$")
	public void quit_the_Browser()  {
	    tearDownBrowser();
	}
	@Before
	public void initialize_report() {
		
	mkreports.initialize_Report();
		mkreports.startReport("summary");
	}
	
	@After
	public void pulishReport() {
		
		mkreports.endReport();
	}
	
}
