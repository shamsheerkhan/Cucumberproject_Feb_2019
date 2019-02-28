package com.application.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.genericmethods.GenericMethods;

public class Login extends GenericMethods{
	//****************************WEBELEMENTS******************************//
	
	//****************************HEADER SECTION***************************//
		@FindBy(how=How.XPATH,using="(//header[@id='header']//img)[1]")
		public static WebElement img_Header;
	//****************************NAVBAR SECTION***************************//
		@FindBy(how=How.XPATH,using="//strong[text()='0123-456-789']")
		public static WebElement txt_cotact_no;
		
		@FindBy(how=How.XPATH,using="//a[@title='Contact Us']")
		public static WebElement lnk_cotacts_us;
		
		@FindBy(how=How.XPATH,using="//a[@title='Log in to your customer account']")
		public static WebElement lnk_signin;
		
	//*****************************SEARCH SECTION***************************//
		
		@FindBy(how=How.XPATH,using="//div[@id='header_logo']//img")
		public static WebElement img_logo;
		
		@FindBy(how=How.XPATH,using="//input[@id='search_query_top']")
		public static WebElement edi_search;
		
		@FindBy(how=How.XPATH,using="//form[@id='searchbox']//button")
		public static WebElement btn_search;
		
		
	//****************************CART SECTION*******************************//

		@FindBy(how=How.XPATH,using="//a[@title='View my shopping cart']")
		public static WebElement lnk_cart;

	//***************************TAB SECTION*********************************//
		@FindBy(how=How.XPATH,using="//a[@title='Women']")
		public static WebElement lnk_women;
		
		@FindBy(how=How.XPATH,using="(//a[@title='Dresses'])[2]")
		public static WebElement lnk_dress;
		
		@FindBy(how=How.XPATH,using="(//a[@title='T-shirts'])[2]")
		public static WebElement lnk_t_shirts;
		
	//***************************RETURN HOMEPAGE SECTION************************//
		
		@FindBy(how=How.XPATH,using="//a[@title='Return to Home']")
		public static WebElement lnk_return_home;
		
		@FindBy(how=How.XPATH,using="//span[normalize-space(text())='Authentication']")
		public static WebElement txt_authentication;
		
	//***************************AUTHENTICATION SECTION************************//

		@FindBy(how=How.XPATH,using="//h1[text()='Authentication']")
		public static WebElement txt_authentication_heading;
		
		//************************CREATE ACCOUNT SECTION**************************//
		
		@FindBy(how=How.XPATH,using="(//div[@id='center_column']//h3)[1]")
		public static WebElement txt_createaccount;
		
		@FindBy(how=How.XPATH,using="(//div[@id='center_column']//p)[1]")
		public static WebElement txt_enter_emailid;
		
		@FindBy(how=How.XPATH,using="(//div[@id='center_column']//label)[1]")
		public static WebElement txt_createaccount_emailid;
		
		@FindBy(how=How.XPATH,using="(//div[@id='center_column']//input)[1]")
		public static WebElement edi_createaccount_emailid;
		
		@FindBy(how=How.XPATH,using="//div[@id='center_column']//div[@id='create_account_error']")
		public static WebElement msg_invalid_emailid;
		
		@FindBy(how=How.XPATH,using="(//div[@id='center_column']//span)[1]")
		public static WebElement btn_createaccount;
		
		@FindBy(how=How.XPATH,using="//div[@id='create_account_error']/ol/li")
		public static WebElement msg_email_id_alradyexisted;
		
		//***************************SIGN IN SECTION*****************************//

		@FindBy(how=How.XPATH,using="(//div[@id='center_column']//h3)[2]")
		public static WebElement txt_already_existed;

		@FindBy(how=How.XPATH,using="(//div[@id='center_column']//label)[2]")
		public static WebElement txt_login_emailid;
		
		@FindBy(how=How.XPATH,using="//input[@id='email']")
		public static WebElement edi_login_emailid;
		
		@FindBy(how=How.XPATH,using="//input[@id='passwd']")
		public static WebElement edi_login_password;
		
		@FindBy(how=How.XPATH,using="//div[@id='center_column']//ol/li[normalize-space(text())='Invalid email address.']")
		public static WebElement msg_invalid_login_emailaddress;
		
		@FindBy(how=How.XPATH,using="//a[@title='Recover your forgotten password']")
		public static WebElement lnk_forgot_password;
		
		@FindBy(how=How.XPATH,using="(//form[@id='login_form']//span)[2]")
		public static WebElement btn_login;

	//*********************************BOTTOM HEADER****************************************//
		//***************************NEWSLETTER SECTION********************//
		@FindBy(how=How.XPATH,using="//h4[normalize-space(text())='Newsletter']")
		public static WebElement txt_newsletter;
		
		@FindBy(how=How.XPATH,using="//div[@id='newsletter_block_left']//input[@type='text']")
		public static WebElement edi_newsletter;
		
		@FindBy(how=How.XPATH,using="//div[@id='newsletter_block_left']//button")
		public static WebElement btn_newsletter;
		
		//***************************FOLLOW US SECTION*******************//
		@FindBy(how=How.XPATH,using="//h4[normalize-space(text())='Follow us']")
		public static WebElement txt_fallow_us;
		
