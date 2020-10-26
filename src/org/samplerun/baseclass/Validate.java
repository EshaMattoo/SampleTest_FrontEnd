package org.samplerun.baseclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Validate {

	public static ChromeDriver driver;

	public void compareresults(String availableheder, String expectedheader) {
		if(availableheder.equals(expectedheader)){
			System.out.println("The expected results and actual results match");
		}else{
			System.out.println("The expected results and actual results dont match");
		}

	}


}
