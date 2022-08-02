package com.AddactinProject;



	

	import java.io.File;
	import java.io.IOException;
	import java.time.Duration;
	import java.util.List;

	import org.apache.commons.io.FileUtils;
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
	

	public class BaseClass {
		// 1.browser launch
		public static WebDriver driver;

		public static WebDriver browserLaunch(String browser) {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\SANGEETHA\\Desktop\\now\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("Firefox")) {
				System.setProperty("webdriver.gecko.driver", "D:\\2021\\mavenProject\\Driver\\chromedriver.exe");
				driver = new FirefoxDriver();
			} else {
				System.out.println("invalid browser");
			}

			//driver.manage().window().maximize();
			return driver;
		}

		// 2.click method
		public static void clickonButton(WebElement ele) {
			ele.click();
		}

		// 3.send keys method
		public static void entervalue(WebElement ele, String value) {
			ele.sendKeys(value);
		}

		// 4.close
		public static void closethepage() {
			driver.close();
		}

		// 5.quit
		public static void closeallthepage() {
			driver.quit();
		}

		// 6.get
		public static void openurl(String url) {
			driver.get(url);
		}

		// 7.navigate to
		public static void navigatetourl(String url) {
			driver.navigate().to(url);
		}

		// 8.navigate back
		public static void navigateback() {
			driver.navigate().back();
		}

		// 9.navigate forward
		public static void navigateforward() {
			driver.navigate().forward();
		}

		// 10.navigate refresh
		public static void refresh() {
			driver.navigate().refresh();
		}

		// 11.accept alert

		public static void alertaccept() {
			driver.switchTo().alert().accept();
		}

		// 12.get current url
		public static String currenturl() {
			return driver.getCurrentUrl();
		}

		// 13.get title
		public static String getTitle() {
			return driver.getTitle();
		}

		// 14.get text
		public static String getText(WebElement ele) {
			String a = ele.getText();
			return a;
		}

		// 15.is multiple

		public static void ismultiple(WebElement ele) {
			Select s = new Select(ele);
			boolean val = s.isMultiple();
			System.out.println("is multiple?" + val);
		}

		// 16.is selected
		public static void isselected(WebElement ele) {
			boolean val = ele.isSelected();
			System.out.println("is selected?" + val);
		}

		// 17.is enabled
		public static void isenabled(WebElement ele) {
			boolean val = ele.isEnabled();
			System.out.println("is enebled?" + val);
		}

		// 18.is displayed
		public static void isdisplayed(WebElement ele) {
			boolean val = ele.isDisplayed();
			System.out.println("is displayed?" + val);
		}

		// 19.scroll down
		public static void scrollbby(int x, int y) {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(x,y);");

		}

		// 20.screenshot

		public static void screenshot(String name) throws IOException {
			TakesScreenshot sr = (TakesScreenshot) driver;
			File source = sr.getScreenshotAs(OutputType.FILE);
			File dest = new File(name);
			FileUtils.copyFile(source, dest);
			System.out.println("SC Taken");
		}

		// 21.dismiss alert

		public static void alertdismiss() {
			driver.switchTo().alert().dismiss();
		}

		// 22.prompt alert
		public static void promptalert(String a, String val) {
			driver.switchTo().alert().sendKeys(val);
			if (a.equalsIgnoreCase("ok"))
				driver.switchTo().alert().accept();
			else if (a.equalsIgnoreCase("cancel"))
				driver.switchTo().alert().dismiss();
		}

		// 23.implicit wait
		public static void wait(int a) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(a));

		}

		// 24.Actions

		public static void hover1(WebElement uff) {
			Actions a = new Actions(driver);
			a.moveToElement(uff).build().perform();

		}
		
		// double click
			public static void Doubleclickkk(WebElement element) {
				Actions ac1 = new Actions(driver);
				ac1.doubleClick(element).build().perform();
			}

			// click
			public static void clickkk(WebElement element) {
				Actions ac2 = new Actions(driver);
				ac2.click(element).build().perform();
			}

			// right click

			public static void rightclick(WebElement element) {
				Actions ac3 = new Actions(driver);
				ac3.contextClick(element).build().perform();

			}

			// drag and drop
			public void dragdrop(WebElement element1, WebElement element2) {

				Actions ac = new Actions(driver);
				ac.dragAndDrop(element1, element2).build().perform();

			}

		
		// scroll
		
			public static void scroll(WebElement elements) {
				try {
					JavascriptExecutor je = (JavascriptExecutor) driver;
					je.executeScript("arguments[0].scrollIntoView();", elements);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			// drop down

			public static void dropdown(WebElement element, String value, String i) {
				Select s = new Select(element);

				if (value.equalsIgnoreCase("index")) {

					s.selectByIndex(Integer.parseInt(i));
				} else if (value.equalsIgnoreCase("value")) {

					s.selectByValue(value);

				}

				else if (value.equalsIgnoreCase("text")) {
					s.selectByVisibleText(value);
				}
			}

			
			// get Attribute

			public static void getAttribute(WebElement element) {
				try {
					String attribute = element.getAttribute("Value");
					System.out.println(attribute);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}


			// radio button

			public static void radiobutton(WebElement element) {
				try {
					element.click();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			// get options

			public static void getoptions(WebElement element) {
				Select y = new Select(element);
				List<WebElement> options = y.getOptions();
				for (WebElement y1 : options) {
					System.out.println(y1.getText());
				}
			}

			
			// first selected option

			public static void firstSelectedOp(WebElement element) {
				Select y = new Select(element);
				WebElement firstSelectedOption = y.getFirstSelectedOption();
				System.out.println(firstSelectedOption.getText());
			}

			// i-Frames

			public void iframes(WebElement elements) {
				driver.switchTo().frame(elements);

			}

			// explicit wait

		/*	public static void waitforvisibilityofelment(WebElement element) {

				try {
					WebDriverWait wb = new WebDriverWait(driver, 30);
					wb.until(ExpectedConditions.visibilityOf(element));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
*/
	


			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}


