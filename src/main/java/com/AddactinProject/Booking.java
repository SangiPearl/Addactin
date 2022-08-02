package com.AddactinProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking {
	
public static WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"radiobutton_0\"]")
	private WebElement hotelclick;
	
	@FindBy(xpath = "//*[@id=\"continue\"]")
	private WebElement continue_button;
	
	@FindBy(xpath = "//*[@id=\"first_name\"]")
	private WebElement firstname;
	
	@FindBy(xpath = "//*[@id=\"last_name\"]")
	private WebElement lastname;
	
	@FindBy(xpath = "//*[@id=\"address\"]")
	private WebElement address;
	
	@FindBy(xpath = "//*[@id=\"cc_num\"]")
	private WebElement cardno;
	
	@FindBy(xpath = "//*[@id=\"cc_type\"]")
	private WebElement cardtype;
	
	@FindBy(xpath = "//*[@id=\"cc_exp_month\"]")
	private WebElement month;
	
	@FindBy(xpath = "//*[@id=\"cc_exp_year\"]")
	private WebElement year;
	
	@FindBy(xpath = "//*[@id=\"cc_cvv\"]")
	private WebElement cvv;
	
	@FindBy(xpath = "//*[@id=\"book_now\"]")
	private WebElement booknow;
	
	public Booking(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver,this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getHotelclick() {
		return hotelclick;
	}

	public WebElement getContinue_button() {
		return continue_button;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardno() {
		return cardno;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBooknow() {
		return booknow;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
