package com.application.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.genericmethods.GenericMethods;

public class Home extends GenericMethods{
	//*********************************************WEBELEMENT************************************************//

	//*******************************************HEADER***********************************************//
			
			@FindBy(how=How.XPATH,using="(//header[@id='header']//img)[1]")
			public static WebElement img_header;
			
		//***********************************NAVBAR SELECTION*****************************************//
			@FindBy(how=How.XPATH,using="//*[@title='Log in to your customer account']")
			public static WebElement lnk_signin;
			
			@FindBy(how=How.XPATH,using="//*[@title='Contact Us']")
			public static WebElement lnk_contacts_us;
			
			@FindBy(how=How.XPATH,using="(//header[@id='header']//span)[1]")
			public static WebElement txt_contact_no;
							
	//***************************************SEARCH SECTION**********************************************//		
			
			@FindBy(how=How.XPATH,using="//input[@id='search_query_top']")
			public static WebElement edi_search;
			
			@FindBy(how=How.XPATH,using="(//button[@type='submit'])[1]")
			public static WebElement btn_search;
			
			@FindBy(how=How.XPATH,using="//div[@id='header_logo']//img")
			public static WebElement img_logo;
			
	//*******************************CART SECTION*******************************************//
			
			@FindBy(how=How.XPATH,using="//a[@title='View my shopping cart']")
			public static WebElement lnk_cart;
			
	//**************************************TAB_1 SECTION***************************************************//		
			
			@FindBy(how=How.XPATH,using="//a[@title='Women']")
			public static WebElement lnk_women;
			
			@FindBy(how=How.XPATH,using="(//a[@title='Dresses'])[2]")
			public static WebElement lnk_dress;
			
			@FindBy(how=How.XPATH,using="(//a[@title='T-shirts'])[2]")
			public static WebElement lnk_t_shirts;
			
	//***********************************BANER_1 SECTION***************************************************//		
			
			@FindBy(how=How.XPATH,using="(//div[@id='slider_row']//a)[6]")
			public static WebElement lnk_previous;
			
			@FindBy(how=How.XPATH,using="(//div[@id='slider_row']//a)[7]")
			public static WebElement lnk_next;
					
			@FindBy(how=How.XPATH,using="(//div[@id='htmlcontent_top']//img)[1]")
			public static WebElement img_sale25off;
			
			@FindBy(how=How.XPATH,using="(//div[@id='htmlcontent_top']//img)[2]")
			public static WebElement img_summer45off;

			
	//*************************************************PRODUCTS****************************************************//		
		
			//*******************************LINK POPULAR***********************************//
			
			@FindBy(how=How.XPATH,using="//a[@data-toggle='tab'and normalize-space(text())='Popular']")
			public static WebElement lnk_popular;
			
			//*********************FADED SHORT SLEEVE T-SHIRTS POPULAR*************************//	
			@FindBy(how=How.XPATH,using="//ul[@id='homefeatured']//img[@title='Faded Short Sleeve T-shirts' ]")
			public static WebElement img_FadedShortSleeve_T_shirts;
			
			
			//*******************************BLOUSE POPULAR******************************//	
			
			@FindBy(how=How.XPATH,using="//ul[@id='homefeatured']//img[@title='Blouse']")
			public static WebElement img_Blouse;
			
			//********************PRINTED DRESS_1 POPULAR*************************//	
			
			@FindBy(how=How.XPATH,using="(//ul[@id='homefeatured']//img[@title='Printed Dress'])[1]")
			public static WebElement img_printed_dress1;
			
			
			//********************PRINTED DRESS_2 POPULAR*************************//	
			
			@FindBy(how=How.XPATH,using="(//ul[@id='homefeatured']//img[@title='Printed Dress'])[2]")
			public static WebElement img_printed_dress2;
		
			//**************************PRINTED SUMMER DRESS_1 POPULAR************************//
			
