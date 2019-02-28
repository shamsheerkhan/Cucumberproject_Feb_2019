package com.application.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.genericmethods.GenericMethods;

public class Create_an_account extends GenericMethods {
	// *********************************************WEBELEMENT************************************************//

	// *******************************************NAVBAR SECTION***********************************************//
	@FindBy(how = How.XPATH, using = "//a[@title='Log in to your customer account']")
	public static WebElement lnk_signin;
	//*******************************PERSONAL INFORMATION SECTION*****************************************//
	@FindBy(how=How.XPATH,using="//input[@id='id_gender1']")
	public static WebElement btn_male;
	
	@FindBy(how=How.XPATH,using="//input[@id='id_gender2']")
	public static WebElement btn_female;
	
	@FindBy(how=How.XPATH,using="(//label[normalize-space(text())='First name'])[1]")
	public static WebElement txt_personalinformation_firstname;
	
	@FindBy(how=How.XPATH,using="//input[@id='customer_firstname']")
	public static WebElement edi_personalinformation_firstname;
	
	@FindBy(how=How.XPATH,using="//label[@for='customer_lastname']")
	public static WebElement txt_personalinformation_lastname;
	
	@FindBy(how=How.XPATH,using="//input[@id='customer_lastname']")
	public static WebElement edi_personalinformation_lastname;
	
	@FindBy(how=How.XPATH,using="//label[@for='email']")
	public static WebElement txt_personalinformation_email;
	
	@FindBy(how=How.XPATH,using="//input[@id='email']")
	public static WebElement edi_personalinformation_email;
	
	@FindBy(how=How.XPATH,using="//label[@for='passwd']")
	public static WebElement txt_personalinformation_password;
	
	@FindBy(how=How.XPATH,using="//input[@id='passwd']")
	public static WebElement edi_personalinformation_password;
	
	@FindBy(how=How.XPATH,using="//select[@id='days']")
	public static WebElement drpd_birth_day;
	
	@FindBy(how=How.XPATH,using="//select[@id='months']")
	public static WebElement drpd_birth_month;
	
	@FindBy(how=How.XPATH,using="//select[@id='years']")
	public static WebElement drpd_birth_year;
	
	
	//******************************************ADDRESS SECTION*************************************************//
	
	@FindBy(how=How.XPATH,using="(//label[normalize-space(text())='First name'])[2]")
	public static WebElement txt_address_firstname;
	
	@FindBy(how=How.XPATH,using="//input[@id='firstname']")
	public static WebElement edi_address_firstname;
	
	@FindBy(how=How.XPATH,using="//label[@for='lastname']")
	public static WebElement txt_address_lastname;
	
	@FindBy(how=How.XPATH,using="//input[@id='lastname']")
	public static WebElement edi_address_lastname;
	
	@FindBy(how=How.XPATH,using="//label[@for='company']")
	public static WebElement txt_address_company;
	
	@FindBy(how=How.XPATH,using="//input[@id='company']")
	public static WebElement edi_address_company;
	
	@FindBy(how=How.XPATH,using="//label[@for='address1']")
	public static WebElement txt_address1;
	
	@FindBy(how=How.XPATH,using="//input[@id='address1']")
	public static WebElement edi_address1;
	
	@FindBy(how=How.XPATH,using="//label[@for='city']")
	public static WebElement txt_address_city;
	
	@FindBy(how=How.XPATH,using="//input[@id='city']")
	public static WebElement edi_address_city;
	
	@FindBy(how=How.XPATH,using="//label[@for='id_state']")
	public static WebElement txt_state;
	
	@FindBy(how=How.XPATH,using="//select[@id='id_state']")
	public static WebElement drpd_state;
	
	@FindBy(how=How.XPATH,using="//label[@for='postcode']")
	public static WebElement txt_zipcode;
	
	@FindBy(how=How.XPATH,using="//input[@id='postcode']")
	public static WebElement edi_zipcode;

	@FindBy(how=How.XPATH,using="//label[@for='id_country']")
	public static WebElement txt_country;
	
