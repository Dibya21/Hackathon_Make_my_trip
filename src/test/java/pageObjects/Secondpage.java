package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Secondpage extends BasePage{
	public WebDriver driver;
	
	public Secondpage(WebDriver driver ) {
		super(driver);
				
	}
	//@FindBy(xpath="//span[@class='darkGreyText']")
	@FindBy(xpath="//li[@class='menu_More moreItem']")
	WebElement arrow1;
	
	//@FindBy(xpath="//a[@class='appendBottom5 blackText'and text()='Giftcards']")
	@FindBy(xpath="//a[text()='Giftcards']")
	WebElement giftcards;
	
	@FindBy(xpath="(//li[@data-cy='SingleGiftCard_468'])[2]")
	WebElement selectgiftcard;
	
	@FindBy(xpath="//li[@data-cy='DeliveryModes_444'][2]")
	WebElement Delivery;
	
	@FindBy(xpath="//input[@data-cy='FormField_082' and @name='name']")
	WebElement name;
	
	@FindBy(xpath="//input[@data-cy='FormField_082' and @name='senderName']")
	WebElement sendername;
	
	@FindBy(xpath="//input[@data-cy='FormField_082' and @name='mobileNo']")
	WebElement mobileno;
	
	@FindBy(xpath="//input[@data-cy='FormField_082' and @name='senderMobileNo']")
	WebElement sendermobile;
	
	@FindBy(xpath="//input[@data-cy='FormField_082' and @name='emailId']")
	WebElement email;
	
	@FindBy(xpath="//input[@data-cy='FormField_082' and @name='senderEmailId']")
	WebElement senderemail;
	
	@FindBy(xpath="//button[@class='prime__btn font16 prime__btn__text']")
	WebElement buynow;
	
	@FindBy(xpath="(//p[@class='red-text font11 append-top5'])[1]")
	public	WebElement invalid;
	
	
	
	public void Arrow1(WebDriver driver) throws InterruptedException {
		Actions act = new Actions(driver);
//		Thread.sleep(3000);
		act.moveToElement(arrow1).moveToElement(giftcards).click().perform();
	}
//		arrow1.click();
//		
//		giftcards.click();
		//arrow1.click();
		
	
	
//	public void Giftcards() {
//		Giftcards.click();
//		
//	}
	
	public void selectgiftcard(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,350)");
		//js.executeScript("arguments[0].scrollIntoView();",selectgiftcard);
		js.executeScript("arguments[0].click();", selectgiftcard);
		
	
		
	}
	public void Delivery() {
		Delivery.click();
	
	}
	public void name() {
		String name1=" deepak";
		name.sendKeys(name1);
	}
	public void sendername() {
		String sendername1="Deb";
		sendername.sendKeys(sendername1);
	}
	public void mobileno() {
		String mobileno1="1234567890";
		mobileno.sendKeys(mobileno1);
	}
	public void sendermobile() {
		String mobileno2="0987654321";
		sendermobile.sendKeys(mobileno2);
		
	}
	public void email() {
		String email1="abc@dmailcom";
		email.sendKeys(email1);
	}
	
	public void senderemail() {
		String email2="dsaxmail.com";
		senderemail.sendKeys(email2);
		
	}
	public void buynow() {
		
		buynow.click();
	}
	public void invalid(WebDriver driver) {
		//invalid.getText();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100)");
		System.out.println(invalid.getText());
	}
}
