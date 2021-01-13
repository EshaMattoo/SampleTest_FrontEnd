package org.samplerun.automationFramework;

import org.openqa.selenium.WebDriver;
import org.samplerun.baseclass.Base;
import org.samplerun.pageobj.PageHome;
import org.samplerun.pageobj.PageTag;
import org.testng.annotations.Test;

public class Tstngsamlefirsttest {
	static Base init=new Base();
	static PageHome Home=new PageHome();
	static PageTag Tag=new PageTag();
	static WebDriver driver;
  @Test
  public void f() throws InterruptedException {

	  /* Initailize the driver*/

		init.initbrowser();
		//Validate Home page
		Home.initValidateHome();
		//Navigate to tag page
		Tag.navigateTagLink();
		Tag.navigateNameLink();

		//Valiate the count of max questions
		Tag.ValidateQuestionCount();

		init.close();
  }
}