			@FindBy(how=How.XPATH,using="(//ul[@id='homefeatured']//img[@title='Printed Summer Dress'])[1]")
			public static WebElement img_printed_summer_dress1;
			
		
			//**************************PRINTED SUMMER DRESS_2 POPULAR************************//
			
			@FindBy(how=How.XPATH,using="(//ul[@id='homefeatured']//img[@title='Printed Summer Dress'])[2]")
			public static WebElement img_printed_summer_dress2;
			
			
			//**********************PRINTED CHIFFON DRESS POPULAR***********************//		
			
			@FindBy(how=How.XPATH,using="//ul[@id='homefeatured']//img[@title='Printed Chiffon Dress']")
			public static WebElement img_printed_chiffon_dress;
			
			
			
	//******************************************LINK BEST SELLER**************************************************//	
			
			@FindBy(how=How.XPATH,using="//a[@data-toggle='tab'and normalize-space(text())='Best Sellers']")
			public static WebElement lnk_bestseller;	
			
		//**********************PRINTED CHIFFON DRESS BEST SELLER***********************//	
			
			@FindBy(how=How.XPATH,using="//ul[@id='blockbestsellers']//img[@title='Printed Chiffon Dress']")
			public static WebElement img_printed_chiffon_dress_bestseller;
			
		
			
			@FindBy(how=How.XPATH,using="//ul[@id='blockbestsellers']//a[@title='Printed Chiffon Dress']")
			public static WebElement lnk_printed_chiffon_dress_bestseller;
			
			@FindBy(how=How.XPATH,using="(//span[@itemprop='price'])[16]")
			public static WebElement txt_printed_chiffon_dress_price_bestseller;
			
		//*********************FADED SHORT SLEEVE T-SHIRTS BEST SELLER*************************//	
			
			@FindBy(how=How.XPATH,using="//ul[@id='blockbestsellers']//img[@title='Faded Short Sleeve T-shirts' ]")
			public static WebElement img_FadedShortSleeve_T_shirts_bestseller;
			
			
			
			
		//*******************************BLOUSE BEST SELLER******************************//	
			
			@FindBy(how=How.XPATH,using="//ul[@id='blockbestsellers']//img[@title='Blouse']")
			public static WebElement img_Blouse_bestseller;
			
			
			

			//********************PRINTED SUMMER DRESS_1 BEST SELLER*************************//	
			
			@FindBy(how=How.XPATH,using="(//ul[@id='blockbestsellers']//img[@title='Printed Summer Dress'])[1]")
			public static WebElement img_printed_summer_dress1_bestseller;
			
			
		//*****************************PRINTED DRESS_1 BEST SELLER****************************//	
			@FindBy(how=How.XPATH,using="(//ul[@id='blockbestsellers']//img[@title='Printed Dress'])[1]")
			public static WebElement img_printed_dress1_bestseller;
			
			

		//**************************PRINTED SUMMER DRESS_2 BEST SELLER************************//
			
			@FindBy(how=How.XPATH,using="(//ul[@id='blockbestsellers']//img[@title='Printed Summer Dress'])[2]")
			public static WebElement img_printed_summer_dress2_bestseller;
			
			
		//***************************PRINTED DRESS_2 BEST SELLER*****************************//
			
			@FindBy(how=How.XPATH,using="(//ul[@id='blockbestsellers']//img[@title='Printed Dress'])[2]")
			public static WebElement img_printed_dress2_bestseller;
			
		
	//***************************************BANER_2 SECTION***********************************************//	
			
			@FindBy(how=How.XPATH,using="(//div[@id='htmlcontent_home']//img)[1]")
			public static WebElement img_top_trendds;
			
			@FindBy(how=How.XPATH,using="(//div[@id='htmlcontent_home']//img)[2]")
			public static WebElement img_mens_coats_and_jackets;
			
			@FindBy(how=How.XPATH,using="(//div[@id='htmlcontent_home']//img)[3]")
			public static WebElement img_womens_coats_and_jackets;
			