	@FindBy(how=How.XPATH,using="//select[@id='id_country']")
	public static WebElement drpd_country;
	
	@FindBy(how=How.XPATH,using="//label[@for='phone_mobile']")
	public static WebElement txt_mobile_no;
	
	@FindBy(how=How.XPATH,using="//input[@id='phone_mobile']")
	public static WebElement edi_mobile_no;
	
	@FindBy(how=How.XPATH,using="//label[@for='alias']")
	public static WebElement txt_assign_address;
	
	@FindBy(how=How.XPATH,using="//input[@id='alias']")
	public static WebElement edi_assign_address;
	
	@FindBy(how=How.XPATH,using="//button[@id='submitAccount']")
	public static WebElement btn_register;
	
	//*****************************INITIALIZING ALL WEBELEMENTS***********************//

	public Create_an_account() {
		PageFactory.initElements(driver, this);
	}

// *****************************************************************************************************//

	// ***********************************************************************
	/*
	 * Method Name := fill_personal_information_section_fields()
	 * 
	 * Input Parameter := Gender,FirstName,LastName,PassWord,DateofBirth
	 * 
	 * OutPut Parameter := NA
	 * 
	 * Designer #:=Shamsheer
	 * 
	 * Sprint #:=
	 */
	// *************************************************************************
	public void fill_personal_information_section_fields(String arg1, String arg2, String arg3, String arg4,
			String arg5) {
		String gender=arg1;
		if(gender.equalsIgnoreCase("Mr")) {
			hoverAndClick(btn_male);
		}else if(gender.equalsIgnoreCase("Ms")) {
			hoverAndClick(btn_female);
		}
		else {
			hoverAndClick(btn_male);
		}
		try {
			edi_personalinformation_firstname.sendKeys(arg2);
		}catch(Exception e) {
			e.printStackTrace();
		}
		try {
			edi_personalinformation_lastname.sendKeys(arg3);
		}catch(Exception e) {
			e.printStackTrace();
		}
		try {
			edi_personalinformation_password.sendKeys(arg4);
		}catch(Exception e) {
			e.printStackTrace();
		}
		String date = arg5;
		String datearr[] = date.split("-");
		String day = datearr[0];
		String month = datearr[1];
		String year = datearr[2];
		try {
			select_value_from_dropdown(drpd_birth_day, day);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			select_value_from_dropdown(drpd_birth_month, month);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			select_value_from_dropdown(drpd_birth_year, year);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
	}

	// **************************************************************************************************//
	/*
	 * Method Name := fill_the_Address_section_fields()
	 * 
	 * Input Parameter := Company,Address,City,State,ZipCode,MobileNo.
	 * 
	 * OutPut Parameter := NA
	 * 
	 * Designer #:=Shamsheer
	 * 
	 * Sprint #:=
	 */
	// *************************************************************************
	public void fill_the_Address_section_fields(String arg1, String arg2, String arg3, String arg4,String arg5, String arg6) {
		try {
			edi_address_company.sendKeys(arg1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			edi_address1.sendKeys(arg2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			edi_address_city.sendKeys(arg3);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
		select_text_value_from_dropdown(drpd_state, arg4);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
		edi_zipcode.sendKeys(arg5);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			edi_mobile_no.sendKeys(arg6);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//**************************************************************************************************//
	// **************************************************************************************************//
		/*
		 * Method Name := click_register()
		 * 
		 * Input Parameter := NA
		 * 
		 * OutPut Parameter := NA
		 * 
		 * Designer #:=Shamsheer
		 * 
		 * Sprint #:=
		 */
		// *************************************************************************
		public static  My_account click_register(){
			boolean flag=false;
			try{
						
			//Hover and Click on the women link
			hoverAndClick(btn_register);
			flag=true;
						
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
			if(flag)
				System.out.println("Successfully Register Link clicked");
			else
				System.out.println("Register Link Not clicked");
			return new My_account();
		}
		//**************************************************************************************************//
}
