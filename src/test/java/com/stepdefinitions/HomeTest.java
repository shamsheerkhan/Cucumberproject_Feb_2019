package com.stepdefinitions;

import com.application.pages.Home;
import com.genericmethods.GenericMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomeTest extends GenericMethods{
	public static Home home;
	

	@When("^As user should identify The Title of page as \"(.*?)\"$")
	public void as_user_should_identify_The_Title_of_page_as(String title) {
	 verifyTitle_of_page(title);
	}

	@Then("^As an user should identify the Header parameters of Home Page$")
	public void as_an_user_should_identify_the_Header_parameters_of_Home_Page()  {
	 try {
		 verifyElementExist(home.img_header);
		 brokenlink(home.img_header);
	 }catch(Exception e) {
		 e.printStackTrace();
	 }
	}

	@Then("^As An user should identify the NavBar Parameters of Home page$")
	public void as_An_user_should_identify_the_NavBar_Parameters_of_Home_page()  {
	boolean status=home.verifying_navbar_parameters();
	if(status)
		System.out.println("All NavBar section parameters successfully verified");
	else
		System.out.println("All NavBar section parameters Not verified");
	}

	@Then("^As An user should identify the Search section Parameters of Home page$")
	public void as_An_user_should_identify_the_Search_section_Parameters_of_Home_page() {
	boolean status=home.verifying_search_section_parameters();
	if(status)
		System.out.println("All Search section parameters successfully verified");
	else
		System.out.println("All Search section parameters Not verified");
	}

	@Then("^As an user should identify the cart section parameters of Home page$")
	public void as_an_user_should_identify_the_cart_section_parameters_of_Home_page()  {
		boolean status=home.verifying_cart_section_parameters();
		if(status)
			System.out.println("All Cart section parameters successfully verified");
		else
			System.out.println("All Cart section parameters Not verified");
		 
	}

	@Then("^As an user should identify the tab section parameters of Home page$")
	public void as_an_user_should_identify_the_tab_section_parameters_of_Home_page()  {
		boolean status=home.verifying_tab_1_section_parameters();
		if(status)
			System.out.println("All Tab1 section parameters successfully verified");
		else
			System.out.println("All Tab1t section parameters Not verified");
	}

	@Then("^As an user should identify The Top Baner images should present in Home Page$")
	public void as_an_user_should_identify_The_Top_Baner_images_should_present_in_Home_Page()  {
		boolean status=home.verifying_baner_1_section_parameters();
		if(status)
			System.out.println("All Top Banner section parameters successfully verified");
		else
			System.out.println("All Top Banner section parameters Not verified"); 
	}

	@Then("^As an user should identify The verifying Production Section parameters on Home Page$")
	public void as_an_user_should_identify_The_verifying_Production_Section_parameters_on_Home_Page() {
		boolean status=home.verifying_product_section_parameters();
		if(status)
			System.out.println("All Product section parameters successfully verified");
		else
			System.out.println("Product section parameters Not verified"); 
	}

	@Then("^As an user should identify The  Popular Link and the products of popular  present in Home page$")
	public void as_an_user_should_identify_The_Popular_Link_and_the_products_of_popular_present_in_Home_page()  {
		boolean status=home.verifying_popular_product_section_parameters();
		if(status)
			System.out.println("All Product section parameters successfully verified");
		else
			System.out.println("Product section parameters Not verified");    
	}

	@Then("^As an user should identify The  BestSeller Link and the products of BestSeller  present in Home page$")
	public void as_an_user_should_identify_The_BestSeller_Link_and_the_products_of_BestSeller_present_in_Home_page()  {
	   boolean status=home.verifying_click_on_Bestseller_Link();
	   if(status) {
		 try {
			 boolean flag=home.verifying_bestseller_product_section_parameters();
			 if(flag)
				 System.out.println("All Best Seller Section parameters are verified");
			 else
				 System.out.println("All Best Seller Section parameters are not verified");
		 }catch(Exception e) {
			e.printStackTrace();
		 }
	   }else
		   System.out.println("BestSeller Link is not clicked");
	}

	@Then("^As an user should identify The Bottom Baner images should present in Home Page$")
	public void as_an_user_should_identify_The_Bottom_Baner_images_should_present_in_Home_Page()  {
		boolean status=home.verifying_baner_2_section_parameters();
		if(status)
			System.out.println("All Bottom Banner Section parameters successfully verified");
		else
			System.out.println("Bottom Banner Section parameters Not verified");    
	}





}
