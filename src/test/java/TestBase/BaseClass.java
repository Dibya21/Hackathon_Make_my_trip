package TestBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;
 
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;
 
 
public class BaseClass {
	public WebDriver driver;
	public Logger logger;
	public Properties p;
 
	@BeforeTest
	@Parameters({"os" , "browser"})
	public void setUp(String os , String br) throws IOException {
		// Loading properties file
		FileReader file = new FileReader(".//src//test//resources//config.properties");
		p = new Properties();
		p.load(file);
		// Loading log4j file
		logger = LogManager.getLogger(this.getClass());
		
		if(p.getProperty("execution_env").equalsIgnoreCase("remote")) {
			DesiredCapabilities capabilities=new DesiredCapabilities();
			//os
			if(os.equalsIgnoreCase("windows"))
			{
				capabilities.setPlatform(Platform.WIN11);
			}
			else if(os.equalsIgnoreCase("mac"))
			{
				capabilities.setPlatform(Platform.MAC);
			}
			else {
				System.out.println("No matching os");
				return;
			}
			//browser
			switch(br.toLowerCase()) {
			case "chrome":capabilities.setBrowserName("chrome");
			break;
			case "edge":capabilities.setBrowserName("MicrosoftEdge");
			break;
			default: System.out.println("No matching browser");
			return;
		}
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
		}
		else if(p.getProperty("execution_env").equalsIgnoreCase("local")) {
			// Locally
			switch(br.toLowerCase()) {
			case "chrome":driver=new ChromeDriver();
			break;
			case "edge":driver=new EdgeDriver();
			break;
			default: System.out.println("No matching browser");
			return;
			}
		}
		
		// Launching browser based on choice
		if(br.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if(br.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}else {
			System.out.println("No matching browser");
			return;
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(p.getProperty("PageURL"));
	}
	@AfterTest
	public void tearDown() {
	//	driver.quit();
	}
	
	public String captureScreen(String scName) throws IOException {
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String filePath = System.getProperty("user.dir")+"\\screenshots\\"+scName+"-"+ timeStamp+".png";
		File trg = new File(filePath);
		src.renameTo(trg);
//		FileUtils.copyFile(src, trg);
		return filePath;
	}
}
 