		@FindBy(how=How.XPATH,using="(//section[@id='social_block']//a)[1]")
		public static WebElement lnk_facebook;


		@FindBy(how=How.XPATH,using="(//section[@id='social_block']//a)[4]")
		public static WebElement lnk_googleplus;
		
		@FindBy(how=How.XPATH,using="(//section[@id='social_block']//a)[2]")
		public static WebElement lnk_twitter;
		
		@FindBy(how=How.XPATH,using="(//section[@id='social_block']//a)[3]")
		public static WebElement lnk_youtube;
		//*************************CATEGORY SECTION***********************//
		@FindBy(how=How.XPATH,using="//h4[normalize-space(text())='Categories']")
		public static WebElement txt_category;
		
		@FindBy(how=How.XPATH,using="(//a[normalize-space(text())='Women'])[2]")
		public static WebElement lnk_bottom_header_women;

		//*************************INFORMATION SECTION***********************//
		@FindBy(how=How.XPATH,using="//h4[normalize-space(text())='Information']")
		public static WebElement txt_information;
		
		@FindBy(how=How.XPATH,using="//a[@title='Specials']")
		public static WebElement lnk_specials;
		
		@FindBy(how=How.XPATH,using="//a[@title='New products']")
		public static WebElement lnk_new_products;
		
		@FindBy(how=How.XPATH,using="//a[@title='Best sellers']")
		public static WebElement lnk_best_sellers;
		
		@FindBy(how=How.XPATH,using="//a[@title='Our stores']")
		public static WebElement lnk_our_stores;
		
		@FindBy(how=How.XPATH,using="//a[@title='Contact us']")
		public static WebElement lnk_bottom_header_contact_us;
		
		@FindBy(how=How.XPATH,using="//a[@title='Terms and conditions of use']")
		public static WebElement lnk_term_and_conditions_of_use;
		
		@FindBy(how=How.XPATH,using="//a[@title='About us']")
		public static WebElement lnk_about_us;
		
		@FindBy(how=How.XPATH,using="//a[@title='Sitemap']")
		public static WebElement lnk_sitemap;
			
		//*************************MY ACCOUNT SECTION***********************//
		@FindBy(how=How.XPATH,using="//h4/a[text()='My account']")
		public static WebElement lnk_my_account;
		
		@FindBy(how=How.XPATH,using="//a[@title='My orders']")
		public static WebElement lnk_my_order;	
		
		@FindBy(how=How.XPATH,using="//a[@title='My credit slips']")
		public static WebElement lnk_my_credit_slips;
		
		@FindBy(how=How.XPATH,using="//a[@title='My addresses']")
		public static WebElement lnk_my_addresses;
		
		@FindBy(how=How.XPATH,using="//a[normalize-space(@title)='Manage my personal information']")
		public static WebElement lnk_my_personal_info;
		
		
		//*************************STORE INFORMATION SECTION***********************//
		@FindBy(how=How.XPATH,using="//h4[normalize-space(text())='Store information']")
		public static WebElement txt_store_information;
		
		@FindBy(how=How.XPATH,using="(//section[@id='block_contact_infos']//li)[1]")
		public static WebElement txt_location_tag;
		
		@FindBy(how=How.XPATH,using="(//section[@id='block_contact_infos']//li//span)[1]")
		public static WebElement txt_bottom_header_cotact_no;
		
		@FindBy(how=How.XPATH,using="//section[@id='block_contact_infos']//li//a")
		public static WebElement lnk_support_emailid;
		
	//*************************INITIALIZING ALL WEBELEMENTS**************************************//
		public  Login() {
			PageFactory.initElements(driver, this);
		}
		
	//**************************METHODS IMPLEMENTATION*******************************************//	
	/*
	 * Method Name := verify_Authentication_parameters()
	 * 
	 * Input Parameter := NA
	 * 
	 * OutPut Parameter := NA
	 * 
	 * Designer #:=Shamsheer
	 * 
	 * Sprint #:=
	 */
	//**********************************************************************************************//	
	public static void verify_Authentication_parameters() {
		verifyElementExist(txt_authentication_heading);
		verifyElementExist(txt_createaccount);
		verifyElementExist(txt_enter_emailid);
		verifyElementExist(txt_createaccount_emailid);
		verifyElementExist(edi_createaccount_emailid);
		verifyElementExist(btn_createaccount);
		verifyElementExist(txt_already_existed);
		verifyElementExist(txt_login_emailid);
		verifyElementExist(edi_login_emailid);
		verifyElementExist(edi_login_password);
		verifyElementExist(lnk_forgot_password);
		brokenlink(lnk_forgot_password);
		verifyElementExist(btn_login);

	}
	// ****************************************************************

	/*
	 * Method Name := click_t_shirts()
	 * 
	 * Input Parameter := NA
	 * 
	 * OutPut Parameter := NA
	 * 
	 * Designer #:=Shamsheer
	 *
	 * Sprint #:=
	 */
	//********************************************************************
	public static Create_an_account click_t_shirts() {
		boolean flag = false;
		try {

			// Hover and Click on the t_shirts link
			hoverAndClick(btn_createaccount);
			flag = true;

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		if (flag)
			System.out.println("Successfully T_shirts Link clicked");
		else
			System.out.println("T_shirts Link Not clicked");
		return new Create_an_account();
	}

}