			@FindBy(how=How.XPATH,using="(//div[@id='htmlcontent_home']//img)[4]")
			public static WebElement img_sunglasses_eyewear;
			
			@FindBy(how=How.XPATH,using="(//div[@id='htmlcontent_home']//img)[5]")
			public static WebElement img_savvytrends_handbag;
	//*****************************INITIALIZING ALL WEBELEMENTS***********************//
		
			public Home() {
			PageFactory.initElements(driver,this);	
		}
			
	// *****************************************************************************************************//

		
			

	//***********************************************************************
		/*
		 * Method Name := verifying_navbar_parameters()
		 * 
		 * Input Parameter := NA
		 * 
		 * OutPut Parameter := NA
		 * 
		 * Designer #:=Shamsheer
		 * 
		 * Sprint #:=
		 */	
	//*************************************************************************	
		 public static boolean verifying_navbar_parameters() {
			boolean status=true;
			 try{ 
			 try {
					 verifyElementExist(lnk_signin);
				 
						brokenlink(lnk_signin);	
			 }catch(Exception e){
					System.out.println(e.getMessage());
				}
			 
			try { 
				verifyElementExist(lnk_contacts_us);
				 brokenlink(lnk_contacts_us);	
				}catch(Exception e){
						e.printStackTrace();
					}
				 
			 verifyElementExist(txt_contact_no);
			 status=true;	
				}catch(Exception e){
					e.printStackTrace();
				}
			return status; 
			 
		 }
		 
	//***********************************************************************
		/*
		 * Method Name := verifying_search_section_parameters()
		 * 
		 * Input Parameter := NA
		 * 
		 * OutPut Parameter := NA
		 * 
		 * Designer #:=Shamsheer
		 * 
		 * Sprint #:=
		 */	
			
		public static boolean verifying_search_section_parameters() {
			boolean status=false;
			 try {
				 verifyElementExist(img_logo);
					brokenlink(img_logo);	
				 verifyElementExist(edi_search);
				 verifyElementExist(btn_search);
				
				status=true;
					}
			catch(Exception e){
				e.printStackTrace();
			}
				 
			 return status;
		 }	 
			 
	//***********************************************************************
		/*
		 * Method Name := verifying_cart_section_parameters()
		 * 
		 * Input Parameter := NA
		 * 
		 * OutPut Parameter := NA
		 * 
		 * Designer #:=Shamsheer
		 * 
		 * Sprint #:=
		 */		

		public static boolean verifying_cart_section_parameters() {
			boolean status=false;
			try {
				verifyElementExist(lnk_cart);
				brokenlink(lnk_cart);					
				status=true;
				}
			catch(Exception e){
				e.printStackTrace();
				}
				 
				return status;
			 }
		
	//***********************************************************************
		/*
		 * Method Name := verifying_baner_1_section_parameters()
		 * 
		 * Input Parameter := NA
		 * 
		 * OutPut Parameter := NA
		 * 
		 * Designer #:=Shamsheer
		 * 
		 * Sprint #:=
		 */		

		public static boolean verifying_baner_1_section_parameters() {
			boolean status=false;
			try{
				
			verifyElementExist(lnk_previous);
			verifyElementExist(lnk_next);
			
			try {
				verifyElementExist(img_sale25off);
				brokenlink(img_sale25off);
			}catch(Exception e){
				e.printStackTrace();
				}
			try {
				verifyElementExist(img_summer45off);
				brokenlink(img_summer45off);
					 
			}catch(Exception e){
				e.printStackTrace();
				}
				status=true;
		}catch(Exception e){
			e.printStackTrace();
			}
		return status;
				 
				
			 }		
		 		
		//***********************************************************************
			/*
			 * Method Name := verifying_tab_1_section_parameters()
			 * 
			 * Input Parameter := NA
			 * 
			 * OutPut Parameter := NA
			 * 
			 * Designer #:=Shamsheer
			 * 
			 * Sprint #:=
			 */		

