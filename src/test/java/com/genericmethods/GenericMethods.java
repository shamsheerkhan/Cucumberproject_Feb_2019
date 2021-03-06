package com.genericmethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;

import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.MakeExtentReport;
import utils.Reports_utils;



public class GenericMethods extends MakeExtentReport {
	public static WebDriver driver;
	

	// ****************************************GENERICMETHODS**********************//
	/*
	 * Method Name := hoverAndClick()
	 * 
	 * Input Parameter := WebElement
	 * 
	 * OutPut Parameter := Boolean
	 * 
	 * Designer #:= shamsheer
	 * 
	 * Sprint #:=
	 */
	// ********************************************************************************//
	public static void hoverAndClick(WebElement element)  {

		try {
			// Wait till the WebElement is Displayed
			new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(element));
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			for (int i = 0; i <= 3; i++) {
				js.executeScript("arguments[0].style.border='2px solid red'", element);
			}
						
			Actions ass = new Actions(driver);
			ass.moveToElement(element).click(element).build().perform();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// **************************************************************//
	/*
	 * Method Name := lanunchBowser()
	 * 
	 * Input Parameter := Browser name, application Url
	 * 
	 * OutPut Parameter := Launching Browser
	 * 
	 * Designer #:= shamsheer
	 * 
	 * Sprint #:=
	 */
	// ********************************************************************************//
	public static void lanunchBowser(String browsername, String url) {

		if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browsername.equalsIgnoreCase("firefox")) {

			driver = new FirefoxDriver();
		} else
			driver = new FirefoxDriver();
		driver.manage().window().maximize();
		new WebDriverWait(driver, 5);
		driver.get(url);
	}

	// **************************************************************//
	/*
	 * Method Name := tearDownBrowser()
	 * 
	 * Input Parameter := NA
	 * 
	 * OutPut Parameter := Quit Browser
	 * 
	 * Designer #:= shamsheer
	 * 
	 * Sprint #:=
	 */
	// ********************************************************************************//

	public static void tearDownBrowser() {
		driver.close();
	}

