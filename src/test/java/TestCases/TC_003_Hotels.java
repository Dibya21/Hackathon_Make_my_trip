package TestCases;

import org.testng.annotations.Test;

import pageObjects.Thirdpage;

public class TC_003_Hotels extends TC_002_Giftcards {
	@Test(priority=3, groups = {"sanity", "regression","masters"})
	
	public void Hotels() throws InterruptedException {
		logger.info("*****Starting of the TC_003_Hotels ******");
		Thirdpage tp=new Thirdpage(driver);
		
		Thread.sleep(3000);
		logger.info("clicking on hotel");
		tp.Hotel(driver);
	//	Thread.sleep(3000);
		//tp.hotelbook();
	//	Thread.sleep(6000);
	//	tp.date();
//		Thread.sleep(3000);
		logger.info("selecting room option");
		tp.room();
		Thread.sleep(2000);
		tp.AdultAge();
		
		
		
		
	}
}
