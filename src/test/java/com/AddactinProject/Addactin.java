package com.AddactinProject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Addactin extends BaseClass {

	public static WebDriver driver = BaseClass.browserLaunch("chrome");;
	public static Hotel_Elements h = new Hotel_Elements(driver);
	public static POM p = new POM(driver);

	@Test(priority = 1)
	public void setproperty() throws InterruptedException {
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\SANGEETHA\\Desktop\\now\\chromedriver.exe");
		// driver = new ChromeDriver();
		// driver = browserLaunch("chrome");
		openurl("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@Test(priority = 2)
	private void book_hotel() {
		entervalue(h.getUsername(), "SangiSai");
		entervalue(h.getPwd(), "Sairam@123");
		clickonButton(h.getLogin());

	}

	@Test(priority = 3)
	private void search() {
		dropdown(h.getLocation(), "index", "3");
		wait(100);
		dropdown(h.getHotel(), "index", "3");
		wait(100);
		dropdown(h.getRoomtype(), "index", "3");
		wait(100);
		dropdown(h.getRoomnos(), "index", "3");
		wait(100);
		dropdown(h.getAdult(), "index", "3");
		wait(100);
		dropdown(h.getChild(), "index", "3");
		wait(100);
		clickonButton(h.getSearch());
		wait(100);

	}

	@Test(priority = 4)
	private void selectHotel() {
		// driver.findElement(By.xpath("//*[@id=\"radiobutton_0\"]")).click();
		clickonButton(p.getBP().getHotelclick());
		// driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		clickonButton(p.getBP().getContinue_button());

	}

	@Test(priority = 5)
	private void book_hotel1() throws IOException {
		entervalue(p.getBP().getFirstname(), "Sangeetha");
		wait(100);
		entervalue(p.getBP().getLastname(), "sai");
		wait(100);
		entervalue(p.getBP().getAddress(), "chennai");
		wait(100);
		entervalue(p.getBP().getCardno(), "1234567891234567");
		wait(100);
		dropdown(p.getBP().getCardtype(), "index", "3");
		wait(100);
		dropdown(p.getBP().getMonth(), "index", "3");
		wait(100);
		dropdown(p.getBP().getYear(), "index", "3");
		wait(100);
		entervalue(p.getBP().getCvv(), "589");
		wait(100);
		clickonButton(p.getBP().getBooknow());

		wait(100);
		
		driver.findElement(By.xpath("//*[@id=\"my_itinerary\"]")).click();
		
		wait(100);
		screenshot("D:\\2021\\AddactinProject\\image\\order.png");
		wait(500);
		
	}

	@Test(priority = 6)
	public void closebrowser() {

		// driver.close();
		closethepage();
	}

}
