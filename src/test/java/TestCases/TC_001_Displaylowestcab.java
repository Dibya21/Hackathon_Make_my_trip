package TestCases;



import org.testng.annotations.Test;

import TestBase.BaseClass;
import pageObjects.Firstpage;

public class TC_001_Displaylowestcab extends BaseClass {
	
	@Test(priority=1, groups = {"regression","masters"})
	public void displaycab() throws InterruptedException {
		
		Firstpage fp = new Firstpage(driver);
		logger.info("***** Starting of the TC_001_Displaylowestcabtest ******");
		Thread.sleep(5000);
		logger.info("click in the city input box");
		fp.Fromcity();
		logger.info("inputing the city");
		fp.Inputcity();
		Thread.sleep(3000);
		logger.info("setting delhi as input city");
		fp.putcity();
		Thread.sleep(3000);
		logger.info("putting manali as destination ");
		fp.Tocity();
		Thread.sleep(3000);
		logger.info("clicking on the manali");
		fp.Outputcity();
		Thread.sleep(3000);
		logger.info("clicking on the calender option");
		fp.Departure();
		logger.info("date selecting");
	//	fp.calender();
		Thread.sleep(3000);
		fp.pickupdate();
		Thread.sleep(3000);
		logger.info("clicking on the time input box");
		fp.Pickuptime();
		Thread.sleep(3000);
		logger.info("selecting the hr ");
		fp.hrtime();
		Thread.sleep(3000);
		logger.info("selecting the min ");
		fp.mintime();
		Thread.sleep(3000);
		logger.info("clicking on the apply btn");
		fp.apply();
		Thread.sleep(3000);
		logger.info("clicking on the search btn");
		fp.search();
		Thread.sleep(3000);
		logger.info("clickig on the arrow btn");
		fp.arrow();
		Thread.sleep(3000);
		logger.info("selecting the price ltoh option");
		fp.sort();
		Thread.sleep(3000);
		logger.info("selecting the suv ");
		fp.suv();
		Thread.sleep(5000);
	
	}

}
