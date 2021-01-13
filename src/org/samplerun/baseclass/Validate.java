package org.samplerun.baseclass;

import org.openqa.selenium.chrome.ChromeDriver;

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
