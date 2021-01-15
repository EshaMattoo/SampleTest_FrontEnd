package org.samplerun.main.ParallelTestTsng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class process1 {
	
	@DataProvider (name = "data-provider")
	public  Object[][] ReadData() {
		//return new Object[][]  {{"First-Value"},{"Second-Value"}};
		return new Object[][] {{2, 3 , 5}, {5, 7, 9}};
	}

	@BeforeTest
	public void something() {
		 long id = Thread.currentThread().getId();
		System.out.println("before test : " + id);
	}

	@BeforeClass
	public void setUp() {
		System.out.println("before");
	}

	@Test(groups = { "slow" }, priority = 1 , dataProvider = "data-provider")	
	//public void aFastTest(String bb) {
	public void aFastTest(int bb,int dd,int ds) {
		System.out.println("test1"+ bb);
		System.out.println("thread count : " + Thread.currentThread().getId());
	}

	@Test(groups = { "fast" }, priority = 0)
	public void bFastTest() {
		System.out.println("test0");
	}

	@AfterClass(groups = { "slow" })
	public void aSlowTest() {
		System.out.println("After");
	}

}