			public static boolean verifying_tab_1_section_parameters() {
				boolean status=false;
			try{	try {
					verifyElementExist(lnk_women);
					brokenlink(lnk_women);
				}catch(Exception e){
					e.printStackTrace();
					}
				try {
					verifyElementExist(lnk_dress);
					brokenlink(lnk_dress);
						
				}catch(Exception e){
					e.printStackTrace();
					}
				try {
					verifyElementExist(lnk_t_shirts);
					brokenlink(lnk_t_shirts);
				}catch(Exception e){
					e.printStackTrace();
					}
			status=true;
			}catch(Exception e){
				e.printStackTrace();
				}
			return status;
			}		

	//***********************************************************************
			/*
			 * Method Name := verifying_product_section_parameters()
			 * 
			 * Input Parameter := NA
			 * 
			 * OutPut Parameter := NA
			 * 
			 * Designer #:=Shamsheer
			 * 
			 * Sprint #:=
			 */		

		public static boolean verifying_product_section_parameters() {
			boolean status=false;
				
			try {
				try {
					verifyElementExist(lnk_popular);
					brokenlink(lnk_popular);
					}catch(Exception e){
					e.printStackTrace();
					}
				try {
					verifyElementExist(lnk_bestseller);
					brokenlink(lnk_bestseller);
					
				}catch(Exception e){
					e.printStackTrace();
					}
					
				status=true;
				}catch(Exception e){
				e.printStackTrace();
				}
								 
			return status;
			 }		
		
	//***********************************************************************
			/*
			 * Method Name := verifying_click_on_popular_Link()
			 * 
			 * Input Parameter := NA
			 * 
			 * OutPut Parameter := NA
			 * 
			 * Designer #:=Shamsheer
			 * 
			 * Sprint #:=
			 */		

		public static void verifying_click_on_popular_Link() {
			boolean status=false;
					
			try {
				hoverAndClick(lnk_popular);
					
				status=true;
					}
			catch(Exception e){
				e.printStackTrace();
				}
			if(status=true)
				System.out.println("Successfully Popular Link clicked");
			else
				System.out.println("Popular Link Not clicked");		
		}	
		
	//***********************************************************************
			/*
			 * Method Name := verifying_popular_product_section_parameters()
			 * 
			 * Input Parameter := NA
			 * 
			 * OutPut Parameter := NA
			 * 
			 * Designer #:=Shamsheer
			 * 
			 * Sprint #:=
			 */		

		public static boolean verifying_popular_product_section_parameters() {
			boolean status=false;
						
			try {
				try {
					verifyElementExist(img_FadedShortSleeve_T_shirts);
					brokenlink(img_FadedShortSleeve_T_shirts);
				}catch(Exception e){
					e.printStackTrace();
					}
				try {
					verifyElementExist(img_Blouse);
					brokenlink(img_Blouse);
					
				}catch(Exception e){
					e.printStackTrace();
					}
				try {
					verifyElementExist(img_printed_dress1);
					brokenlink(img_printed_dress1);
				}catch(Exception e){
					e.printStackTrace();
					}
				try {
					verifyElementExist(img_printed_dress2);
					brokenlink(img_printed_dress2);
			}catch(Exception e){
					e.printStackTrace();
					}
				try {
					verifyElementExist(img_printed_summer_dress1);
					brokenlink(img_printed_summer_dress1);
					}catch(Exception e){
					e.printStackTrace();
					}
				try {
					verifyElementExist(img_printed_summer_dress2);
					brokenlink(img_printed_summer_dress2);
					}catch(Exception e){
					e.printStackTrace();
					}
				try {
					verifyElementExist(img_printed_chiffon_dress);
					brokenlink(img_printed_chiffon_dress);
					}catch(Exception e){
					e.printStackTrace();
					}
				status=true;
				}
			catch(Exception e){
				System.out.println(e.getMessage());
				}
				return status;
			 }	

