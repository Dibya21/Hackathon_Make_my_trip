package TestCases;

import org.testng.annotations.Test;

import pageObjects.Secondpage;

public class TC_002_Giftcards extends TC_001_Displaylowestcab {
  
	@Test(priority=2, groups = {"regression","masters"})
	
	public void giftcards() throws InterruptedException {
		Secondpage sp =new Secondpage(driver);
		System.out.println("yes");
		
		logger.info("*****Starting of the TC_002_Giftcards ******");	
		
//		Thread.sleep(4000);
		logger.info("clicking on dropdwn menu");
		sp.Arrow1(driver);
		Thread.sleep(3000);
	
	//	Thread.sleep(6000);
		logger.info("selecting gift card ");
		sp.selectgiftcard(driver);
		Thread.sleep(3000);
		logger.info("clicking on the desired giftcard");
		sp.Delivery();
		Thread.sleep(5000);
		logger.info("writing name on namebox");
		sp.name();
		Thread.sleep(3000);
		logger.info("writing name on sendername box");
		sp.sendername();
		Thread.sleep(3000);
		logger.info("mobile no input");
		sp.mobileno();
		Thread.sleep(3000);
		logger.info("sender mobile no input");
		sp.sendermobile();
		logger.info("email input");
		sp.email();
		Thread.sleep(3000);
		
		logger.info("sender email input");
		sp.senderemail();
		Thread.sleep(5000);
		logger.info("buy now option click");
		sp.buynow();
		Thread.sleep(3000);
		logger.info("to print error msg");
		sp.invalid(driver);
	}
		



}
