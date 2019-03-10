package com.application.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.genericmethods.GenericMethods;

public class My_account extends GenericMethods {
	// *********************************************WEBELEMENT************************************************//

	// *******************************************NAVBAR SECTION***********************************************//
	@FindBy(how = How.XPATH, using = "//a[@title='Log me out']")
	public static WebElement lnk_signout;
	
	//***************************************************************************************************//
	//*****************************INITIALIZING ALL WEBELEMENTS***********************//

	public My_account() {
		PageFactory.initElements(driver, this);
	}

	// *****************************************************************************************************//
	// **************************************************************************************************//
	/*
	 * Method Name := click_signout()
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
	public static Login click_signout() {
		boolean flag = false;
		try {

			// Hover and Click on the Signout link
			hoverAndClick(lnk_signout);
			logStatus("pass", "Successfully Signout Link clicked");
			flag = true;

		} catch (Exception e) {
			logStatus("fail", "Not Successfully Signout Link clicked");
			e.printStackTrace();
		}
		if (flag)
			System.out.println("Successfully Signout Link clicked");
		else
			System.out.println("Signout Link Not clicked");
		return new Login();
	}
	// **************************************************************************************************//

}
