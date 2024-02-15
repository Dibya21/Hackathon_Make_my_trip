package pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Firstpage extends BasePage {
	WebDriver driver;
	
	public Firstpage(WebDriver driver) {
		super(driver);
	}
	
	//@FindBy(xpath="//input[@class='react-autosuggest__input react-autosuggest__input--open']")
	//WebElement Fromcity;
	
	@FindBy(xpath="//span[normalize-space()='From']")
	WebElement Fromcity;
	
	@FindBy(xpath="//input[@placeholder='From']")
	WebElement InputCity;
	
	@FindBy(xpath="//ul[@class=\"react-autosuggest__suggestions-list\"]/li[1]")
	WebElement putcity;
	
	@FindBy(xpath="//input[@type='text' and @placeholder='To']")
		WebElement Tocity;
	
	@FindBy(xpath="//ul[@class=\"react-autosuggest__suggestions-list\"]/li[1]")
		WebElement Outputcity;
	
	@FindBy(xpath="(//span[@class='downArrow cswInputLabel'])[1]")
		WebElement Departure;
	
	//@FindBy(xpath="//div[@class='DayPicker-Months']")
		//WebElement calender;
	@FindBy(xpath="//div[@class='DayPicker-Caption']/div")
		List<WebElement> Month;
	
	@FindBy(xpath="//div[@aria-label='Thu Apr 11 2024']")
	WebElement day;
	
	@FindBy(xpath="//span[@aria-label='Next Month']")
	    WebElement clickNext;
	
	@FindBy(xpath="//span[@class='downArrow cswInputLabel'and text()='Pickup-Time']")
		WebElement Pickuptime;
	
	@FindBy(xpath="(//li[@class ='hrSlotItemParent'])[7]")
		WebElement hrtime;
	
	@FindBy(xpath="//span[@class='minSlotItemChild'and text()='30  min']")
		WebElement mintime;
	
	@FindBy(xpath="//span[@class='applyBtnText'and text()='APPLY']")
		WebElement apply;
	
	@FindBy(xpath="//a[@data-cy='OutstationOneWayWidget_64' and text()='Search']")
		WebElement search;
	@FindBy(xpath=" //span[@class='paddingLR8 maxSize12 arrow arrow-down-wide']")
	WebElement arrow;
	
	@FindBy(xpath="//div[@class='sortOptionUnit' ]")
	WebElement sort;
	
	@FindBy(xpath="//label[contains(text(),'SUV')]")
	WebElement suv;
	
	
	
	
	
	public void Fromcity() {
		Fromcity.click();
	}
	
	public void Inputcity() {
		String city = "Delhi";
		InputCity.sendKeys(city);
		//InputCity.click();
	}
	
	public void putcity() {
		putcity.click();
		
	}
	
	public void Tocity() {
		String city1 ="Manali";
		Tocity.sendKeys(city1);
		
	}
	
	public void Outputcity() {
		Outputcity.click();
	}
	
	public void Departure() {
		Departure.click();
	}
	
	//]public void calender() {
		//WebDriverWait wait = new WebDriverWait (driver, Duration. ofSeconds(10));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='DayPicker-Months']")));
//	}
	
	public void Pickuptime() {
		Pickuptime.click();
	
	}
	
	public void hrtime() {
		hrtime.click();
	}
	
	public void mintime() {
		mintime.click();
	}
	
	public void apply() {
		apply.click();
	}
	
	public void search() {
		search.click();
	}
	
	public void arrow() {
		arrow.click();
		
	}
	
	public void sort() {
		sort.click();
		
	}
	
	public void suv() {
		suv.click();
		
	}
	
//	String aMonth = Month.get(0).getText();
//	String sMonth = Month.get(1).getText();
//	
	
	public void  pickupdate () {
//		

		
for(int i=0;i<3;i++) {
		
		if((Month.get(0).getText()).equals("April 2024")) {
			day.click();
			break;
		}
		
		else if((Month.get(1).getText()).equals("April 2024")) {
//			clickNext.click();
			day.click();
			break;
		}
		
		else {
//			System.out.println("Month not found");
			clickNext.click();
		}
}	
//			
//		}
		
		
		
	}
	
}
