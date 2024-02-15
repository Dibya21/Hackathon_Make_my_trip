package pageObjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Thirdpage extends BasePage {
	
	WebDriver driver;
	
	public Thirdpage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="(//span[@data-cy='item-wrapper'])[2]")
	WebElement hotel;
	//@FindBy (xpath="//input[@id='checkin']")
	//WebElement hotelbook;
//	@FindBy(xpath-" (//div[@class='DayPicker-Week'])")
	//WebElement date;
	@FindBy(xpath="//input[@id='guest']")
	WebElement room;
	
	@FindBy(xpath="//span[@data-testid='adult_count']")
	WebElement Age;
	
	@FindBy(xpath="//ul[@class='gstSlct__list']/li")
	public List<WebElement> adultage;
	
	public void Hotel(WebDriver driver) throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();", hotel);
		
		
		//hotel.click();
	}
//	
//		public void hotelbook() {
//		hotelbook.click();
//	}
//		public void date() {
//			date.click();
//		}
	
	public void room() {
		room.click();
	}
	public void AdultAge() throws InterruptedException {
		
		Age.click();
		Thread.sleep(5000);
		for(int i = 0;i<adultage.size();i++)
		{
			System.out.println(adultage.get(i).getText());
		}
	}
}
