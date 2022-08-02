package com.AddactinProject;

import org.openqa.selenium.WebDriver;


public class POM {
	
	public WebDriver driver;

	public POM(WebDriver driver4) {
		this.driver = driver4;

	}

	public Booking getBP() {
		Booking bp = new Booking(driver);
		return bp;
	}

	public Hotel_Elements getHP() {
		Hotel_Elements hp = new Hotel_Elements(driver);
		return hp;
	}


}
