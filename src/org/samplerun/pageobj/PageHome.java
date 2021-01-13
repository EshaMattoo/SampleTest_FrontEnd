package org.samplerun.pageobj;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.samplerun.baseclass.Base;
import org.samplerun.baseclass.Validate;

public class PageHome {

	public static ChromeDriver driver=Base.driver;

	Validate val=new Validate();
	public void initValidateHome() throws InterruptedException {

		String availableheder = Base.driver.findElement(By.xpath("//h1[contains(text(),'Top Questions')]")).getText();;
		String expectedheader = "Top Questions";
		val.compareresults(availableheder,expectedheader);

	}



}
