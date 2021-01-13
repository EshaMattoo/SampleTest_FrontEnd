package org.samplerun.pageobj;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.samplerun.baseclass.Base;
import org.samplerun.baseclass.Navigate;

public class PageTag {

	public static ChromeDriver driver=Base.driver;
	Navigate nav=new Navigate();

	public void navigateTagLink() {
		nav.click("//*[@id='nav-tags']");
	}


	public void ValidateQuestionCount() {
		int orgquestioncount=0;
		String finalorgquestioncount="";
		String finaltagname="";
		List<WebElement> totaltable = Base.driver.findElements(By.xpath("//*[@id='tags-browser']/div"));
		for (int i=1;i<totaltable.size();i++){
			String tagname = Base.driver.findElement(By.xpath("//*[@id='tags-browser']/div["+i+"]/div[1]/div/a")).getText();
			String questioncount="";
			try{
			boolean textele = Base.driver.findElement(By.xpath("//*[@id='tags-browser']/div["+i+"]/div[3]")).isDisplayed();
			if(textele){
				questioncount = Base.driver.findElement(By.xpath("//*[@id='tags-browser']/div["+i+"]/div[3]/div[1]")).getText().split("question")[0];
			}
			}catch(Exception e){
				questioncount = Base.driver.findElement(By.xpath("//*[@id='tags-browser']/div["+i+"]/div[2]/div[1]")).getText().split("question")[0];
			}


			System.out.println("Field validated : " + i);
			if(Integer.parseInt(questioncount.trim())>orgquestioncount){
				finalorgquestioncount = questioncount.toString();
				finaltagname = tagname;
				orgquestioncount=Integer.parseInt(questioncount.trim());
				System.out.println("Field validated : " + i);
			}
	}
		System.out.println("The max values on page are : " + finalorgquestioncount + " and tage name is : "+ finaltagname );
	}


	public void navigateNameLink() {
		nav.click("//*[@data-value='name']");

	}


}