	//***********************************************************************
				/*
				 * Method Name := verifying_click_on_Bestseller_Link()
				 * 
				 * Input Parameter := NA
				 * 
				 * OutPut Parameter := NA
				 * 
				 * Designer #:=Shamsheer
				 * 
				 * Sprint #:=
				 */		

		public static boolean verifying_click_on_Bestseller_Link() {
			boolean status=false;
						
			try {
				hoverAndClick(lnk_bestseller);
				status=true;
					}
			catch(Exception e){
				System.out.println(e.getMessage());
				}
			return status;		
			}	
				
	//***********************************************************************
			/*
			 * Method Name := verifying_bestseller_product_section_parameters()
			 * 
			 * Input Parameter := NA
			 * 
			 * OutPut Parameter := NA
			 * 
			 * Designer #:=Shamsheer
			 * 
			 * Sprint #:=
			 */		

			public static boolean verifying_bestseller_product_section_parameters() {
				boolean status=false;
						
				try {
					try {
						verifyElementExist(img_printed_chiffon_dress_bestseller);
						brokenlink(img_printed_chiffon_dress_bestseller);
					}catch(Exception e){
						e.printStackTrace();
						}
					try {
						verifyElementExist(lnk_printed_chiffon_dress_bestseller);
						brokenlink(lnk_printed_chiffon_dress_bestseller);
						}catch(Exception e){
						e.printStackTrace();
						}
					
					try {
						verifyElementExist(lnk_printed_chiffon_dress_bestseller);
						brokenlink(lnk_printed_chiffon_dress_bestseller);
						}catch(Exception e){
						e.printStackTrace();
						}
					verifyElementExist(txt_printed_chiffon_dress_price_bestseller);
					try {
						verifyElementExist(img_FadedShortSleeve_T_shirts_bestseller);
						brokenlink(img_FadedShortSleeve_T_shirts_bestseller);
					}catch(Exception e){
						e.printStackTrace();
						}
					try {
						verifyElementExist(img_Blouse_bestseller);
						brokenlink(img_Blouse_bestseller);
						}catch(Exception e){
						e.printStackTrace();
						}
					try {
						verifyElementExist(img_printed_summer_dress1_bestseller);
						brokenlink(img_printed_summer_dress1_bestseller);
						}catch(Exception e){
						e.printStackTrace();
						}
					try {
						verifyElementExist(img_printed_dress1_bestseller);
						brokenlink(img_printed_dress1_bestseller);
						}catch(Exception e){
						e.printStackTrace();
						}
					try {
						verifyElementExist(img_printed_summer_dress2_bestseller);
						brokenlink(img_printed_summer_dress2_bestseller);
						}catch(Exception e){
						e.printStackTrace();
						}
					try {
						verifyElementExist(img_printed_dress2_bestseller);
						brokenlink(img_printed_dress2_bestseller);
						}catch(Exception e){
						e.printStackTrace();
						}
					
					status=true;
				}catch(Exception e){
					System.out.println(e.getMessage());
					}
												 
				return status;
			 }	
		
	//***********************************************************************
			/*
			 * Method Name := verifying_baner_2_section_parameters()
			 * 
			 * Input Parameter := NA
			 * 
			 * OutPut Parameter := NA
			 * 
			 * Designer #:=Shamsheer
			 * 
			 * Sprint #:=
			 */		

		public static boolean verifying_baner_2_section_parameters() {
			boolean status=false;
			try {
				try {
					verifyElementExist(img_top_trendds);
					brokenlink(img_top_trendds);
					}catch(Exception e){
					e.printStackTrace();
					}
				try {
					verifyElementExist(img_mens_coats_and_jackets);
					brokenlink(img_mens_coats_and_jackets);
					}catch(Exception e){
					e.printStackTrace();
					}
				try {
					verifyElementExist(img_womens_coats_and_jackets);
					brokenlink(img_womens_coats_and_jackets);
				}catch(Exception e){
					e.printStackTrace();
					}		
				try {
					verifyElementExist(img_sunglasses_eyewear);
					brokenlink(img_sunglasses_eyewear);
					}catch(Exception e){
					e.printStackTrace();
					}
				try {
					verifyElementExist(img_savvytrends_handbag);
					brokenlink(img_savvytrends_handbag);
					}catch(Exception e){
					e.printStackTrace();
					}
				status=true;
				}
			catch(Exception e){
				System.out.println(e.getMessage()); 
				}
				return status;
			}
			
