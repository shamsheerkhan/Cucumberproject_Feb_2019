package com.stepdefinitions;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.application.pages.Create_an_account;
import com.application.pages.Home;
import com.application.pages.Login;
import com.application.pages.My_account;
import com.genericmethods.GenericMethods;
import com.write_excel.WriteExcelData;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Create_an_account_Test extends GenericMethods {
	public static Home home;
	public static Login login;
	public static Create_an_account createaccount;
	public static My_account myaccount;
	static String temp_email="";
	public static WriteExcelData write;

	@Given("^user has to launch the browser browser name \"(.*?)\" and url \"(.*?)\" and navigate to login page$")
	public void user_has_to_launch_the_browser_browser_name_and_url_and_navigate_to_login_page(String arg1, String arg2)  {
	    lanunchBowser(arg1, arg2);
	    home=new Home();
	    createaccount = new Create_an_account();
	    myaccount=new My_account();
	    login=home.click_signin();
	    
	    
	}
	@Then("^user should identify the Authentification Section parameters of login page$")
	public void user_should_identify_the_Authentification_Section_parameters_of_login_page() {
		try {
			login.verify_Authentication_parameters();
			logStatus("pass", "Successfully verifyed the Authentication parameters");
		} catch (Exception e) {
			logStatus("fail", "Not Successfully verifyed the Authentication parameters");
			e.printStackTrace();
		}
	}

	@Then("^user has to enter \"(.*?)\" click on Create An Account  button$")
	public void user_has_to_enter_click_on_Create_An_Account_button(String arg1) {
		try {
			SimpleDateFormat d = new SimpleDateFormat("HH:mm:ss");
			String timestamp = d.format(Calendar.getInstance().getTime());
			timestamp = timestamp.replaceAll(":", "_");
			temp_email = arg1 + timestamp + "@gmail.com";
			login.edi_createaccount_emailid.sendKeys(temp_email);
			hoverAndClick(login.btn_createaccount);
			logStatus("pass", "Successfully clicked on Create Account button");
		} catch (Exception e) {
			logStatus("fail", "Not Successfully clicked on Create Account button");
			e.printStackTrace();
		}
	}

	@Then("^user has to fill personal information section fields \"(.*?)\",\"(.*?)\",\"(.*?)\",\"(.*?)\",\"(.*?)\"$")
	public void user_has_to_fill_personal_information_section_fields(String arg1, String arg2, String arg3, String arg4,
			String arg5) {

		try {
			createaccount.fill_personal_information_section_fields(arg1, arg2, arg3, arg4, arg5);
		logStatus("pass", "Successfully pesonal informaion section fields entered");
		} catch (Exception e) {
			logStatus("fail", "Not Successfully pesonal informaion section fields entered");
			e.printStackTrace();
		}
	}

	@Then("^user has to fill the Address section fields \"(.*?)\",\"(.*?)\",\"(.*?)\",\"(.*?)\",\"(.*?)\",\"(.*?)\"$")
	public void user_has_to_fill_the_Address_section_fields(String arg1, String arg2, String arg3, String arg4,
			String arg5, String arg6) {
		try {
			createaccount.fill_the_Address_section_fields(arg1, arg2, arg3, arg4, arg5, arg6);
		logStatus("pass", "Successfully Address section fields entered");
		} catch (Exception e) {
			logStatus("fail", "Not Successfully Address section fields entered");
			e.printStackTrace();
		}
	}

	@Then("^user can able to click on Register button and has navigate to My Account Page and signout from that page$")
	public void user_can_able_to_click_on_Register_button_and_has_navigate_to_My_Account_Page_and_signout_from_that_page() {
		try {
			myaccount = createaccount.click_register();
			login = myaccount.click_signout();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Then("^user has able to validate SignIn functionality by entering email id and \"(.*?)\" which he has created before$")
	public void user_has_able_to_validate_SignIn_functionality_by_entering_email_id_and_which_he_has_created_before(
			String arg1) {
		boolean status = false;
		try {
			login.edi_login_emailid.sendKeys(temp_email);
			login.edi_login_password.sendKeys(arg1);
			hoverAndClick(login.btn_login);
			logStatus("pass", "Successfully validated SignIn fuctionality");
			status = true;
		} catch (Exception e) {
			logStatus("fail", "Not Successfully validated SignIn fuctionality");
			e.printStackTrace();
		}
		if(status) {
			System.out.println("Successfully logined into account using email id "+temp_email+" and password "+arg1);
			write.create_excel_file(temp_email, arg1,"arg2","arg3","login credentials",2);
		}
		else
			System.out.println("Not Successfully logined into account using email id "+temp_email+" and password "+arg1);
	}

}
