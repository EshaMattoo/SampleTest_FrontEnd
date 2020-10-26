package org.samplerun.pageobj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
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