	// **************************************************************//
	/*
	 * Method Name := brokenlink()
	 * 
	 * Input Parameter := Link URL
	 * 
	 * OutPut Parameter := Response code message
	 * 
	 * Designer #:= shamsheer
	 * 
	 * Sprint #:=
	 */
	// ********************************************************************************//
	public static void brokenlink(WebElement element) {
		try {
			String linkurl = getlinkurl(element);
			String lnkname = getElementname(element);
			URL url = new URL(linkurl);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.connect();
			if (connection.getResponseCode() == 200) {
				System.out.println(lnkname + "<--Response code is-->" + connection.getResponseCode());
			} else {
				System.out.println(lnkname + "<--Response code is-->" + connection.getResponseCode());
			}
		} catch (MalformedURLException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	// **************************************************************//
	/*
	 * Method Name := verifyElementExist()
	 * 
	 * Input Parameter := WebElement
	 * 
	 * OutPut Parameter :=
	 * 
	 * Designer #:= shamsheer
	 * 
	 * Sprint #:=
	 */
	// ********************************************************************************//
	public static void verifyElementExist(WebElement element) {
		try {
			new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOf(element));
			String elementname = getElementname(element);
			String pagename = driver.getTitle();
			if (element.isDisplayed()) {
				System.out.println(elementname + " is Displayed in " + pagename);
			} else
				System.out.println(elementname + " is Not Displayed in " + pagename);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// **************************************************************//
	/*
	 * Method Name := verifyElementColour()
	 * 
	 * Input Parameter := WebElement
	 * 
	 * OutPut Parameter :=
	 * 
	 * Designer #:= shamsheer
	 * 
	 * Sprint #:=
	 */
	// ********************************************************************************//
	public static String getElementColour(WebElement element) {
		String elementcolour = "";
		try {
			String elementname = getElementname(element);
			elementcolour = element.getCssValue("color");

			if (elementcolour != null) {
				System.out.println(elementname + " is having colour " + elementcolour);
			} else
				System.out.println(elementname + " colour is not defined " + elementcolour);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return elementcolour;
	}

	// **************************************************************//
	/*
	 * Method Name := getElementname()
	 * 
	 * Input Parameter := WebElement
	 * 
	 * OutPut Parameter := Element Name
	 * 
	 * Designer #:= shamsheer
	 * 
	 * Sprint #:=
	 */
	// ********************************************************************************//
	public static String getElementname(WebElement element) {
		String lnkname = "";
		String linkurl = null;
		try {
			linkurl = getlinkurl(element);
			try {
				lnkname = element.getText();
				if (lnkname == null) {
					lnkname = linkurl.substring(linkurl.lastIndexOf("/") + 1, linkurl.lastIndexOf("."));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (Exception e) {
			System.out.println("un able to get the name of given WebElement");
		}
		return lnkname;
	}

	// **************************************************************//
	/*
	 * Method Name := getlinkurl()
	 * 
	 * Input Parameter := WebElement
	 * 
	 * OutPut Parameter := ElementAttribute value
	 * 
	 * Designer #:= shamsheer
	 * 
	 * Sprint #:=
	 */
	// ********************************************************************************//
	public static String getlinkurl(WebElement element) {
		String linkurl = null;

		try {

			linkurl = element.getAttribute("href");
			if (linkurl == null) {

				linkurl = element.getAttribute("src");
			}
		} catch (Exception e) {
			System.out.println("un able to get attribute of :" + getElementname(element));
		}
		return linkurl;
	}

	// *******************************************************************************//
	/*
	 * Method Name := verifyTitle_of_page()
	 * 
	 * Input Parameter := Expected Title
	 * 
	 * OutPut Parameter := NA
	 * 
	 * Designer #:= shamsheer
	 * 
	 * Sprint #:=
	 */
//********************************************************************************//
	public static void verifyTitle_of_page(String exp_title) {
		String act_title = driver.getTitle();
		String pageName = act_title;
		if (act_title.equals((exp_title).trim()))
			System.out.println("The title of " + pageName + " is Matched");
		else
			System.out.println("The title of " + pageName + " is Not Matched");
	}

	// *******************************************************************************//
	/*
	 * Method Name := verifyElementColor()
	 * 
	 * Input Parameter := Expected color, Element
	 * 
	 * OutPut Parameter := NA
	 * 
	 * Designer #:= shamsheer
	 * 
	 * Sprint #:=
	 */
//********************************************************************************//
	public static void verifyElementColor(String ecp_color, WebElement element) {
		String act_color = getElementColour(element);
		if (act_color.equals((ecp_color).trim()))
			System.out.println("color is matched");
		else
			System.out.println("color is not matched");
	}

	// *******************************************************************************//
	/*
	 * Method Name := verifyElementText()
	 * 
	 * Input Parameter := Expected test, Element
	 * 
	 * OutPut Parameter := NA
	 * 
	 * Designer #:= shamsheer
	 * 
	 * Sprint #:=
	 */
//********************************************************************************//
	public static void verifyElementText(String exp_text, WebElement element) {
		String act_text = getElementname(element);
		if (act_text.equals((exp_text).trim()))
			System.out.println("Element Text is matched");
		else
			System.out.println("Element Text is Not matched");
	}

	// *******************************************************************************//
	/*
	 * Method Name := verify_single_child_tab_title()
	 * 
	 * Input Parameter := Expected title, Element
	 * 
	 * OutPut Parameter := NA
	 * 
	 * Designer #:= shamsheer
	 * 
	 * Sprint #:=
	 */
//********************************************************************************//
	public static void verify_single_child_tab_title(WebElement element, String title) throws IOException {
		hoverAndClick(element);
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();
		String parentwindow_id = it.next();
		String childwindow_id = it.next();
		driver.switchTo().window(childwindow_id);
		String act_title = driver.getTitle();
		if (act_title.equals(title)) {
			System.out.println("Title is matched");
		} else {
			System.out.println("Title is not matched");
		}
		driver.close();
		driver.switchTo().window(parentwindow_id);

	}

//***********************************************************************************//
	// *******************************************************************************//
	/*
	 * Method Name := select_value_from_dropdown()
	 * 
	 * Input Parameter := Element, visible value
	 * 
	 * OutPut Parameter := NA
	 * 
	 * Designer #:= shamsheer
	 * 
	 * Sprint #:=
	 */
	// ********************************************************************************//
	public static void select_value_from_dropdown(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);

	}

	// ***********************************************************************************//
	// *******************************************************************************//
	/*
	 * Method Name := select_text_value_from_dropdown()
	 * 
	 * Input Parameter := Element, visible text value
	 * 
	 * OutPut Parameter := NA
	 * 
	 * Designer #:= shamsheer
	 * 
	 * Sprint #:=
	 */
	// ********************************************************************************//
	public static void select_text_value_from_dropdown(WebElement element, String value) {
		Select select = new Select(element);

		select.selectByVisibleText(value);

	}

	// ***********************************************************************************//

}
