package org.samplerun.baseclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

	public static ChromeDriver driver;

	WebDriverWait wait;
	public void initbrowser() throws InterruptedException {
		 String exePath = (".\\Data\\Driver\\chromedriver.exe");
		 System.setProperty("webdriver.chrome.driver",exePath);
		 driver = new ChromeDriver();

		 // Go to URL and maximize the window and wait for page to load
		 driver.get("https://stackoverflow.com/");
		 driver.manage().window().maximize();
		 WebDriverWait(30);
	}

	//This is a standard wait
	public static void WebDriverWait(int waittime) {
		try {
			Thread.sleep(waittime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//Conditioanl wait
	public void Conditionalwait(ExpectedCondition<WebElement> condition ){

		WebDriverWait wait = new WebDriverWait(driver, 30);
		 wait.until(condition);

	}

	public void close() {
		driver.close();

	}


}
