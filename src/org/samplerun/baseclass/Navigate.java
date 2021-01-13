package org.samplerun.baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Navigate {

	public static ChromeDriver driver;



	public void click(String xpathtext) {
		WebElement obj = Base.driver.findElement(By.xpath(xpathtext));
		obj.click();
		Base.WebDriverWait(5);
	}


}