	//****************************************************************
			
		/*
		 * Method Name := click_contacts_us()
		 * 
		 * Input Parameter := NA
		 * 
		 * OutPut Parameter := NA
		 * 
		 * Designer #:=Shamsheer
		 * 
		 * Sprint #:=
		 */

		public static Contacts_us click_contacts_us(){
			boolean flag=false;
			try{
				
				//Hover and Click on the contacts_us link
				hoverAndClick(lnk_contacts_us);
				flag=true;
					
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
			if(flag)
				System.out.println("Successfully Contacts_us Link clicked");
			else
				System.out.println("Contacts_us Link Not clicked");
				return new Contacts_us();
			}		
			
	//****************************************************************
		
			/*
			 * Method Name := click_SignIn()
			 * 
			 * Input Parameter := NA
			 * 
			 * OutPut Parameter := NA
			 * 
			 * Designer #:=Shamsheer
			 * 
			 * Sprint #:=
			 */

		public static Login click_signin(){
			boolean flag=false;
			try{
				
				//Hover and Click on the signin link
				hoverAndClick(lnk_signin);
				flag=true;
				
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
			if(flag) {
				System.out.println("Successfully SignIn Link clicked");
			logstatus("pass", "Successfully SignIn Link clicked");	
			}
			else
				System.out.println("SignIn Link Not clicked");
				return new Login();
		}

		
	//****************************************************************
		
		/*
		 * Method Name := click_cart()
		 * 
		 * Input Parameter := NA
		 * 
		 * OutPut Parameter := NA
		 * 
		 * Designer #:=Shamsheer
	  	 * 
		 * Sprint #:=
		 */

		public static Cart click_cart(){
			boolean flag=false;
			try{
					
			//Hover and Click on the cart link
			hoverAndClick(lnk_cart);
			flag=true;
						
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
			if(flag)
				System.out.println("Successfully Cart Link clicked");
			else
				System.out.println("Cart Link Not clicked");
			return new Cart();
			}
			
	//****************************************************************
			
		/*
		 * Method Name := click_women()
		 * 
		 * Input Parameter := NA
		 * 
		 * OutPut Parameter := NA
		 * 
		 * Designer #:=Shamsheer
		 * 
		 * Sprint #:=
		 */

		public static Women click_women(){
			boolean flag=false;
			try{
						
			//Hover and Click on the women link
			hoverAndClick(lnk_women);
			flag=true;
						
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
			if(flag)
				System.out.println("Successfully Women Link clicked");
			else
				System.out.println("Women Link Not clicked");
			return new Women();
			}	
				
		
	//****************************************************************
		
		/*
		 * Method Name := click_dress()
		 * 
		 * Input Parameter := NA
		 * 
		 * OutPut Parameter := NA
		 * 
		 * Designer #:=Shamsheer
		 *
		 * Sprint #:=
		 */

		public static Dress click_dress(){
			boolean flag=false;
			try{
							
			//Hover and Click on the dress link
			hoverAndClick(lnk_dress);
			flag=true;				
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
			if(flag)
				System.out.println("Successfully Dress Link clicked");
			else
				System.out.println("Dress Link Not clicked");
			return new Dress();
			}		
		
	//****************************************************************
		
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

		public static T_shirts click_t_shirts(){
			boolean flag=false;
			try{
							
			//Hover and Click on the t_shirts link
			hoverAndClick(lnk_t_shirts);
			flag=true;
								
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
			if(flag)
				System.out.println("Successfully T_shirts Link clicked");
			else
				System.out.println("T_shirts Link Not clicked");
			return new T_shirts();
			}	
		

}
