package mmt;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mmt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/cabs/");
		
//		WebElement dropdown=driver.findElement(By.id("fromCity"));
//		Select selectObject1 = new Select(dropdown);
//		
//		selectObject.selectByValue("Delhi");
//		
//		WebElement dropdown2=driver.findElement(By.id("toCity"));
//		Select selectObject2=new Select(dropdown2);
//		
//		selectObject.selectByValue("Manali, Himacha...");
//		
//		WebElement dropdown3=driver.findElement(By.id("departure"));
//		Select selectObject3=new Select(dropdown3);//input[@class='react-autosuggest__input react-autosuggest__input--open']
//		
//		Select selectObject4=new Select("Thu Mar 28 2024");
		
	/*	WebElement ele4 = driver.findElement(By.xpath("//p[@class='font14 appendBottom5 blackText' and text()='New Delhi, India']"));
		JavascriptExecutor js4 = (JavascriptExecutor)driver;
		js4.executeScript("arguments[0].scrollIntoView();", ele4);
		js4.executeScript("arguments[0].click();", ele4);
		
		/*String city = "Delhi";
		driver.findElement(By.xpath("//span[@class='cswInputLabel'][1]")).click();
		driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys(city);
		driver.findElement(By.xpath("//p[@class='font14 appendBottom5 blackText' and text()='New Delhi, India']")).click();
		*/
		//clicking on input box
		driver.findElement(By.xpath("//span[normalize-space()='From']")).click();
		// putting the data in dialog box
		//driver.findElement(By.xpath(""
		Thread.sleep(3000);
		String InputCity = "Delhi";
				//driver.findElement(By.xpath("//span[@class='cswInputLabel'][1]")).click();
				driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(InputCity);
				driver.findElement(By.xpath("////li[@id='react-autowhatever-1-section-0-item-0']//p[@class='font12 greyText appendBottom3'][normalize-space()='Indira Gandhi International Airport']")).click();		
		
		Thread.sleep(5000);
		String city1 ="Manali";
		//driver.findElement(By.id("toCity")).sendKeys("manali");
		driver.findElement(By.xpath("//input[@type='text' and @placeholder='To']")).sendKeys("manali");//inputbox
		//clicking on suggestion
		driver.findElement(By.xpath("//span[@class='sr_city blackText'and text()='Manali, Himachal Pradesh, India']")).click();
		driver.findElement(By.xpath("//span[@class='downArrow cswInputLabel'and text()='Departure']")).click();
		
		driver.findElement(By.xpath("//span[@class='downArrow cswInputLabel'and text()='Pickup-Time']")).click();
		driver.findElement(By.xpath("//span[@class='hrSlotItemChild'and text()='06  Hr']")).click();
		driver.findElement(By.xpath("//span[@class='minSlotItemChild'and text()='30  min']")).click();	
		driver.findElement(By.xpath("//span[@class='applyBtnText'and text()='APPLY']")).click();
		driver.findElement(By.xpath("//a[@data-cy='OutstationOneWayWidget_64' and text()='Search']")).click();
		driver.findElement(By.xpath("//span[@class='paddingLR8 maxSize12 arrow arrow-down-wide']")).click();
		driver.findElement(By.xpath("//div[@class='sortOptionUnit' ]")).click();
		
		Thread.sleep(5000);
		
		
		List<WebElement> list1 = driver.findElements(By.xpath("//p[@class='font28 latoBlack blackText ']"));
//		List<WebElement> list2 = driver.findElements(By.xpath("//span[@class='latoBlack font20 appendRight5']"));
		
		
		for(int i=0;i<list1.size();i++) {
			
			System.out.println(list1.get(i).getText());
		}
		//giftcards clicking
		driver.findElement(By.xpath("//span[@class='darkGreyText']")).click();
		driver.findElement(By.xpath("//a[@class='appendBottom5 blackText'and text()='Giftcards']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//click on wedding gift card
		WebElement ele = driver.findElement(By.xpath("(//li[@data-cy=\"SingleGiftCard_468\"])[5]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
		js.executeScript("arguments[0].click();", ele);
		driver.findElement(By.xpath("//li[@data-cy='DeliveryModes_444'][2]")).click();	
		
		//giftcard section
		driver.findElement(By.xpath("//input[@data-cy='FormField_082' and @name='name']")).sendKeys("deepak");
		driver.findElement(By.xpath("//input[@data-cy='FormField_082' and @name='senderName']")).sendKeys("Deb");
		driver.findElement(By.xpath("//input[@data-cy='FormField_082' and @name='mobileNo']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@data-cy='FormField_082' and @name='senderMobileNo']")).sendKeys("0987654321");
		
		//inputting wrong email id
		driver.findElement(By.xpath("//input[@data-cy='FormField_082' and @name='emailId']")).sendKeys("abc@dmailcom");
		driver.findElement(By.xpath("//input[@data-cy='FormField_082' and @name='senderEmailId']")).sendKeys("dsaxmail.com");
		
		Thread.sleep(5000);
		
		//clicking on buying now to show thta is invalid email
		WebElement ele1 =driver.findElement(By.xpath("//button[@data-cy='BookingDetails_440']"));
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("arguments[0].scrollIntoView();", ele1);
		js1.executeScript("arguments[0].click();", ele1);
		
		//capturing the error message
		System.out.println("Please enter a valid Email id.");
		System.out.println("Please enter a valid Email id.");
		//hotel booking
		
		driver.findElement(By.xpath("//span[@class='chNavIcon appendBottom2 chSprite chHotels']")).click();
		driver.findElement(By.xpath("//input[@data-cy='guest']")).click();
		
		driver.findElement(By.xpath("//button[@class='primaryBtn btnApplyNew pushRight capText']")).click();
		
		//List<WebElement> list3 = driver.findElements(By.xpath("//p[@class='font28 latoBlack blackText ']"));
		
		
		//driver.quit();
		
	}

}
