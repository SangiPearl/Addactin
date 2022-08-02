package com.AddactinProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_Elements {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"username\"]")
	private WebElement username;
	
	@FindBy(xpath = "//*[@id=\"password\"]")
	private WebElement pwd;
	
	@FindBy(xpath = "//*[@id=\"login\"]")
	private WebElement login;
	
	@FindBy(xpath = "//*[@id=\"location\"]")
	private WebElement location;
	
	@FindBy(xpath = "//*[@id=\"hotels\"]")
	private WebElement hotel;
	
	@FindBy(xpath = "//*[@id=\"room_type\"]")
	private WebElement roomtype;
	
	@FindBy(xpath = "//*[@id=\"room_nos\"]")
	private WebElement roomnos;
	
	@FindBy(xpath = "//*[@id=\"adult_room\"]")
	private WebElement adult;
	
	@FindBy(xpath = "//*[@id=\"child_room\"]")
	private WebElement child;
	
	
	@FindBy(xpath = "//*[@id=\"Submit\"]")
	private WebElement search;
	
	
	public WebElement getLocation() {
		return location;
	}



	public WebElement getHotel() {
		return hotel;
	}



	public WebElement getRoomtype() {
		return roomtype;
	}



	public WebElement getRoomnos() {
		return roomnos;
	}



	public WebElement getAdult() {
		return adult;
	}



	public WebElement getChild() {
		return child;
	}



	public WebElement getSearch() {
		return search;
	}


	
	
	
	public static WebDriver getDriver() {
		return driver;
	}



	public WebElement getUsername() {
		return username;
	}



	public WebElement getPwd() {
		return pwd;
	}



	public WebElement getLogin() {
		return login;
	}
	

	public Hotel_Elements(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver,this);
	}

	

}
